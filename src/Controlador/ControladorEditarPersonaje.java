package Controlador;
import Modelo.ModeloEditarPersonaje;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorEditarPersonaje {
    
    VentanaPrincipal vista;
    ModeloEditarPersonaje modelo;
    Personaje personaje;
    String[] razas, clases, slotArma, slotArmadura;
    
    ControladorEditarPersonaje(Personaje p, VentanaPrincipal v) {
        
        this.vista = v;
        this.personaje = p;
        
    }
    
    public void iniciar(){
    
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            this.vista.setLocationRelativeTo(null);
            this.vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        
        
        
    }
}
