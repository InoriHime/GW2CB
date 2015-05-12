
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ModeloPrincipal extends Database{
    
    /*Constructor de la clase*/
    public ModeloPrincipal(){}
    
    /** Obtiene registros de la tabla Personajes y los devuelve en un DefaultTableModel*/
    public DefaultTableModel getTablaPersonaje()
    {
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Nombre Personaje","Cuenta","Clase","Nivel Fractales","Resis. Agonía","Clan","Idiomas"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as total FROM Personajes");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][7];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NomPj,Cuenta,Clase FROM Personajes");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
             PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT NivFractales,IdiomaIngles,IdiomaEspañol,IdiomaFrances,IdiomaAleman FROM Cuentas C,Personajes P WHERE Cuenta=NomCuenta");
             ResultSet res1 = pstm.executeQuery();
             PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT Clan FROM Clan-Cuenta ,Cuentas WHERE NomCuenta=Cuenta");
             ResultSet res2 = pstm.executeQuery();
             String cad = "";
             if(res1.getBoolean("IdiomaIngles")){
                 cad.concat("EN, ");
             }
             if(res1.getBoolean("IdiomaEspañol")){
                 cad.concat("ES, ");
             }
             if(res1.getBoolean("IdiomaFrances")){
                 cad.concat("FR, ");
             }
             if(res1.getBoolean("IdiomaAleman")){
                 cad.concat("GR");
             }
             
                data[i][0] = res.getString( "NomPj" );
                data[i][1] = res.getString( "Cuenta" );
                data[i][2] = res.getString( "Clase" );
                data[i][3] = res1.getString( "Nivfractales" );
                data[i][4] = res.getString( "p_cantidad" );
                data[i][5] = res2.getString("Clan");
                data[i][6] = "cad";
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
}
