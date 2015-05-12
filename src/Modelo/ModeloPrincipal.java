package Modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ModeloPrincipal extends Database{
    Database db=null;
    /*Constructor de la clase*/
    public ModeloPrincipal(){
        db = new Database();
    }
    
    /** Obtiene registros de la tabla Personajes y los devuelve en un DefaultTableModel*/
    public DefaultTableModel getTablaPersonaje()
    {
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Personaje","Cuenta","Clase","Niv. Fractales","R. Agonía","Clan","Idiomas"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      
      Statement stmt=null;
      Statement stmt1=null;
      Statement stmt2=null;
      Statement stmt3=null;
      Statement stmt4=null;
      try{     

         stmt= db.getConexion().createStatement();
         stmt1= db.getConexion().createStatement();
         stmt2= db.getConexion().createStatement();
         stmt3= db.getConexion().createStatement();
         stmt4= db.getConexion().createStatement();
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
         ResultSet res = stmt.executeQuery("SELECT NomPj,Cuenta,NomClase, Clase FROM Personajes, Clases WHERE ID_Clase=Clase");
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("NomPj");
                data[i][1] = res.getString("Cuenta");
                data[i][2] = res.getString("NomClase");
               System.out.println("Insertados personaje, cuenta y clase");
                ResultSet res1 = stmt1.executeQuery("SELECT NivFractales,IdiomaIngles,IdiomaEspañol,IdiomaFrances,IdiomaAleman FROM Cuentas,Personajes WHERE NomCuenta='"+data[i][1]+"'");
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
               System.out.println(cad + "Insertadonivel de fractales");
                
                ResultSet res3 = stmt3.executeQuery("SELECT getAgonia('"+data[i][1]+"') as Agonia");
                res3.next();
                data[i][4] = res3.getString("Agonia");
                
                System.out.println("Insertado ar");
                
                try{
                ResultSet res2 = stmt2.executeQuery("SELECT Clan FROM Clan_Cuenta WHERE Cuenta='"+data[i][1]+"'");
                res2.next();
                data[i][5] = res2.getString("Clan");
                res2.close();
                System.out.println("Insertado clan");
                }catch(Exception e){
                data[i][5] = "-";
                System.out.println("Insertado clan");
                }
                
            i++;
            
         }
         
         for(int j=0; i<registros;i++){
             for (int k=0; k<7;i++){
                 System.out.println(data[j][k]);
             }
         }
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println(e.getMessage() );
        }
        return tablemodel;
    }
}
