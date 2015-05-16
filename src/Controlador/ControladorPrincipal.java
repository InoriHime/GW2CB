package Controlador;

/* Importamos el modelo y la interfaz*/
import Modelo.ModeloPrincipal;
import Vista.VentanaPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ControladorPrincipal{
    /** instancia a nuestra interfaz de usuario*/
    VentanaPrincipal vista;
    /** instancia a nuestro modelo */
    ModeloPrincipal modelo = new ModeloPrincipal();
    
    /** Se declaran en un ENUM las acciones que se realizan desde la
     * interfaz de usuario VISTA y posterior ejecución desde el controlador
     */
    
    public enum AccionMVC{
        __MOSTRAR_DATOS;
    }
     
     /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public ControladorPrincipal( VentanaPrincipal vista ){
        this.vista = vista;
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
        this.vista.PanelTabla.getViewport().setBorder(null);
        this.vista.txtBusqueda.requestFocus(true);
      
    }
    
}
