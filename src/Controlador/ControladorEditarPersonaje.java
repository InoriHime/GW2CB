package Controlador;

import Modelo.ModeloEditarPersonaje;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorEditarPersonaje implements ActionListener {

    VentanaPrincipal vista;
    ModeloEditarPersonaje modelo;
    Personaje personaje;
    ArrayList<String> razas, clases, slotArma, slotArmadura, tiposArma, rarezas, modificadores;
    int raza, clase;
    int[][] armas = new int[6][6];
    int[][] armaduras = new int[13][5];
    boolean[] nuevoArma = new boolean[6];
    boolean[] nuevoArmadura = new boolean[13];
    boolean[] eliminarArma = new boolean[6];
    boolean[] eliminarArmadura = new boolean[13];

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
        __SIN_EQUIPAR_ARMA,
        __APLICAR_ARMADURA,
        __CANCELAR_ARMADURA,
        __SIN_EQUIPAR_ARMADURA;

    }

    public void iniciar() {

        razas = modelo.getNombreRazas();
        clases = modelo.getNombreClases();
        slotArma = modelo.getNombreSlotArma();
        slotArmadura = modelo.getNombreSlotArmadura();
        tiposArma = modelo.getNombreTipoArma();
        rarezas = modelo.getNombreRarezas();
        modificadores = modelo.getNombreModificador();

        this.cargarDatosPersonaje();

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
        this.vista.btn_dialogoCArma_SinEquipar.setActionCommand("__SIN_EQUIPAR_ARMA");
        this.vista.btn_dialogoCArma_SinEquipar.addActionListener(this);
        this.vista.btn_dialogoCArmadura_Aplicar.setActionCommand("__APLICAR_ARMADURA");
        this.vista.btn_dialogoCArmadura_Aplicar.addActionListener(this);
        this.vista.btn_dialogoCArmadura_Cancelar.setActionCommand("__CANCELAR_ARMADURA");
        this.vista.btn_dialogoCArmadura_Cancelar.addActionListener(this);
        this.vista.btn_dialogoCArmadura_SinEquipar.setActionCommand("__SIN_EQUIPAR_ARMADURA");
        this.vista.btn_dialogoCArmadura_SinEquipar.addActionListener(this);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            this.vista.dialogoModificarPersonaje.setLocationRelativeTo(null);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        }

    }
    
    public void cargarDatosPersonaje(){
        armas = modelo.getArmas(personaje.getNombre());
        armaduras = modelo.getArmaduras(personaje.getNombre());

        this.vista.txt_dialogoMP_Nombre.setText(personaje.getNombre());
        this.vista.cb_dialogoMP_Raza.setModel(new DefaultComboBoxModel(razas.toArray()));
        this.vista.cb_dialogoMP_Raza.setSelectedIndex(modelo.getRaza(personaje.getNombre()) - 1);
        this.vista.cb_dialogoMP_Clase.setModel(new DefaultComboBoxModel(clases.toArray()));
        this.vista.cb_dialogoMP_Clase.setSelectedIndex(modelo.getClase(personaje.getNombre()) - 1);
        this.vista.cb_dialogoMP_SlotArma.setModel(new DefaultComboBoxModel(slotArma.toArray()));
        this.vista.cb_dialogoMP_SlotArma.setSelectedIndex(-1);
        this.vista.cb_dialogoMP_SlotArmadura.setModel(new DefaultComboBoxModel(slotArmadura.toArray()));
        this.vista.cb_dialogoMP_SlotArmadura.setSelectedIndex(-1);
    }
    
    public void setPersonaje(Personaje p){
        this.personaje=p;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int slotArma, slotArmadura;
        boolean rellenoTipo, rellenoRareza, rellenoModificacion;

        switch (AccionMVC.valueOf(e.getActionCommand())) {

            case __EDITAR_ARMA:
                slotArma = this.vista.cb_dialogoMP_SlotArma.getSelectedIndex();

                if (this.vista.cb_dialogoMP_SlotArma.getSelectedIndex() > -1) {

                    this.vista.mostrar_dialogoCArma_SlotArma.setText(this.vista.cb_dialogoMP_SlotArma.getSelectedItem().toString());
                    this.vista.cb_dialogoCArma_TipoArma.setModel(new DefaultComboBoxModel(tiposArma.toArray()));
                    this.vista.cb_dialogoCArma_RarezaArma.setModel(new DefaultComboBoxModel(rarezas.toArray()));
                    this.vista.cb_dialogoCArma_ModificadorArma.setModel(new DefaultComboBoxModel(modificadores.toArray()));

                    if (eliminarArma[slotArma] == true) {

                        this.vista.cb_dialogoCArma_TipoArma.setSelectedIndex(-1);
                        this.vista.cb_dialogoCArma_RarezaArma.setSelectedIndex(-1);
                        this.vista.cb_dialogoCArma_ModificadorArma.setSelectedIndex(-1);
                        this.vista.chk_dialogoCArma_InfusionSimple1.setSelected(false);
                        this.vista.chk_dialogoCArma_InfusionSimple2.setSelected(false);

                    } else {

                        try {

                            this.vista.cb_dialogoCArma_TipoArma.setSelectedIndex(armas[slotArma][1] - 1);

                        } catch (NullPointerException exc) {

                            this.vista.cb_dialogoCArma_TipoArma.setSelectedIndex(-1);

                        }

                        try {

                            this.vista.cb_dialogoCArma_RarezaArma.setSelectedIndex(armas[slotArma][3] - 1);

                        } catch (NullPointerException exc) {

                            this.vista.cb_dialogoCArma_RarezaArma.setSelectedIndex(-1);

                        }

                        try {

                            this.vista.cb_dialogoCArma_ModificadorArma.setSelectedIndex(armas[slotArma][2] - 1);

                        } catch (NullPointerException exc) {

                            this.vista.cb_dialogoCArma_ModificadorArma.setSelectedIndex(-1);

                        }

                        if (armas[slotArma][4] == 1) {

                            this.vista.chk_dialogoCArma_InfusionSimple1.setSelected(true);

                        } else {

                            this.vista.chk_dialogoCArma_InfusionSimple1.setSelected(false);

                        }

                        if (armas[slotArma][5] == 1) {

                            this.vista.chk_dialogoCArma_InfusionSimple2.setSelected(true);

                        } else {

                            this.vista.chk_dialogoCArma_InfusionSimple2.setSelected(false);

                        }

                    }
                    this.vista.dialogoConfigurarArma.setVisible(true);
                    this.vista.dialogoConfigurarArma.setLocationRelativeTo(null);
                    

                } else {

                    JOptionPane.showMessageDialog(null, "Tiene que seleccionar un slot para modificar.");

                }
                break;

            case __EDITAR_ARMADURA:
                slotArmadura = this.vista.cb_dialogoMP_SlotArmadura.getSelectedIndex();

                if (this.vista.cb_dialogoMP_SlotArmadura.getSelectedIndex() > -1) {

                    this.vista.mostrar_dialogoCArmadura_SlotArmadura.setText(this.vista.cb_dialogoMP_SlotArmadura.getSelectedItem().toString());
                    this.vista.cb_dialogoCArmadura_RarezaArmadura.setModel(new DefaultComboBoxModel(rarezas.toArray()));
                    this.vista.cb_dialogoCArmadura_ModificadorArmadura.setModel(new DefaultComboBoxModel(modificadores.toArray()));

                    if (eliminarArmadura[slotArmadura] == true) {

                        this.vista.cb_dialogoCArmadura_RarezaArmadura.setSelectedIndex(-1);
                        this.vista.cb_dialogoCArmadura_ModificadorArmadura.setSelectedIndex(-1);
                        this.vista.chk_dialogoCArmadura_InfusionSimple.setSelected(false);
                        this.vista.txt_dialogoCArmadura_ResistAgonia.setText("0");

                    } else {

                        try {

                            this.vista.cb_dialogoCArmadura_RarezaArmadura.setSelectedIndex(armaduras[slotArmadura][2] - 1);

                        } catch (NullPointerException exc) {

                            this.vista.cb_dialogoCArmadura_RarezaArmadura.setSelectedIndex(-1);

                        }

                        try {

                            this.vista.cb_dialogoCArmadura_ModificadorArmadura.setSelectedIndex(armaduras[slotArmadura][1] - 1);

                        } catch (NullPointerException exc) {

                            this.vista.cb_dialogoCArmadura_ModificadorArmadura.setSelectedIndex(-1);

                        }

                        if (armaduras[slotArmadura][3] == 1) {

                            this.vista.chk_dialogoCArmadura_InfusionSimple.setSelected(true);

                        } else {

                            this.vista.chk_dialogoCArmadura_InfusionSimple.setSelected(false);

                        }

                        if (armaduras[slotArmadura][4] > 0) {

                            this.vista.txt_dialogoCArmadura_ResistAgonia.setText(Integer.toString(armaduras[slotArmadura][4]));

                        } else {

                            this.vista.txt_dialogoCArmadura_ResistAgonia.setText("0");

                        }

                    }

                    this.vista.dialogoConfigurarArmadura.setLocationRelativeTo(null);
                    this.vista.dialogoConfigurarArmadura.setVisible(true);

                } else {

                    JOptionPane.showMessageDialog(this.vista.dialogoModificarPersonaje, "Tiene que seleccionar un slot para modificar.");

                }
                break;

            case __APLICAR_ARMA:
                slotArma = this.vista.cb_dialogoMP_SlotArma.getSelectedIndex();

                if (this.vista.cb_dialogoCArma_TipoArma.getSelectedIndex() > -1
                        && this.vista.cb_dialogoCArma_RarezaArma.getSelectedIndex() > -1
                        && this.vista.cb_dialogoCArma_ModificadorArma.getSelectedIndex() > -1) {

                    eliminarArma[slotArma] = false;
                    nuevoArma[slotArma] = true;

                    armas[slotArma][0] = slotArma + 1;
                    armas[slotArma][1] = this.vista.cb_dialogoCArma_TipoArma.getSelectedIndex() + 1;
                    armas[slotArma][2] = this.vista.cb_dialogoCArma_ModificadorArma.getSelectedIndex() + 1;
                    armas[slotArma][3] = this.vista.cb_dialogoCArma_RarezaArma.getSelectedIndex() + 1;

                    if (this.vista.chk_dialogoCArma_InfusionSimple1.isSelected()) {

                        armas[slotArma][4] = 1;

                    } else {

                        armas[slotArma][4] = 0;

                    }

                    if (this.vista.chk_dialogoCArma_InfusionSimple2.isSelected()) {

                        armas[slotArma][5] = 1;

                    } else {

                        armas[slotArma][5] = 0;

                    }

                    this.vista.dialogoConfigurarArma.dispose();

                } else {

                    JOptionPane.showMessageDialog(this.vista.dialogoConfigurarArma, "Los campos 'Tipo de Arma', 'Rareza' y 'Modificador' son obligatorios.");

                }
                break;

            case __APLICAR_ARMADURA:
                slotArmadura = this.vista.cb_dialogoMP_SlotArmadura.getSelectedIndex();

                if (this.vista.cb_dialogoCArmadura_RarezaArmadura.getSelectedIndex() > -1
                        && this.vista.cb_dialogoCArmadura_ModificadorArmadura.getSelectedIndex() > -1) {

                    eliminarArmadura[slotArmadura] = false;
                    nuevoArmadura[slotArmadura] = true;

                    armaduras[slotArmadura][0] = slotArmadura + 1;
                    armaduras[slotArmadura][1] = this.vista.cb_dialogoCArmadura_ModificadorArmadura.getSelectedIndex() + 1;
                    armaduras[slotArmadura][2] = this.vista.cb_dialogoCArmadura_RarezaArmadura.getSelectedIndex() + 1;

                    if (this.vista.chk_dialogoCArmadura_InfusionSimple.isSelected()) {

                        armaduras[slotArmadura][3] = 1;

                    } else {

                        armaduras[slotArmadura][3] = 0;

                    }

                    armaduras[slotArmadura][4] = Integer.parseInt(this.vista.txt_dialogoCArmadura_ResistAgonia.getText());

                } else {

                    JOptionPane.showMessageDialog(this.vista.dialogoConfigurarArmadura, "Los campos 'Rareza' y 'Modificador' son obligatorios.");

                }

                this.vista.dialogoConfigurarArmadura.dispose();
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

            case __SIN_EQUIPAR_ARMA:
                slotArma = this.vista.cb_dialogoMP_SlotArma.getSelectedIndex();

                nuevoArma[slotArma] = false;
                eliminarArma[slotArma] = true;

                this.vista.dialogoConfigurarArma.dispose();
                break;

            case __SIN_EQUIPAR_ARMADURA:
                slotArmadura = this.vista.cb_dialogoMP_SlotArmadura.getSelectedIndex();

                nuevoArmadura[slotArmadura] = false;
                eliminarArmadura[slotArmadura] = true;

                this.vista.dialogoConfigurarArmadura.dispose();
                break;

            case __MODIFICAR_PERSONAJE:
                raza = this.vista.cb_dialogoMP_Raza.getSelectedIndex() + 1;
                clase = this.vista.cb_dialogoMP_Clase.getSelectedIndex() + 1;

                modelo.modificarPersonaje(personaje.getNombre(), this.vista.txt_dialogoMP_Nombre.getText(), raza, clase, armas, armaduras, nuevoArma, eliminarArma, nuevoArmadura, eliminarArmadura);

                this.vista.dialogoModificarPersonaje.dispose();
                break;

        }

    }

}
