package Controlador;
import Modelo.ModeloLogin;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorLogin implements ActionListener{
    
    Login vista;
    ModeloLogin modelo = new ModeloLogin();

    
    
    /** Se declaran en un ENUM las acciones que se realizan desde la
     * interfaz de usuario VISTA y posterior ejecución desde el controlador
     */
    public enum AccionMVC {
        Aceptar,
        Cancelar,
        Login,
        Registro
    }
    
    /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public ControladorLogin( Login vista ){
        this.vista = vista;
    }
    
     /** Inicia el skin y las diferentes variables que se utilizan */
    public void iniciar(){
        ArrayList<String> servidores = this.modelo.getServidores();
        
        // Skin tipo WINDOWS
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            SwingUtilities.updateComponentTreeUI(vista.Registro);
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
         vista.combServidor.setModel(new DefaultComboBoxModel(servidores.toArray()));
        
        
        this.vista.btnAceptar.setActionCommand("Aceptar");
        this.vista.btnAceptar.addActionListener(this);
        this.vista.btnCancelar.setActionCommand("Cancelar");
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnLogin.setActionCommand("Login");
        this.vista.btnLogin.addActionListener(this);
        this.vista.btnRegistro.setActionCommand("Registro");
        this.vista.btnRegistro.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case Aceptar:
                int[] idiomas={0,0,0,0};
                if(this.vista.chkIngles.isSelected()){
                    idiomas[0]=1;
                }
                if(this.vista.chkEspanol.isSelected()){
                    idiomas[1]=1;
                }
                if(this.vista.chkFrances.isSelected()){
                    idiomas[2]=1;
                }
                if(this.vista.chkAleman.isSelected()){
                    idiomas[3]=1;
                }
                this.modelo.NuevoUsuario(this.vista.txtCuenta.getText(), 
                                         this.vista.txtEmail.getText(), 
                                         Integer.parseInt(this.vista.txtNivelFrac.getText()),
                                         String.valueOf(this.vista.txtContrasena.getPassword()),
                                         String.valueOf(this.vista.txtRepeContrasena.getPassword()),
                                         this.vista.combServidor.getSelectedItem().toString(),
                                         idiomas);
                break;
            case Cancelar:
                this.vista.Registro.setVisible(false);
                this.vista.setVisible(true);
                break;
            case Login:
                
                break;
            case Registro:
                this.vista.Registro.setAlwaysOnTop(true);
                this.vista.Registro.setVisible(true);
                this.vista.setVisible(false);
                break;
        }
    }
}
