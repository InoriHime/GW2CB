package Controlador;

/* Importamos el modelo y la interfaz*/
import Modelo.Arma;
import Modelo.Armadura;
import Modelo.Cuenta;
import Modelo.ModeloPrincipal;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorPrincipal implements ActionListener, MouseListener {

    /**
     * instancia a nuestra interfaz de usuario
     */
    VentanaPrincipal vista;
    /**
     * instancia a nuestro modelo
     */
    ModeloPrincipal modelo = new ModeloPrincipal();
    
    ControladorEditarPersonaje MEP;
    //Usuario de sesion
    Cuenta usuario;
    //Array para almacenar temporalmente los datos de usuario con el fin de pasarlos como parametro en el constructur del usuario
    Object[] datosUsuario = new Object[9];
    //Almacenamiento del nombre de usuario de sesion pasado como parametro en el contructor
    String usu;
    //Array de personajes
    ArrayList<Personaje> personajes = new ArrayList<>();
    //Array de nombres de personajes para mostrar
    ArrayList<String> nomPjs = new ArrayList<>();

    Personaje personajeSeleccionado = new Personaje();

    /**
     * Se declaran en un ENUM las acciones que se realizan desde la interfaz de
     * usuario VISTA y posterior ejecución desde el controlador
     */
    public enum AccionMVC {
        __EDITAR_PERSONAJE,
        __BUSCAR,
        __ACEPTAR_ACERCA;
    }

    /**
     * Constrcutor de clase
     *
     * @param vista Instancia de clase interfaz
     */
    public ControladorPrincipal(String idusuario, VentanaPrincipal vista) {
        this.vista = vista;
        this.usu = idusuario;
    }

    /**
     * Inicia el skin y las diferentes variables que se utilizan
     */
    public void iniciar() {

        // Skin tipo WINDOWS
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
            this.vista.setLocationRelativeTo(null);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        }
        // Mostramos datos en la tabla
        this.vista.TablaPersonajes.setModel(this.modelo.getTablaPersonaje());
        //Definimos la apariencia de la tabla
        this.vista.TablaPersonajes.setRowSelectionAllowed(true);
        this.vista.PanelTabla.getViewport().setBorder(null);
        this.vista.TablaPersonajes.setSelectionBackground(new Color(27, 23, 20, 159));
        this.vista.TablaPersonajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.vista.txtBusqueda.requestFocus(true);

        //Recogemos los datos del usuario a partir del nombre de cuenta recibido en el constructor
        datosUsuario = this.modelo.getDatosCuenta(usu);
        usuario = new Cuenta(String.valueOf(datosUsuario[0]), String.valueOf(datosUsuario[1]), String.valueOf(datosUsuario[2]),
                (int) datosUsuario[3], (int) datosUsuario[4], (int) datosUsuario[5], (int) datosUsuario[6], (int) datosUsuario[7], (int) datosUsuario[8]);
        //Mostramos los datos de usuario en la interfaz
        this.vista.usuNivelFractalActual.setValue(usuario.getNivelFrac());
        this.vista.mostrarUsuario.setText(usuario.getNombreCuenta());
        //Rellenamos el array de personajes
        personajes = this.modelo.getPersonajesCuenta(usuario.getNombreCuenta());
        //Rellenamos el array de nombre de personajes para mostrar
        for (Personaje p : personajes) {
            nomPjs.add(p.getNombre());
        }
        //Cargamos los nombres de personaje en el combo box de los personajes del usuario
        this.vista.cbPersonaje.setModel(new DefaultComboBoxModel(nomPjs.toArray()));

        this.vista.TablaPersonajes.setName("Tabla");
        this.vista.TablaPersonajes.addMouseListener(this);
        this.vista.btnModPj.setActionCommand("__EDITAR_PERSONAJE");
        this.vista.btnModPj.addActionListener(this);
        this.vista.btnBuscar.setActionCommand("__BUSCAR");
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btn_dialogoAD_Aceptar.setActionCommand("__ACEPTAR_ACERCA");
        this.vista.btn_dialogoAD_Aceptar.addActionListener(this);
        
        this.vista.itemModificarDatos.setName("__MODIFICAR_USUARIO");
        this.vista.itemModificarDatos.addMouseListener(this);
        this.vista.itemSalir.setName("__SALIR");
        this.vista.itemSalir.addMouseListener(this);
        this.vista.itemRegPj.setName("__REGISTRAR_PERSONAJE");
        this.vista.itemRegPj.addMouseListener(this);
        this.vista.itemModPj.setName("__MODIFICAR_PERSONAJE");
        this.vista.itemModPj.addMouseListener(this);
        this.vista.itemUnirClan.setName("__UNIRSE_CLAN");
        this.vista.itemUnirClan.addMouseListener(this);
        this.vista.itemAbandonarClan.setName("__ABANDONAR_CLAN");
        this.vista.itemAbandonarClan.addMouseListener(this);
        this.vista.itemRegClan.setName("__REGISTRAR_CLAN");
        this.vista.itemRegClan.addMouseListener(this);
        this.vista.itemEliminarClan.setName("__ELIMINAR_CLAN");
        this.vista.itemEliminarClan.addMouseListener(this);
        this.vista.itemCambiarBD.setName("__CAMBIAR_BD");
        this.vista.itemCambiarBD.addMouseListener(this);
        this.vista.itemAcerca.setName("__ACERCA");
        this.vista.itemAcerca.addMouseListener(this);
        

        this.vista.icoCabeza.setName("Cabeza");
        this.vista.icoCabeza.addMouseListener(this);

        this.vista.TablaPersonajes.getColumnModel().getColumn(3).setPreferredWidth(30);
        this.vista.TablaPersonajes.getColumnModel().getColumn(4).setPreferredWidth(30);

        //armas
        this.vista.icoArmaPSet1.setName("ArmaPSet1");
        this.vista.icoArmaPSet1.addMouseListener(this);
        this.vista.icoArmaSSet1.setName("ArmaSSet1");
        this.vista.icoArmaSSet1.addMouseListener(this);
        this.vista.icoArmaPSet2.setName("ArmaPSet2");
        this.vista.icoArmaPSet2.addMouseListener(this);
        this.vista.icoArmaSSet2.setName("ArmaSSet2");
        this.vista.icoArmaSSet2.addMouseListener(this);
        this.vista.icoArmaAcu1.setName("ArmaAcu1");
        this.vista.icoArmaAcu1.addMouseListener(this);
        this.vista.icoArmaAcu2.setName("ArmaAcu2");
        this.vista.icoArmaAcu2.addMouseListener(this);

        //Armaduras
        this.vista.icoCabezaAcu.setName("CabezaAcu");
        this.vista.icoCabezaAcu.addMouseListener(this);
        this.vista.icoCabeza.setName("Cabeza");
        this.vista.icoCabeza.addMouseListener(this);
        this.vista.icoHombros.setName("Hombros");
        this.vista.icoHombros.addMouseListener(this);
        this.vista.icoPecho.setName("Pecho");
        this.vista.icoPecho.addMouseListener(this);
        this.vista.icoManos.setName("Manos");
        this.vista.icoManos.addMouseListener(this);
        this.vista.icoPiernas.setName("Piernas");
        this.vista.icoPiernas.addMouseListener(this);
        this.vista.icoPies.setName("Pies");
        this.vista.icoPies.addMouseListener(this);
        this.vista.icoEspaldar.setName("Espaldar");
        this.vista.icoEspaldar.addMouseListener(this);
        this.vista.icoAmuleto.setName("Amuleto");
        this.vista.icoAmuleto.addMouseListener(this);
        this.vista.icoAccesorio1.setName("Accesorio1");
        this.vista.icoAccesorio1.addMouseListener(this);
        this.vista.icoAccesorio2.setName("Accesorio2");
        this.vista.icoAccesorio2.addMouseListener(this);
        this.vista.icoAnillo1.setName("Anillo1");
        this.vista.icoAnillo1.addMouseListener(this);
        this.vista.icoAnillo2.setName("Anillo2");
        this.vista.icoAnillo2.addMouseListener(this);
        
        Personaje p = new Personaje();
        String npj;
        npj = String.valueOf(this.vista.cbPersonaje.getSelectedItem());
        p.setNombre(npj);
        this.asignarDatosPersonaje(p);
        MEP=new ControladorEditarPersonaje(p, this.vista);
        MEP.iniciar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (AccionMVC.valueOf(e.getActionCommand())) {
            case __EDITAR_PERSONAJE:
                Personaje p = new Personaje();
                String npj;
                npj = String.valueOf(this.vista.cbPersonaje.getSelectedItem());
                p.setNombre(npj);
                this.asignarDatosPersonaje(p);
                MEP.setPersonaje(p);
                MEP.cargarDatosPersonaje();
                this.vista.dialogoModificarPersonaje.setVisible(true);
                this.vista.dialogoModificarPersonaje.setLocationRelativeTo(null);

                break;
            case __BUSCAR:
                this.vista.TablaPersonajes.setModel(this.modelo.busqueda(usu, this.vista.txtBusqueda.getText(),
                        this.vista.radPersonaje.isSelected(), this.vista.radCuenta.isSelected(), this.vista.radClan.isSelected(),
                        this.vista.txtAgoniaMinima.getText(), this.vista.txtNivelfracMinimo.getText(), this.vista.chkBuscarMiembrosMiClan.isSelected(),
                        this.vista.chkGuardian.isSelected(), this.vista.chkGuerrero.isSelected(), this.vista.chkElementalista.isSelected(),
                        this.vista.chkNigromante.isSelected(), this.vista.chkGuardabosques.isSelected(), this.vista.chkLadron.isSelected(),
                        this.vista.chkIngeniero.isSelected(), this.vista.chkHipnotizador.isSelected(), this.vista.chkIngles.isSelected(),
                        this.vista.chkEspanyol.isSelected(), this.vista.chkFrances.isSelected(), this.vista.chkAleman.isSelected()));
                this.vista.TablaPersonajes.getColumnModel().getColumn(3).setPreferredWidth(30);
                this.vista.TablaPersonajes.getColumnModel().getColumn(4).setPreferredWidth(30);
                break;
            case __ACEPTAR_ACERCA:
                this.vista.dialogoAcercaDe.dispose();
                break;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int fila;
        Object[] datosCuenta = new Object[9];
        Object[] datosPj = new Object[3];
        switch (e.getComponent().getName()) {
            case "Tabla":
                fila = this.vista.TablaPersonajes.getSelectedRow();
                personajeSeleccionado.setNombre(String.valueOf(this.vista.TablaPersonajes.getValueAt(fila, 0)));
                this.asignarDatosPersonaje(personajeSeleccionado);
                this.mostrarImagenes(personajeSeleccionado.getNombre());
                this.mostrarAtributosPersonaje(personajeSeleccionado);
                break;
            case "__SALIR":
                this.vista.dispatchEvent(new WindowEvent(this.vista, WindowEvent.WINDOW_CLOSING));
                break;
            case "__ACERCA":
                this.vista.dialogoAcercaDe.setLocationRelativeTo(null);
                this.vista.dialogoAcercaDe.setVisible(true);
                break;
            case "__UNIRSE_CLAN":
                this.vista.dialogoUnirseClan.setLocationRelativeTo(null);
                this.vista.dialogoUnirseClan.setVisible(true);
                break;
            case "__MODIFICAR_PERSONAJE":
                Personaje p = new Personaje();
                String npj;
                npj = String.valueOf(this.vista.cbPersonaje.getSelectedItem());
                p.setNombre(npj);
                this.asignarDatosPersonaje(p);
                MEP.setPersonaje(p);
                MEP.cargarDatosPersonaje();
                this.vista.dialogoModificarPersonaje.setVisible(true);
                this.vista.dialogoModificarPersonaje.setLocationRelativeTo(null);
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        try{
            
        ArrayList<Arma> armas = personajeSeleccionado.getArmas();
        ArrayList<Armadura> armaduras = personajeSeleccionado.getArmaduras();
        switch (e.getComponent().getName()) {
            case "ArmaPSet1":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 1) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "ArmaSSet1":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 2) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "ArmaPSet2":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 4) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "ArmaSSet2":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 5) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "ArmaAcu1":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 3) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "ArmaAcu2":
                for (Arma arma : armas) {
                    if (arma.getSlot() == 6) {
                        this.vista.muestraPieza.setText(arma.getTipo());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Fuerza:");
                        this.vista.muestraStatBase.setText(arma.getFuerza());
                    }
                }
                break;
            case "Cabeza":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 6) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Hombros":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 4) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Pecho":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 5) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Manos":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 3) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Piernas":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 2) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Pies":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 1) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;
            case "Accesorio1":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 7) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "Accesorio2":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 8) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "Anillo1":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 9) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "Anillo2":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 10) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "Espaldar":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 11) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "Amuleto":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 12) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                    }
                }
                break;
            case "CabezaAcu":
                for (Armadura arma : armaduras) {
                    if (arma.getSlot() == 13) {
                        this.vista.muestraPieza.setText(arma.getParte());
                        this.vista.muestraRareza.setText(arma.getRareza());
                        this.vista.muestraPoder.setText(arma.getPoder() + "");
                        this.vista.muestraPrecision.setText(arma.getPrecision() + "");
                        this.vista.muestraDureza.setText(arma.getDureza() + "");
                        this.vista.muestraVitalidad.setText(arma.getVitalidad() + "");
                        this.vista.muestraFerocidad.setText(arma.getFerocidad() + "");
                        this.vista.muestraDanyoCondicion.setText(arma.getdCondicion() + "");
                        this.vista.muestraPoderCuracion.setText(arma.getpCuracion() + "");
                        this.vista.muestraRAgonia.setText(arma.calcAgonia() + "");
                        this.vista.etiStatBase.setText("Defensa:");
                        this.vista.muestraStatBase.setText(arma.getDefensa() + "");
                    }
                }
                break;

        }
        }catch(Exception a){
            
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

        this.vista.muestraPieza.setText("-");
        this.vista.muestraRareza.setText("-");
        this.vista.muestraPoder.setText("-");
        this.vista.muestraPrecision.setText("-");
        this.vista.muestraDureza.setText("-");
        this.vista.muestraVitalidad.setText("-");
        this.vista.muestraFerocidad.setText("-");
        this.vista.muestraDanyoCondicion.setText("-");
        this.vista.muestraPoderCuracion.setText("-");
        this.vista.muestraRAgonia.setText("-");
        this.vista.muestraStatBase.setText("");
        this.vista.etiStatBase.setText("");
    }

    public ArrayList<Arma> equiparArmas(String personaje) {

        return this.modelo.setArmas(personaje);

    }

    public ArrayList<Armadura> equiparArmaduras(String personaje) {
        return this.modelo.setArmaduras(personaje);
    }

    public void mostrarImagenes(String personaje) {
        if (this.modelo.piezaEquipada(personaje, 1) == 1) {
            this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpies.png"));
        } else {
            this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/botas.jpg"));
        }

        if (this.modelo.piezaEquipada(personaje, 2) == 1) {
            this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpiernas.png"));
        } else {
            this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/pantalon.jpg"));
        }

        if (this.modelo.piezaEquipada(personaje, 3) == 1) {
            this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tguantes.png"));
        } else {
            this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/guantes.jpg"));
        }

        if (this.modelo.piezaEquipada(personaje, 5) == 1) {
            this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpecho.png"));
        } else {
            this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/pecho.jpg"));
        }

        if (this.modelo.piezaEquipada(personaje, 4) == 1) {
            this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Thombros.png"));
        } else {
            this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/hombreras.jpg"));
        }

        if (this.modelo.piezaEquipada(personaje, 6) == 1) {
            this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tcabeza.png"));
        } else {
            this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/cabeza.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 7) == 1) {
            this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Taccesorio1.png"));
        } else {
            this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/accesorio1.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 8) == 1) {
            this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Taccesorio2.png"));
        } else {
            this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/accesorio2.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 9) == 1) {
            this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tanillo1.png"));
        } else {
            this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/anillo1.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 10) == 1) {
            this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tanillo2.png"));
        } else {
            this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/anillo2.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 11) == 1) {
            this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tespaldar.png"));
        } else {
            this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/espaldar.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 12) == 1) {
            this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tamuleto.png"));
        } else {
            this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/amuleto.jpg"));
        }
        if (this.modelo.piezaEquipada(personaje, 13) == 1) {
            this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tacuacabeza.png"));
        } else {
            this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuacabeza.png"));
        }
        if (this.modelo.armaEquipada(personaje, 1) != 0) {
            this.vista.icoArmaPSet1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 1) + ".png"));
        } else {
            this.vista.icoArmaPSet1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaPSet1.png"));
        }

        if (this.modelo.armaEquipada(personaje, 2) != 0) {
            this.vista.icoArmaSSet1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 2) + ".png"));
        } else {
            this.vista.icoArmaSSet1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaSSet1.png"));
        }

        if (this.modelo.armaEquipada(personaje, 4) != 0) {
            this.vista.icoArmaPSet2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 4) + ".png"));
        } else {
            this.vista.icoArmaPSet2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaPSet2.png"));
        }

        if (this.modelo.armaEquipada(personaje, 5) != 0) {
            this.vista.icoArmaSSet2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 5) + ".png"));
        } else {
            this.vista.icoArmaSSet2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaSSet2.png"));
        }

        if (this.modelo.armaEquipada(personaje, 3) != 0) {
            this.vista.icoArmaAcu1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 3) + "1.png"));
        } else {
            this.vista.icoArmaAcu1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuaarma1.png"));
        }

        if (this.modelo.armaEquipada(personaje, 6) != 0) {
            this.vista.icoArmaAcu2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/" + this.modelo.armaEquipada(personaje, 6) + "2.png"));
        } else {
            this.vista.icoArmaAcu2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuaarma2.png"));
        }
    }
    
    public void asignarDatosPersonaje(Personaje p){
        Object[] datosCuenta = new Object[9];
        Object[] datosPj = new Object[3];
        
        datosPj = this.modelo.getDatosPersonaje(p.getNombre());
        p.setCuenta((String) datosPj[0]);
        datosCuenta = this.modelo.getDatosCuenta(p.getCuenta());
        p.setServidor(this.modelo.getNombreServidor((int) datosCuenta[4]));
        p.setClase(this.modelo.getNombreClase((int) datosPj[2]));
        p.setRaza(this.modelo.getNombreRaza((int) datosPj[1]));
        p.setIdiomas(this.modelo.getIdiomas(p.getNombre()));
        p.setArmas(equiparArmas(p.getNombre()));
        p.setArmaduras(equiparArmaduras(p.getNombre()));
        
        p.calcularStats();
    }
    
    public void mostrarAtributosPersonaje(Personaje p){
        this.vista.mostrarNombrePersonaje.setText(p.getNombre());
        this.vista.mostrarNombreCuenta.setText(p.getCuenta());
        this.vista.mostrarClase.setText(p.getClase());
        this.vista.mostrarIdiomas.setText(p.getIdiomas());
        this.vista.mostrarServidor.setText(p.getServidor());
        
        //Atributos
        this.vista.mostrarPoder.setText(p.getPoder()+"");
        this.vista.mostrarPrecision.setText(p.getPrecision()+"");
        this.vista.mostrarDureza.setText(p.getDureza()+"");
        this.vista.mostrarVitalidad.setText(p.getVitalidad()+"");
        this.vista.mostrarDuracionBendicion.setText(p.getDuraBendicion()+"");
        this.vista.mostrarDanyoCondicion.setText(p.getDanyoCondicion()+"");
        this.vista.mostrarDuracionCondicion.setText(p.getDuraCondicion()+"");
        this.vista.mostrarFerocidad.setText(p.getFerocidad()+"");
        this.vista.mostrarPoderCuracion.setText(p.getpCuracion()+"");
        this.vista.mostrarArmadura.setText(p.getArmadura()+"");
        this.vista.mostrarProbabilidadCritica.setText(p.getProbCritica()+"");
        this.vista.mostrarDanyoCritico.setText(p.getDanyoCritico()+"");
        this.vista.mostrarSalud.setText(p.getSalud()+"");
        this.vista.mostrarAgonia.setText(p.getrAgonia()+"");
    }
    
    

}
