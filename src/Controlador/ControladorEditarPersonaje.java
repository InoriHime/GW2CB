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
    ArrayList<String> razas, clases, slotArma, slotArmadura, tiposArma, rarezas, modificadores;
    
    ControladorEditarPersonaje(Personaje p, VentanaPrincipal v) {
        
        this.vista = v;
        this.personaje = p;
        this.modelo = new ModeloEditarPersonaje();
        
    }
    
    public enum AccionMVC {
        
        __EDITAR_ARMA,
        __EDITAR_ARMADURA,
        __MODIFICAR_PERSONAJE,
        __CANCELAR,
        __APLICAR_ARMA,
        __CANCELAR_ARMA,
        __APLICAR_ARMADURA,
        __CANCELAR_ARMADURA;
        
    }
    
    public void iniciar(){
    
        razas = modelo.getRazas();
        clases = modelo.getClases();
        slotArma = modelo.getSlotArma();
        slotArmadura = modelo.getSlotArmadura();
        tiposArma = modelo.getTipoArma();
        rarezas = modelo.getRarezas();
        modificadores = modelo.getModificador();
        
        this.vista.txt_dialogoMP_Nombre.setText(personaje.getNombre());
        this.vista.cb_dialogoMP_Clase.setModel(new DefaultComboBoxModel(razas.toArray()));
        this.vista.cb_dialogoMP_Raza.setModel(new DefaultComboBoxModel(clases.toArray()));
        this.vista.cb_dialogoMP_SlotArma.setModel(new DefaultComboBoxModel(slotArma.toArray()));
        this.vista.cb_dialogoMP_SlotArmadura.setModel(new DefaultComboBoxModel(slotArmadura.toArray()));
        
        this.vista.btn_dialogoMP_ModArma.setActionCommand("__EDITAR_ARMA");
        this.vista.btn_dialogoMP_ModArma.addActionListener(this);
        this.vista.btn_dialogoMP_ModArmadura.setActionCommand("__EDITAR_ARMADURA");
        this.vista.btn_dialogoMP_ModArmadura.addActionListener(this);
        this.vista.btn_dialogoMP_Modificar.setActionCommand("__MODIFICAR_PERSONAJE");
        this.vista.btn_dialogoMP_Modificar.addActionListener(this);
        this.vista.btn_dialogoMP_Cancelar.setActionCommand("__CANCELAR");
        this.vista.btn_dialogoMP_Cancelar.addActionListener(this);
        this.vista.btn_dialogoCArma_Aplicar.setActionCommand("__APLICAR_ARMA");
        this.vista.btn_dialogoCArma_Aplicar.addActionListener(this);
        this.vista.btn_dialogoCArma_Cancelar.setActionCommand("__CANCELAR_ARMA");
        this.vista.btn_dialogoCArma_Cancelar.addActionListener(this);
        this.vista.btn_dialogoCArmadura_Aplicar.setActionCommand("__APLICAR_ARMADURA");
        this.vista.btn_dialogoCArmadura_Aplicar.addActionListener(this);
        this.vista.btn_dialogoCArmadura_Cancelar.setActionCommand("__CANCELAR_ARMADURA");
        this.vista.btn_dialogoCArmadura_Cancelar.addActionListener(this);
        
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
                this.vista.mostrar_dialogoCArma_SlotArma.setText(this.vista.cb_dialogoMP_SlotArma.getSelectedItem().toString());
                this.vista.cb_dialogoCArma_TipoArma.setModel(new DefaultComboBoxModel (tiposArma.toArray()));
                this.vista.cb_dialogoCArma_RarezaArma.setModel(new DefaultComboBoxModel (rarezas.toArray()));
                this.vista.cb_dialogoCArma_ModificadorArma.setModel(new DefaultComboBoxModel (modificadores.toArray()));
                
                this.vista.dialogoConfigurarArma.setLocationRelativeTo(null);
                this.vista.dialogoConfigurarArma.setVisible(true);
            break;
            
            case __EDITAR_ARMADURA:
                this.vista.mostrar_dialogoCArmadura_SlotArmadura.setText(this.vista.cb_dialogoMP_SlotArmadura.getSelectedItem().toString());
                this.vista.cb_dialogoCArmadura_RarezaArmadura.setModel(new DefaultComboBoxModel (rarezas.toArray()));
                this.vista.cb_dialogoCArmadura_ModificadorArmadura.setModel(new DefaultComboBoxModel (modificadores.toArray()));
                
                this.vista.dialogoConfigurarArmadura.setLocationRelativeTo(null);
                this.vista.dialogoConfigurarArmadura.setVisible(true);
            break;
                
            case __CANCELAR:
                this.vista.dialogoModificarPersonaje.dispose();
            break;
                
            case __CANCELAR_ARMA:
                this.vista.dialogoConfigurarArma.dispose();
            break;
                
            case __CANCELAR_ARMADURA:
                this.vista.dialogoConfigurarArmadura.dispose();
            break;
            
        }
      
    }
    
}