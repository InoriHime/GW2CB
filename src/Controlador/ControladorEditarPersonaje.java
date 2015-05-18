package Controlador;
import Modelo.ModeloEditarPersonaje;
import Vista.VentanaPrincipal;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorEditarPersonaje {
    
    JDialog vista;
    String npj;
    ModeloEditarPersonaje modelo;
    
    ControladorEditarPersonaje(String p, JDialog v) {
        
        this.vista = v;
        this.npj = p;
        
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
