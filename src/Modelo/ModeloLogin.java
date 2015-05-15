package Modelo;
import java.sql.*;
import java.util.ArrayList;

public class ModeloLogin extends Database{
    Database db=null;
    /* Constructor de clase */
    public ModeloLogin (){
        db = new Database();
    }
    
    /* Registra un nuevo usuario*/
    public boolean NuevoUsuario(String usuario, String email, int nivFrac, String contrasenya, String repeContrasenya,
            String servidor, int[] idiomas){
        int idservidor = this.getIdServidor(servidor);//valida_datos(usuario, email, nivFrac, contrasenya, repeContrasenya)
        if(true){
            //Se arma la consulta
            String q=" INSERT INTO Cuentas ( NomCuenta , NivFractales , Email, Contraseña, Servidor, IdiomaIngles"
                    + ",IdiomaEspañol, IdiomaFrances, IdiomaAleman) "
                    + "VALUES ( '" + usuario + "','" + nivFrac + "', '" + email + "', '" + contrasenya + "',"
                    + "'" + idservidor + "', '" + idiomas[0] + "', '" + idiomas[1] + "', '" + idiomas[2] + "',"
                    + "" + idiomas[3] + " ) ";
            //se ejecuta la consulta
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
            return false;
        }
        else
         return false;
    }
    
    /* Metodo  para validar datos */
    private boolean valida_datos(String usuario, String email, int nivFrac, String contrasenya, String repeContrasenya)
    {
        boolean usuarioCorrecto=usuario.matches("[a-zA-Z\\s]{3,20}'.'[\\n]{4}");
        boolean emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+")&&email.length()<=40;
        if(usuarioCorrecto&&emailCorrecto){
           if(contrasenya.length()>=6&&contrasenya.length()<=20){
               if(contrasenya.equals(repeContrasenya)){
                   if(nivFrac>0&&nivFrac<51){
                    return true;
                }
               }
                
           }else{
               return false;
           }
        }else{
            return false;
        }
        return false;
    }
    
    
    public ArrayList<String> getServidores(){
        Statement stmt=null;
        ArrayList<String> servidores = new ArrayList<>();
        //Consulta
        String q="SELECT NomServidor FROM Servidores";
        
         try {
                stmt=db.getConexion().createStatement();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
         try {
             ResultSet res = stmt.executeQuery(q);
             while(res.next()){
                 servidores.add(res.getString("NomServidor"));
             }
             return servidores;
         }catch(SQLException e){
            System.err.println(e.getMessage() );
        }
         return null;
    }
    
    public int getIdServidor(String Servidor){
         Statement stmt=null;
         int idServ;
         String q="SELECT Id_Servidor FROM Servidores WHERE NomServidor='"+Servidor+"'";
         try {
                stmt=db.getConexion().createStatement();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
         
         try{
             ResultSet res = stmt.executeQuery(q);
             res.next();
             idServ=res.getInt("Id_Servidor");
             System.out.println(idServ);
             return idServ;
             
         }catch(SQLException e){
            System.err.println(e.getMessage() );
        }
         return 0;
    }
    
}
