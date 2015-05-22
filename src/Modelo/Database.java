package Modelo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.StringTokenizer;

public class Database {
    /* DATOS PARA LA CONEXION */
  /** base de datos por defecto es test*/
  private String db = "GW2CB";
  /** usuario */
  private String user = "root";
  /** contraseña de MySql*/
  private String password = "toor";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://85.136.81.194/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  private Connection conn = null;
  
  File f = new File("src/Modelo/db.data");

   /** Constructor de clase */
   public Database(){
       
       try{
           this.getDatosConexion();
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


   public Connection getConexion(){
    return this.conn;
   }
   
   public String[] getDatosConexion(){
        FileInputStream fis=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        int tam;
        char c;
        String cad="";
        String tok;
        String[] datos = new String[4];
        
        try{
            fis = new FileInputStream(f);
            tam = fis.available();
            for(int i = 0;i<tam;i++){
                c=(char)fis.read();
                cad+=c;		
            }	
        }catch(IOException e){
        e.printStackTrace();
        System.out.println("err");
        }
        
        StringTokenizer st = new StringTokenizer(cad,"\n");
        int i = 0;
	     while (st.hasMoreTokens()) {
	         datos[i] = st.nextToken();
	         i++;
	     }
             
        this.db=datos[0];
        this.user=datos[1];
        this.password=datos[2];
        this.url="jdbc:mysql://"+datos[3]+"/"+db;
        
        return datos;
        
   }
}
