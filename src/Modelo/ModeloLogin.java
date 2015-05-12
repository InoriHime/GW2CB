package Modelo;
import java.sql.*;

public class ModeloLogin extends Database{
    /* Constructor de clase */
    public ModeloLogin (){}
    
    /* Registra un nuevo usuario*/
    public boolean NuevoUsuario(String usuario, String email, int nivFrac, String contrasenya,
            String servidor, String[] idiomas)
    {
        if(valida_datos(usuario, email, nivFrac, contrasenya, servidor, idiomas)){
            //Se arma la consulta
            String q=" INSERT INTO Cuentas ( NomCuenta , NivFractales , Email, Contraseña, Servidor, IdiomaIngles"
                    + ",IdiomaEspañol, IdiomaFrances, IdiomaAleman) "
                    + "VALUES ( '" + usuario + "','" + nivFrac + "', '" + email + "', '" + contrasenya + "',"
                    + "'" + servidor + "', '" + idiomas[0] + "', '" + idiomas[1] + "', '" + idiomas[2] + "',"
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
    private boolean valida_datos(String usuario, String email, int nivFrac, String contrasenya, String servidor, String[] idiomas)
    {
        boolean usuarioCorrecto=usuario.matches("[a-zA-Z\\s]{3,20}'.'[\\n]{4}");
        boolean emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        if(usuarioCorrecto&&emailCorrecto){
           if(contrasenya.length()>=6&&!servidor.equals("")){
               if(idiomas[0].equals("")&&idiomas[1].equals("")&&idiomas[2].equals("")&&idiomas[3].equals("")){
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
}
