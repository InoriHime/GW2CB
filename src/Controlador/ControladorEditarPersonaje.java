package Controlador;
import Modelo.ModeloEditarPersonaje;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorEditarPersonaje implements ActionListener {
    
    VentanaPrincipal vista;
    ModeloEditarPersonaje modelo;
    Personaje personaje;
    ArrayList<String> razas, clases, slotArma, slotArmadura;
    
    ControladorEditarPersonaje(Personaje p, VentanaPrincipal v) {
        
        this.vista = v;
        this.personaje = p;
        this.modelo = new ModeloEditarPersonaje();
        
    }
    
    public enum AccionMVC {
        
        __EDITAR_ARMA,
        __EDITAR_ARMADURA,
        __MODIFICAR_PERSONAJE,
        __CANCELAR;
        
    }
    
    public void iniciar(){
    
        razas = modelo.getRazas();
        clases = modelo.getClases();
        slotArma = modelo.getSlotArma();
        slotArmadura = modelo.getSlotArmadura();
        
        this.vista.txt_dialogoMP_Nombre.setText(personaje.getNombre());
        this.vista.cb_dialogoMP_Raza.setModel(new DefaultComboBoxModel(razas.toArray()));
        this.vista.cb_dialogoMP_Clase.setModel(new DefaultComboBoxModel(clases.toArray()));
        this.vista.cb_dialogoMP_SlotArma.setModel(new DefaultComboBoxModel(slotArma.toArray()));
        this.vista.cb_dialogoMP_SlotArmadura.setModel(new DefaultComboBoxModel(slotArmadura.toArray()));
        
        this.vista.btn_dialogoMP_ModArma.setActionCommand("__EDITAR_ARMA");
        this.vista.btn_dialogoMP_ModArma.addActionListener(this);
        this.vista.btn_dialogoMP_ModArmadura.setActionCommand("__EDITAR_ARMADURA");
        this.vista.btn_dialogoMP_ModArmadura.addActionListener(this);
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            this.vista.dialogoModificarPersonaje.setLocationRelativeTo(null);
            this.vista.dialogoModificarPersonaje.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (AccionMVC.valueOf(e.getActionCommand())) {
            
            case __EDITAR_ARMA:
                this.vista.dialogoConfigurarArma.setLocationRelativeTo(null);
                this.vista.dialogoConfigurarArma.setVisible(true);
            break;
            
            case __EDITAR_ARMADURA:
                this.vista.dialogoConfigurarArmadura.setLocationRelativeTo(null);
                this.vista.dialogoConfigurarArmadura.setVisible(true);
            break;
            
        }
        
    }
    
}