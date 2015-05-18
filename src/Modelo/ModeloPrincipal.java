package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ModeloPrincipal extends Database{
    Database db=null;
    /*Constructor de la clase*/
    public ModeloPrincipal(){
        db = new Database();
    }
    
    /** Obtiene registros de la tabla Personajes y los devuelve en un DefaultTableModel*/
    public DefaultTableModel getTablaPersonaje() {
      DefaultTableModel tablemodel = new DefaultTableModel(){
          @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
         }
      };
      int registros = 0;
      String[] columNames = {"Personaje","Cuenta","Clase","Niv. Fractales","R. Agonía","Clan","Idiomas"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      
      Statement stmt=null;
      Statement stmt1=null;
      Statement stmt2=null;
      Statement stmt3=null;               
      try{     

         stmt= db.getConexion().createStatement();
         stmt1= db.getConexion().createStatement();
         stmt2= db.getConexion().createStatement();
         stmt3= db.getConexion().createStatement();
         ResultSet res= stmt.executeQuery("SELECT count(*) as total FROM Personajes");
         res.next();
         registros = res.getInt("total");
         
      }catch(SQLException e){
         System.err.println(e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][7];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
          
          //Recogemos los datos a mostrar de personajes y el nombre de sus clases
         ResultSet res = stmt.executeQuery("SELECT NomPj,Cuenta,NomClase, Clase FROM Personajes, Clases WHERE ID_Clase=Clase");
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("NomPj");
                data[i][1] = res.getString("Cuenta");
                data[i][2] = res.getString("NomClase");
                ResultSet res1 = stmt1.executeQuery("SELECT NivFractales,IdiomaIngles,IdiomaEspañol,IdiomaFrances,IdiomaAleman FROM Cuentas WHERE NomCuenta='"+data[i][1]+"'");
                    res1.next();
                    data[i][3] = res1.getString("Nivfractales");
                
                String cad = "";
                    if(res1.getBoolean("IdiomaIngles")){
                        cad=cad.concat("[EN]");
                    }
                    if(res1.getBoolean("IdiomaEspañol")){
                        cad=cad.concat("[ES]");
                    }
                    if(res1.getBoolean("IdiomaFrances")){
                        cad=cad.concat("[FR]");
                    }
                    if(res1.getBoolean("IdiomaAleman")){
                        cad=cad.concat("[GER]");
                    }
                data[i][6] = cad;
                
                ResultSet res3 = stmt3.executeQuery("SELECT getAgonia('"+data[i][0]+"') as Agonia");
                res3.next();
                
                data[i][4] = res3.getString("Agonia");
                if(data[i][4]==null){
                    data[i][4]="0";
                }
                
                
                
                try{
                ResultSet res2 = stmt2.executeQuery("SELECT Clan FROM Clan_Cuenta WHERE Cuenta='"+data[i][1]+"'");
                res2.next();
                data[i][5] = res2.getString("Clan");
                res2.close();
                }catch(Exception e){
                data[i][5] = "-";
                }
                
            i++;
            
         }
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println(e.getMessage() );
        }
      
        return tablemodel;
    }
    
    //Devuelve los datos principales de la cuenta de la que se pasa el nombre por parámetro
    public Object[] getDatosCuenta(String cuenta){
        Object[] datosCuenta=new Object[9];
        Statement stmt=null;
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT * FROM Cuentas WHERE NomCuenta ='"+cuenta+"'");
            res.next();
            datosCuenta[0]=res.getString("NomCuenta");
            datosCuenta[1]=res.getString("Email");
            datosCuenta[2]=res.getString("Contraseña");
            datosCuenta[3]=res.getInt("NivFractales");
            datosCuenta[4]=res.getInt("Servidor");
            datosCuenta[5]=res.getInt("IdiomaIngles");
            datosCuenta[6]=res.getInt("IdiomaEspañol");
            datosCuenta[7]=res.getInt("IdiomaFrances");
            datosCuenta[8]=res.getInt("IdiomaAleman");
            
            return datosCuenta;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    
    //Devuelve los datos de los personajes de la cuenta que se pasa por parametro
    public ArrayList<Personaje> getPersonajesCuenta(String cuenta){
       ArrayList<Personaje> personajes=new ArrayList<>();
       Personaje p;
        Statement stmt=null;
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT * FROM Personajes WHERE Cuenta ='"+cuenta+"'");
            while(res.next()){
            p= new Personaje();
            p.setNombre(res.getString("NomPj"));
            p.setCuenta(res.getString("Cuenta"));
            p.setRaza(res.getInt("Raza"));
            p.setClase(res.getInt("Clase"));
            
            personajes.add(p);
            }

            return personajes;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //Cambia los iconos de la derecha con los items equipados al pasarle por parámetro un nombre de personaje
    public int piezaEquipada(String personaje, int slot){
        Statement stmt=null;
        int tiene;
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT count(*) as Tiene FROM Pj_Armaduras WHERE NomPj ='"+personaje+"' AND SlotArmadura="+slot);
            res.next();
            tiene = res.getInt("Tiene");
            return tiene;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    //Devuelve el tipo de arma deñl pj y slop pasados por parametro
    public int armaEquipada(String personaje, int slot){
        Statement stmt=null;
        int tipo;
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT TipoArma as Tipo FROM Pj_Armas WHERE NomPj ='"+personaje+"' AND SlotArma="+slot);
            res.next();
            tipo = res.getInt("Tipo");
            return tipo;

        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public ArrayList<Arma> setArmas(String personaje){
        ArrayList<Arma> armas = new ArrayList<Arma>();
        Statement stmt=null;
        
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select SlotArma,TipoArma, Rareza, Poder, Dureza, Vitalidad, M.`Precision`, Ferocidad, DañoCondicion, PoderCuracion, InfSimple1, InfSimple2 \n" +
                                    "from Pj_Armas as PJ, Modificadores as M \n" +
                                    "WHERE M.ID_Mod = PJ.Modificador AND PJ.NomPj = '"+personaje+"'");
           while(res.next()){
               armas.add(new Arma(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getInt(5),res.getInt(6),res.getInt(7),res.getInt(8),res.getInt(9),res.getInt(10),res.getInt(11),res.getInt(12)));
           }

        } catch (SQLException ex) {
        ex.printStackTrace();
        }
        
        return armas;

    }
    
    public ArrayList<Armadura> setArmaduras(String personaje){
        ArrayList<Armadura> armaduras = new ArrayList<>();
        Statement stmt=null;
        
        try{
            stmt= db.getConexion().createStatement();
            
        }catch(SQLException e){
         System.err.println(e.getMessage() );
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select SlotArmadura, Rareza, Poder, Dureza, Vitalidad, M.`Precision`, Ferocidad, DañoCondicion, PoderCuracion, InfSimple, InfAgonia\n" +
                                    "from Pj_Armaduras as PJ, Modificadores as M WHERE M.ID_Mod = PJ.Modificador PJ.NomPj = '"+personaje+"'");
           while(res.next()){
               armaduras.add(new Armadura(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getInt(5),res.getInt(6),res.getInt(7),res.getInt(8),res.getInt(9),res.getInt(10),res.getInt(11)));
           }

        } catch (SQLException ex) {
        ex.printStackTrace();
        }
        
        
        
        return armaduras;

    }
    
}
