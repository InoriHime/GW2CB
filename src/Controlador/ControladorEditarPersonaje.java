package Controlador;
import Modelo.ModeloEditarPersonaje;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorEditarPersonaje {
    
    VentanaPrincipal vista;
    ModeloEditarPersonaje modelo;
    Personaje personaje;
    ArrayList<String> razas, clases, slotArma, slotArmadura;
    
    ControladorEditarPersonaje(Personaje p, VentanaPrincipal v) {
        
        this.vista = v;
        this.personaje = p;
        this.modelo = new ModeloEditarPersonaje();
        
    }
    
    public void iniciar(){
    
        razas = modelo.getRazas();
        clases = modelo.getClases();
        slotArma = modelo.getSlotArma();
        slotArmadura = modelo.getSlotArmadura();
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            this.vista.setLocationRelativeTo(null);
            this.vista.dialogoModificarPersonaje.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        
        this.vista.cb_dialogoMP_Raza.setModel(new DefaultComboBoxModel(razas.toArray()));
        this.vista.cb_dialogoMP_Clase.setModel(new DefaultComboBoxModel(clases.toArray()));
        this.vista.cb_dialogoMP_SlotArma.setModel(new DefaultComboBoxModel(slotArma.toArray()));
        this.vista.cb_dialogoMP_SlotArmadura.setModel(new DefaultComboBoxModel(slotArmadura.toArray()));
        
    }
}
