package Modelo;
import java.sql.*;

public class Database {
    /* DATOS PARA LA CONEXION */
  /** base de datos por defecto es test*/
  private String db = "GW2CB";
  /** usuario */
  private String user = "admin";
  /** contraseña de MySql*/
  private String password = "raspiroot";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://85.136.81.194/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  private Connection conn = null;

   /** Constructor de clase */
   public Database(){
        this.url = "jdbc:mysql://85.136.81.194/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection( this.url, this.user , this.password );         
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }


   public Connection getConexion()
   {
    return this.conn;
   }
}
