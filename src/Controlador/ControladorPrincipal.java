package Controlador;

/* Importamos el modelo y la interfaz*/
import Modelo.Cuenta;
import Modelo.ModeloPrincipal;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ControladorPrincipal{
    /** instancia a nuestra interfaz de usuario*/
    VentanaPrincipal vista;
    /** instancia a nuestro modelo */
    ModeloPrincipal modelo = new ModeloPrincipal();
    //Usuario de sesion
    Cuenta usuario;
    //Array para almacenar temporalmente los datos de usuario con el fin de pasarlos como parametro en el constructur del usuario
    Object[] datosUsuario = new Object[9];
    //Almacenamiento del nombre de usuario de sesion pasado como parametro en el contructor
    String usu;
    //Array de personajes
    ArrayList <Personaje> personajes = new ArrayList<>();
    //Array de nombres de personajes para mostrar
    ArrayList<String> nomPjs = new ArrayList<>();
    
    /** Se declaran en un ENUM las acciones que se realizan desde la
     * interfaz de usuario VISTA y posterior ejecución desde el controlador
     */
    
    public enum AccionMVC{
        __MOSTRAR_DATOS;
    }
     
     /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public ControladorPrincipal(String idusuario, VentanaPrincipal vista ){
        this.vista = vista;
        this.usu=idusuario;
    }
    
     /** Inicia el skin y las diferentes variables que se utilizan */
    public void iniciar(){
        
        // Skin tipo WINDOWS
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
            this.vista.setLocationRelativeTo(null);
        } catch (UnsupportedLookAndFeelException ex) {}
          catch (ClassNotFoundException ex) {}
          catch (InstantiationException ex) {}
          catch (IllegalAccessException ex) {}
        // Mostramos datos en la tabla
        this.vista.TablaPersonajes.setModel(this.modelo.getTablaPersonaje());
        this.vista.TablaPersonajes.setRowSelectionAllowed(true);
        this.vista.PanelTabla.getViewport().setBorder(null);
        this.vista.txtBusqueda.requestFocus(true);
        
        //Recogemos los datos del usuario a partir del nombre de cuenta recibido en el constructor
        datosUsuario=this.modelo.getDatosCuenta(usu);
        usuario = new Cuenta(String.valueOf(datosUsuario[0]),String.valueOf(datosUsuario[1]), String.valueOf(datosUsuario[2]), 
                (int)datosUsuario[3],  (int)datosUsuario[4], (int)datosUsuario[5], (int)datosUsuario[6], (int)datosUsuario[7], (int)datosUsuario[8]);
        //Mostramos los datos de usuario en la interfaz
        this.vista.usuNivelFractalActual.setValue(usuario.getNivelFrac());
        this.vista.mostrarUsuario.setText(usuario.getNombreCuenta());
        //Rellenamos el array de personajes
        personajes = this.modelo.getPersonajesCuenta(usuario.getNombreCuenta());
        //Rellenamos el array de nombre de personajes para mostrar
        for(Personaje p:personajes){
            nomPjs.add(p.getNombre());
        }
        //Cargamos los nombres de personaje en el combo box de los personajes del usuario
        this.vista.cbPersonaje.setModel(new DefaultComboBoxModel(nomPjs.toArray()));
      
    }
    
}
