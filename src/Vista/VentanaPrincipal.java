/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class VentanaPrincipal extends javax.swing.JFrame {

     private static VentanaPrincipal INSTANCE = null;
 
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new VentanaPrincipal();
            
            
            
        }
    }
 
    public static VentanaPrincipal getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
    
    
    private VentanaPrincipal() {
       
        initComponents();
        
        
        /*Le damos formato al header de la tabla*/
        TablaPersonajes.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            l.setBackground(new Color(27, 23, 20));
            l.setForeground(new Color(209,194,170));
            l.setHorizontalAlignment(CENTER);
            
            return l;
        }
        });
        /*Hacemos invisible el JScrollpane*/
        PanelTabla.setOpaque(false);
        PanelTabla.getViewport().setOpaque(false);
        PanelTabla.getViewport().setBorder(null);
        //Le quiamos el borde al JScrollPane
        PanelTabla.setBorder(BorderFactory.createEmptyBorder());
        
        TablaPersonajes.setBackground(new Color(160, 133, 117, 159));
        TablaPersonajes.setGridColor(new Color(27, 23, 20));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBuscador = new javax.swing.ButtonGroup();
        dialogoModificarUsuario = new javax.swing.JDialog();
        cb_dialogoMU_Servidor = new javax.swing.JComboBox();
        eti_dialogoMU_NombreCuenta = new javax.swing.JLabel();
        Panel_dialogoMU_Idiomas = new javax.swing.JPanel();
        chk_dialogoMU_Ingles = new javax.swing.JCheckBox();
        chk_dialogoMU_Espanyol = new javax.swing.JCheckBox();
        chk_dialogoMU_Aleman = new javax.swing.JCheckBox();
        chk_dialogoMU_Frances = new javax.swing.JCheckBox();
        eti_dialogoMU_Email = new javax.swing.JLabel();
        eti_dialogoMU_Servidor = new javax.swing.JLabel();
        eti_dialogoMU_Idiomas = new javax.swing.JLabel();
        txt_dialogoMU_Email = new javax.swing.JTextField();
        mostar_dialogoMU_NombreCuenta = new javax.swing.JLabel();
        Panel_dialogoMU_CambiarContrasenya = new javax.swing.JPanel();
        eti_dialogoMU_NuevaContrasenya = new javax.swing.JLabel();
        eti_dialogoMU_RepetirContrasenya = new javax.swing.JLabel();
        txt_dialogoMU_RepetirContrasenya = new javax.swing.JPasswordField();
        txt_dialogoMU_NuevaContrasenya = new javax.swing.JPasswordField();
        eti_dialogoMU_ContrasenyaAntigua = new javax.swing.JLabel();
        txt_dialogoMU_ContrasenyaAntigua = new javax.swing.JPasswordField();
        btn_dialogoMU_Modificar = new javax.swing.JButton();
        btn_dialogoMU_Cancelar = new javax.swing.JButton();
        dialogoRegistrarPersonaje = new javax.swing.JDialog();
        eti_dialogoRP_Nombre = new javax.swing.JLabel();
        txt_dialogoRP_Nombre = new javax.swing.JTextField();
        eti_dialogoRP_Raza = new javax.swing.JLabel();
        cb_dialogoRP_Raza = new javax.swing.JComboBox();
        cb_dialogoRP_Clase = new javax.swing.JComboBox();
        eti_dialogoRP_Clase = new javax.swing.JLabel();
        panel_dialogoRP_Equipo = new javax.swing.JPanel();
        eti_dialogoRP_SlotArma = new javax.swing.JLabel();
        cb_dialogoRP_SlotArma = new javax.swing.JComboBox();
        panel_dialogoRP_ConfigArmadura = new javax.swing.JPanel();
        cb_dialogoRP_RarezaArmadura = new javax.swing.JComboBox();
        eti_dialogoRP_RarezaArmadura = new javax.swing.JLabel();
        eti_dialogoRP_ModificadorArmadura = new javax.swing.JLabel();
        cb_dialogoRP_ModificadorArmadura = new javax.swing.JComboBox();
        chk_dialogoRP_InfusionSimpleArmadura = new javax.swing.JCheckBox();
        eti_dialogoRP_InfusionAgoniaArmadura = new javax.swing.JLabel();
        txt_dialogoRP_InfusionAgoniaArmadura = new javax.swing.JTextField();
        eti_dialogoRP_AR = new javax.swing.JLabel();
        eti_dialogoRP_SlotArmadura = new javax.swing.JLabel();
        cb_dialogoRP_SlotArmadura = new javax.swing.JComboBox();
        panel_dialogoRP_ConfigArma = new javax.swing.JPanel();
        cb_dialogoRP_TipoArma = new javax.swing.JComboBox();
        eti_dialogoRP_TipoArma = new javax.swing.JLabel();
        cb_dialogoRP_RarezaArma = new javax.swing.JComboBox();
        eti_dialogoRP_RarezaArma = new javax.swing.JLabel();
        eti_dialogoRP_ModificadorArma = new javax.swing.JLabel();
        cb_dialogoRP_ModificadorArma = new javax.swing.JComboBox();
        chk_dialogoRP_InfusionSimple1Arma = new javax.swing.JCheckBox();
        chk_dialogoRP_InfusionSimple2Arma = new javax.swing.JCheckBox();
        btn_dialogoRP_Registrar = new javax.swing.JButton();
        btn_dialogoRP_Cancelar = new javax.swing.JButton();
        dialogoModificarPersonaje = new javax.swing.JDialog();
        eti_dialogoMP_Nombre = new javax.swing.JLabel();
        txt_dialogoMP_Nombre = new javax.swing.JTextField();
        eti_dialogoMP_Raza = new javax.swing.JLabel();
        cb_dialogoMP_Raza = new javax.swing.JComboBox();
        cb_dialogoMP_Clase = new javax.swing.JComboBox();
        eti_dialogoMP_Clase = new javax.swing.JLabel();
        panel_dialogoMP_Equipo = new javax.swing.JPanel();
        eti_dialogoMP_SlotArma = new javax.swing.JLabel();
        cb_dialogoMP_SlotArma = new javax.swing.JComboBox();
        panel_dialogoMP_ConfigArmadura = new javax.swing.JPanel();
        cb_dialogoMP_RarezaArmadura = new javax.swing.JComboBox();
        eti_dialogoMP_RarezaArmadura = new javax.swing.JLabel();
        eti_dialogoMP_ModificadorArmadura = new javax.swing.JLabel();
        cb_dialogoMP_ModificadorArmadura = new javax.swing.JComboBox();
        chk_dialogoMP_InfusionSimpleArmadura = new javax.swing.JCheckBox();
        eti_dialogoMP_InfusionAgoniaArmadura = new javax.swing.JLabel();
        txt_dialogoMP_InfusionAgoniaArmadura = new javax.swing.JTextField();
        eti_dialogoMP_AR = new javax.swing.JLabel();
        eti_dialogoMP_SlotArmadura = new javax.swing.JLabel();
        cb_dialogoMP_SlotArmadura = new javax.swing.JComboBox();
        panel_dialogoMP_ConfigArma = new javax.swing.JPanel();
        cb_dialogoMP_TipoArma = new javax.swing.JComboBox();
        eti_dialogoMP_TipoArma = new javax.swing.JLabel();
        cb_dialogoMP_RarezaArma = new javax.swing.JComboBox();
        eti_dialogoMP_RarezaArma = new javax.swing.JLabel();
        eti_dialogoMP_ModificadorArma = new javax.swing.JLabel();
        cb_dialogoMP_ModificadorArma = new javax.swing.JComboBox();
        chk_dialogoMP_InfusionSimple1Arma = new javax.swing.JCheckBox();
        chk_dialogoMP_InfusionSimple2Arma = new javax.swing.JCheckBox();
        btn_dialogoMP_Modificar = new javax.swing.JButton();
        btn_dialogoMP_Cancelar = new javax.swing.JButton();
        dialogoUnirseClan = new javax.swing.JDialog();
        eti_dialogoUC_Clan = new javax.swing.JLabel();
        cb_dialogoUC_Clan = new javax.swing.JComboBox();
        btn_dialogoUC_Unirse = new javax.swing.JButton();
        btn_dialogoUC_Cancelar = new javax.swing.JButton();
        dialogoAbandonarClan = new javax.swing.JDialog();
        eti_dialogoAC_Clan = new javax.swing.JLabel();
        cb_dialogoAC_Clan = new javax.swing.JComboBox();
        btn_dialogoAC_Abandonar = new javax.swing.JButton();
        btn_dialogoAC_Cancelar = new javax.swing.JButton();
        dialogoCrearClan = new javax.swing.JDialog();
        eti_dialogoCC_NombreClan = new javax.swing.JLabel();
        txt_dialogoCC_NombreClan = new javax.swing.JTextField();
        eti_dialogoCC_Tag = new javax.swing.JLabel();
        txt_dialogoCC_Tag = new javax.swing.JTextField();
        btn_dialogoCC_Crear = new javax.swing.JButton();
        btn_dialogoCC_Cancelar = new javax.swing.JButton();
        dialogoModificarClan = new javax.swing.JDialog();
        eti_dialogoMC_NombreClan = new javax.swing.JLabel();
        txt_dialogoMC_NombreClan = new javax.swing.JTextField();
        eti_dialogoMC_Tag = new javax.swing.JLabel();
        txt_dialogoMC_Tag = new javax.swing.JTextField();
        btn_dialogoMC_Modificar = new javax.swing.JButton();
        btn_dialogoMC_Cancelar = new javax.swing.JButton();
        dialogoEliminarClan = new javax.swing.JDialog();
        eti_dialogoEC_Clan = new javax.swing.JLabel();
        cb_dialogoEC_Clan = new javax.swing.JComboBox();
        btn_dialogoEC_Eliminar = new javax.swing.JButton();
        btn_dialogoEC_Cancelar = new javax.swing.JButton();
        dialogoCambioServidor = new javax.swing.JDialog();
        eti_dialogoCS_DireccionIP = new javax.swing.JLabel();
        txt_dialogoCS_DireccionIP = new javax.swing.JTextField();
        eti_dialogoCS_NombreBD = new javax.swing.JLabel();
        txt_dialogoCS_NombreBD = new javax.swing.JTextField();
        eti_dialogoCS_Usuario = new javax.swing.JLabel();
        txt_dialogoCS_Usuario = new javax.swing.JTextField();
        txt_dialogoCS_Contraseña = new javax.swing.JPasswordField();
        eti_dialogoCS_Contraseña = new javax.swing.JLabel();
        btn_dialogoCS_Aplicar = new javax.swing.JButton();
        btn_dialogoCS_Cancelar = new javax.swing.JButton();
        dialogoAcercaDe = new javax.swing.JDialog();
        btn_dialogoAD_Aceptar = new javax.swing.JButton();
        eti_dialogoAD_Texto = new javax.swing.JLabel();
        tituloBusqueda = new javax.swing.JLabel();
        tituloPersonaje = new javax.swing.JLabel();
        tituloEquipo = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JScrollPane();
        TablaPersonajes = new javax.swing.JTable();
        PanelInformacion = new javax.swing.JPanel();
        mostrarNombrePersonaje = new javax.swing.JLabel();
        etiNombrePersonaje = new javax.swing.JLabel();
        etiIdiomas = new javax.swing.JLabel();
        etiNombreCuenta = new javax.swing.JLabel();
        etiServidor = new javax.swing.JLabel();
        PanelAtributos = new javax.swing.JPanel();
        etiPoder = new javax.swing.JLabel();
        mostrarPoder = new javax.swing.JLabel();
        mostrarPrecision = new javax.swing.JLabel();
        mostrarDureza = new javax.swing.JLabel();
        mostrarVitalidad = new javax.swing.JLabel();
        mostrarDuracionBendicion = new javax.swing.JLabel();
        mostrarDanyoCondicion = new javax.swing.JLabel();
        mostrarDuracionCondicion = new javax.swing.JLabel();
        mostrarFerocidad = new javax.swing.JLabel();
        mostrarPoderCuracion = new javax.swing.JLabel();
        mostrarArmadura = new javax.swing.JLabel();
        mostrarProbabilidadCritica = new javax.swing.JLabel();
        mostrarDanyoCritico = new javax.swing.JLabel();
        mostrarSalud = new javax.swing.JLabel();
        mostrarAgonia = new javax.swing.JLabel();
        etiDanyoCondicion = new javax.swing.JLabel();
        etiPrecision = new javax.swing.JLabel();
        etiDureza = new javax.swing.JLabel();
        etiVitalidad = new javax.swing.JLabel();
        etiFerocidad = new javax.swing.JLabel();
        etiPoderCuracion = new javax.swing.JLabel();
        etiDuracionBendicion = new javax.swing.JLabel();
        etiDuracionCondicion = new javax.swing.JLabel();
        etiArmadura = new javax.swing.JLabel();
        etiSalud = new javax.swing.JLabel();
        etiProbabilidadCritica = new javax.swing.JLabel();
        etiDanyoCritico = new javax.swing.JLabel();
        etiAgonia = new javax.swing.JLabel();
        mostrarNombreCuenta = new javax.swing.JLabel();
        mostrarIdiomas = new javax.swing.JLabel();
        mostrarServidor = new javax.swing.JLabel();
        etiClase = new javax.swing.JLabel();
        mostrarClase = new javax.swing.JLabel();
        fondoInformacion = new javax.swing.JLabel();
        PanelEquipo = new javax.swing.JPanel();
        icoCabeza = new javax.swing.JLabel();
        icoHombros = new javax.swing.JLabel();
        icoPecho = new javax.swing.JLabel();
        icoManos = new javax.swing.JLabel();
        icoPiernas = new javax.swing.JLabel();
        icoPies = new javax.swing.JLabel();
        icoSet1 = new javax.swing.JLabel();
        icoArmaPSet1 = new javax.swing.JLabel();
        icoArmaSSet1 = new javax.swing.JLabel();
        icoSet2 = new javax.swing.JLabel();
        icoArmaPSet2 = new javax.swing.JLabel();
        icoArmaSSet2 = new javax.swing.JLabel();
        icoAnillo2 = new javax.swing.JLabel();
        icoAnillo1 = new javax.swing.JLabel();
        icoAccesorio2 = new javax.swing.JLabel();
        icoAccesorio1 = new javax.swing.JLabel();
        icoAmuleto = new javax.swing.JLabel();
        icoArmaAcu1 = new javax.swing.JLabel();
        icoArmaAcu2 = new javax.swing.JLabel();
        icoCabezaAcu = new javax.swing.JLabel();
        icoEspaldar = new javax.swing.JLabel();
        icoCambio2 = new javax.swing.JLabel();
        icoCambio1 = new javax.swing.JLabel();
        PanelEstadisticas = new javax.swing.JPanel();
        etiPieza = new javax.swing.JLabel();
        muestraPieza = new javax.swing.JLabel();
        etiRareza = new javax.swing.JLabel();
        muestraRareza = new javax.swing.JLabel();
        etiPoder1 = new javax.swing.JLabel();
        etiDureza1 = new javax.swing.JLabel();
        etiVitalidad1 = new javax.swing.JLabel();
        etiPrecision1 = new javax.swing.JLabel();
        etiFerocidad1 = new javax.swing.JLabel();
        etiDanyoCondicion1 = new javax.swing.JLabel();
        etiPoderCuracion1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fondoEquipo = new javax.swing.JLabel();
        PanelBusqueda = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        radPersonaje = new javax.swing.JRadioButton();
        radClan = new javax.swing.JRadioButton();
        radCuenta = new javax.swing.JRadioButton();
        etiNivelFracMinimo = new javax.swing.JLabel();
        txtNivelfracMinimo = new javax.swing.JTextField();
        etiResistAgoniaMin = new javax.swing.JLabel();
        txtAgoniaMinima = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etiIdioma = new javax.swing.JLabel();
        chkEspanyol = new javax.swing.JCheckBox();
        chkAleman = new javax.swing.JCheckBox();
        chkFrances = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        etiClases = new javax.swing.JLabel();
        chkGuardian = new javax.swing.JCheckBox();
        chkElementalista = new javax.swing.JCheckBox();
        chkGuerrero = new javax.swing.JCheckBox();
        chkNigromante = new javax.swing.JCheckBox();
        chkGuardabosques = new javax.swing.JCheckBox();
        chkIngeniero = new javax.swing.JCheckBox();
        chkLadron = new javax.swing.JCheckBox();
        chkHipnotizador = new javax.swing.JCheckBox();
        chkBuscarMiembrosMiClan = new javax.swing.JCheckBox();
        fondoBusqueda = new javax.swing.JLabel();
        etiConectadoComo = new javax.swing.JLabel();
        mostrarUsuario = new javax.swing.JLabel();
        cbPersonaje = new javax.swing.JComboBox();
        btnCrearPj = new javax.swing.JButton();
        btnModPj = new javax.swing.JButton();
        fondoConectadoComo = new javax.swing.JLabel();
        etiNivelFractales = new javax.swing.JLabel();
        usuNivelFractalActual = new javax.swing.JSpinner();
        fondoNivelFractales = new javax.swing.JLabel();
        etiPersonaje = new javax.swing.JLabel();
        fondoPersonaje = new javax.swing.JLabel();
        fondoPrincipal = new javax.swing.JLabel();
        MenuBarra = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        itemModificarDatos = new javax.swing.JMenuItem();
        separadorUsuario = new javax.swing.JPopupMenu.Separator();
        itemCerrarUsuario = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemRegPj = new javax.swing.JMenuItem();
        itemModPj = new javax.swing.JMenuItem();
        separadorEditar1 = new javax.swing.JPopupMenu.Separator();
        itemUnirClan = new javax.swing.JMenuItem();
        itemAbandonarClan = new javax.swing.JMenuItem();
        separadorEditar2 = new javax.swing.JPopupMenu.Separator();
        itemRegClan = new javax.swing.JMenuItem();
        itemModClan = new javax.swing.JMenuItem();
        itemEliminarClan = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        itemCambiarBD = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcerca = new javax.swing.JMenuItem();

        dialogoModificarUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarUsuario.setTitle("Modificar Usuario");
        dialogoModificarUsuario.setAlwaysOnTop(true);
        dialogoModificarUsuario.setResizable(false);

        cb_dialogoMU_Servidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoMU_NombreCuenta.setText("Nombre cuenta (GW2):");

        Panel_dialogoMU_Idiomas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chk_dialogoMU_Ingles.setText("Inglés");

        chk_dialogoMU_Espanyol.setText("Español");

        chk_dialogoMU_Aleman.setText("Aleman");

        chk_dialogoMU_Frances.setText("Francés");

        javax.swing.GroupLayout Panel_dialogoMU_IdiomasLayout = new javax.swing.GroupLayout(Panel_dialogoMU_Idiomas);
        Panel_dialogoMU_Idiomas.setLayout(Panel_dialogoMU_IdiomasLayout);
        Panel_dialogoMU_IdiomasLayout.setHorizontalGroup(
            Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_dialogoMU_IdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_dialogoMU_Ingles)
                    .addComponent(chk_dialogoMU_Aleman))
                .addGap(41, 41, 41)
                .addGroup(Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_dialogoMU_Espanyol)
                    .addComponent(chk_dialogoMU_Frances))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_dialogoMU_IdiomasLayout.setVerticalGroup(
            Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_dialogoMU_IdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoMU_Ingles)
                    .addComponent(chk_dialogoMU_Espanyol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_dialogoMU_IdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoMU_Aleman)
                    .addComponent(chk_dialogoMU_Frances))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eti_dialogoMU_Email.setText("Email:");

        eti_dialogoMU_Servidor.setText("Servidor:");

        eti_dialogoMU_Idiomas.setText("Idiomas:");

        mostar_dialogoMU_NombreCuenta.setText("-");

        Panel_dialogoMU_CambiarContrasenya.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cambiar Contraseña"));

        eti_dialogoMU_NuevaContrasenya.setText("Nueva contraseña:");

        eti_dialogoMU_RepetirContrasenya.setText("Repetir contraseña:");

        eti_dialogoMU_ContrasenyaAntigua.setText("Contraseña antigua:");

        javax.swing.GroupLayout Panel_dialogoMU_CambiarContrasenyaLayout = new javax.swing.GroupLayout(Panel_dialogoMU_CambiarContrasenya);
        Panel_dialogoMU_CambiarContrasenya.setLayout(Panel_dialogoMU_CambiarContrasenyaLayout);
        Panel_dialogoMU_CambiarContrasenyaLayout.setHorizontalGroup(
            Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                        .addComponent(eti_dialogoMU_RepetirContrasenya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dialogoMU_RepetirContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                        .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_dialogoMU_NuevaContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_dialogoMU_ContrasenyaAntigua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_dialogoMU_NuevaContrasenya, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txt_dialogoMU_ContrasenyaAntigua))))
                .addGap(25, 25, 25))
        );
        Panel_dialogoMU_CambiarContrasenyaLayout.setVerticalGroup(
            Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMU_ContrasenyaAntigua)
                    .addComponent(txt_dialogoMU_ContrasenyaAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoMU_NuevaContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMU_NuevaContrasenya))
                .addGap(18, 18, 18)
                .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoMU_RepetirContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMU_RepetirContrasenya))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_dialogoMU_Modificar.setText("Modificar");

        btn_dialogoMU_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoModificarUsuarioLayout = new javax.swing.GroupLayout(dialogoModificarUsuario.getContentPane());
        dialogoModificarUsuario.getContentPane().setLayout(dialogoModificarUsuarioLayout);
        dialogoModificarUsuarioLayout.setHorizontalGroup(
            dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarUsuarioLayout.createSequentialGroup()
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoModificarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_dialogoMU_CambiarContrasenya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dialogoModificarUsuarioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eti_dialogoMU_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eti_dialogoMU_NombreCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eti_dialogoMU_Idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_dialogoMU_Servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panel_dialogoMU_Idiomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_dialogoMU_Email)
                            .addComponent(cb_dialogoMU_Servidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostar_dialogoMU_NombreCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dialogoModificarUsuarioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btn_dialogoMU_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dialogoMU_Cancelar)
                .addGap(70, 70, 70))
        );
        dialogoModificarUsuarioLayout.setVerticalGroup(
            dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMU_NombreCuenta)
                    .addComponent(mostar_dialogoMU_NombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMU_Email)
                    .addComponent(txt_dialogoMU_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMU_Servidor)
                    .addComponent(cb_dialogoMU_Servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_dialogoMU_Idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMU_Idiomas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_dialogoMU_CambiarContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoMU_Modificar)
                    .addComponent(btn_dialogoMU_Cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dialogoRegistrarPersonaje.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoRegistrarPersonaje.setTitle("Registrar Personaje");
        dialogoRegistrarPersonaje.setAlwaysOnTop(true);
        dialogoRegistrarPersonaje.setResizable(false);

        eti_dialogoRP_Nombre.setText("Nombre:");

        txt_dialogoRP_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoRP_NombreActionPerformed(evt);
            }
        });

        eti_dialogoRP_Raza.setText("Raza:");

        cb_dialogoRP_Raza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_dialogoRP_Clase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoRP_Clase.setText("Clase:");

        panel_dialogoRP_Equipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Equipo"));

        eti_dialogoRP_SlotArma.setText("Slot del Arma:");

        cb_dialogoRP_SlotArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel_dialogoRP_ConfigArmadura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Configuración del Armadura"));

        cb_dialogoRP_RarezaArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoRP_RarezaArmadura.setText("Rareza:");

        eti_dialogoRP_ModificadorArmadura.setText("Modificador:");

        cb_dialogoRP_ModificadorArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chk_dialogoRP_InfusionSimpleArmadura.setText("Infusión Simple (+5 AR)");

        eti_dialogoRP_InfusionAgoniaArmadura.setText("Infusión Agonía:  +");

        eti_dialogoRP_AR.setText("AR");

        javax.swing.GroupLayout panel_dialogoRP_ConfigArmaduraLayout = new javax.swing.GroupLayout(panel_dialogoRP_ConfigArmadura);
        panel_dialogoRP_ConfigArmadura.setLayout(panel_dialogoRP_ConfigArmaduraLayout);
        panel_dialogoRP_ConfigArmaduraLayout.setHorizontalGroup(
            panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createSequentialGroup()
                .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eti_dialogoRP_RarezaArmadura)
                        .addGap(48, 48, 48)
                        .addComponent(cb_dialogoRP_RarezaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chk_dialogoRP_InfusionSimpleArmadura)
                        .addGap(36, 36, 36)))
                .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoRP_ModificadorArmadura)
                    .addComponent(eti_dialogoRP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dialogoRP_ModificadorArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createSequentialGroup()
                        .addComponent(txt_dialogoRP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eti_dialogoRP_AR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dialogoRP_ConfigArmaduraLayout.setVerticalGroup(
            panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createSequentialGroup()
                .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoRP_RarezaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_RarezaArmadura)
                    .addComponent(cb_dialogoRP_ModificadorArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_ModificadorArmadura))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoRP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoRP_InfusionSimpleArmadura)
                    .addComponent(eti_dialogoRP_InfusionAgoniaArmadura)
                    .addComponent(txt_dialogoRP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_AR)))
        );

        eti_dialogoRP_SlotArmadura.setText("Slot de la Armadura:");

        cb_dialogoRP_SlotArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel_dialogoRP_ConfigArma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Configuración del Arma"));

        cb_dialogoRP_TipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoRP_TipoArma.setText("Tipo de Arma:");

        cb_dialogoRP_RarezaArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoRP_RarezaArma.setText("Rareza:");

        eti_dialogoRP_ModificadorArma.setText("Modificador:");

        cb_dialogoRP_ModificadorArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chk_dialogoRP_InfusionSimple1Arma.setText("Infusión Simple 1");

        chk_dialogoRP_InfusionSimple2Arma.setText("Infusión Simple 2");

        javax.swing.GroupLayout panel_dialogoRP_ConfigArmaLayout = new javax.swing.GroupLayout(panel_dialogoRP_ConfigArma);
        panel_dialogoRP_ConfigArma.setLayout(panel_dialogoRP_ConfigArmaLayout);
        panel_dialogoRP_ConfigArmaLayout.setHorizontalGroup(
            panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_ConfigArmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoRP_TipoArma)
                    .addComponent(eti_dialogoRP_RarezaArma))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_dialogoRP_TipoArma, 0, 120, Short.MAX_VALUE)
                    .addComponent(cb_dialogoRP_RarezaArma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_dialogoRP_InfusionSimple1Arma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_dialogoRP_ConfigArmaLayout.createSequentialGroup()
                        .addComponent(chk_dialogoRP_InfusionSimple2Arma)
                        .addGap(120, 120, 120))
                    .addGroup(panel_dialogoRP_ConfigArmaLayout.createSequentialGroup()
                        .addComponent(eti_dialogoRP_ModificadorArma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_dialogoRP_ModificadorArma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel_dialogoRP_ConfigArmaLayout.setVerticalGroup(
            panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_ConfigArmaLayout.createSequentialGroup()
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoRP_TipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_TipoArma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoRP_RarezaArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_RarezaArma)
                    .addComponent(eti_dialogoRP_ModificadorArma)
                    .addComponent(cb_dialogoRP_ModificadorArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoRP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoRP_InfusionSimple1Arma)
                    .addComponent(chk_dialogoRP_InfusionSimple2Arma)))
        );

        javax.swing.GroupLayout panel_dialogoRP_EquipoLayout = new javax.swing.GroupLayout(panel_dialogoRP_Equipo);
        panel_dialogoRP_Equipo.setLayout(panel_dialogoRP_EquipoLayout);
        panel_dialogoRP_EquipoLayout.setHorizontalGroup(
            panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_dialogoRP_ConfigArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                        .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                                .addComponent(eti_dialogoRP_SlotArma)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dialogoRP_EquipoLayout.createSequentialGroup()
                                .addComponent(eti_dialogoRP_SlotArmadura)
                                .addGap(18, 18, 18)))
                        .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_dialogoRP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_dialogoRP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_dialogoRP_ConfigArma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_dialogoRP_EquipoLayout.setVerticalGroup(
            panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoRP_SlotArma)
                    .addComponent(cb_dialogoRP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_dialogoRP_ConfigArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoRP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_SlotArmadura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_dialogoRP_ConfigArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_dialogoRP_Registrar.setText("Registrar");

        btn_dialogoRP_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoRegistrarPersonajeLayout = new javax.swing.GroupLayout(dialogoRegistrarPersonaje.getContentPane());
        dialogoRegistrarPersonaje.getContentPane().setLayout(dialogoRegistrarPersonajeLayout);
        dialogoRegistrarPersonajeLayout.setHorizontalGroup(
            dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoRegistrarPersonajeLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btn_dialogoRP_Registrar)
                .addGap(122, 122, 122)
                .addComponent(btn_dialogoRP_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoRegistrarPersonajeLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoRegistrarPersonajeLayout.createSequentialGroup()
                        .addComponent(panel_dialogoRP_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoRegistrarPersonajeLayout.createSequentialGroup()
                        .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_dialogoRP_Nombre)
                            .addComponent(eti_dialogoRP_Raza))
                        .addGap(30, 30, 30)
                        .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dialogoRP_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_dialogoRP_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(eti_dialogoRP_Clase)
                        .addGap(31, 31, 31)
                        .addComponent(cb_dialogoRP_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        dialogoRegistrarPersonajeLayout.setVerticalGroup(
            dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoRegistrarPersonajeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoRP_Nombre)
                    .addComponent(txt_dialogoRP_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoRP_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_Raza)
                    .addComponent(cb_dialogoRP_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoRP_Clase))
                .addGap(18, 18, 18)
                .addComponent(panel_dialogoRP_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoRegistrarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoRP_Registrar)
                    .addComponent(btn_dialogoRP_Cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dialogoModificarPersonaje.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarPersonaje.setTitle("Modificar Personaje");
        dialogoModificarPersonaje.setAlwaysOnTop(true);
        dialogoModificarPersonaje.setMinimumSize(new java.awt.Dimension(570, 473));
        dialogoModificarPersonaje.setModal(true);
        dialogoModificarPersonaje.setResizable(false);

        eti_dialogoMP_Nombre.setText("Nombre:");

        txt_dialogoMP_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoMP_NombreActionPerformed(evt);
            }
        });

        eti_dialogoMP_Raza.setText("Raza:");

        cb_dialogoMP_Raza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_dialogoMP_Clase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoMP_Clase.setText("Clase:");

        panel_dialogoMP_Equipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Equipo"));

        eti_dialogoMP_SlotArma.setText("Slot del Arma:");

        cb_dialogoMP_SlotArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel_dialogoMP_ConfigArmadura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Configuración del Armadura"));

        cb_dialogoMP_RarezaArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoMP_RarezaArmadura.setText("Rareza:");

        eti_dialogoMP_ModificadorArmadura.setText("Modificador:");

        cb_dialogoMP_ModificadorArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chk_dialogoMP_InfusionSimpleArmadura.setText("Infusión Simple (+5 AR)");
        chk_dialogoMP_InfusionSimpleArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_dialogoMP_InfusionSimpleArmaduraActionPerformed(evt);
            }
        });

        eti_dialogoMP_InfusionAgoniaArmadura.setText("Infusión Agonía:  +");

        eti_dialogoMP_AR.setText("AR");

        javax.swing.GroupLayout panel_dialogoMP_ConfigArmaduraLayout = new javax.swing.GroupLayout(panel_dialogoMP_ConfigArmadura);
        panel_dialogoMP_ConfigArmadura.setLayout(panel_dialogoMP_ConfigArmaduraLayout);
        panel_dialogoMP_ConfigArmaduraLayout.setHorizontalGroup(
            panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createSequentialGroup()
                .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eti_dialogoMP_RarezaArmadura)
                        .addGap(48, 48, 48)
                        .addComponent(cb_dialogoMP_RarezaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chk_dialogoMP_InfusionSimpleArmadura)
                        .addGap(36, 36, 36)))
                .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoMP_ModificadorArmadura)
                    .addComponent(eti_dialogoMP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dialogoMP_ModificadorArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createSequentialGroup()
                        .addComponent(txt_dialogoMP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eti_dialogoMP_AR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dialogoMP_ConfigArmaduraLayout.setVerticalGroup(
            panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createSequentialGroup()
                .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoMP_RarezaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_RarezaArmadura)
                    .addComponent(cb_dialogoMP_ModificadorArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_ModificadorArmadura))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoMP_ConfigArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoMP_InfusionSimpleArmadura)
                    .addComponent(eti_dialogoMP_InfusionAgoniaArmadura)
                    .addComponent(txt_dialogoMP_InfusionAgoniaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_AR)))
        );

        eti_dialogoMP_SlotArmadura.setText("Slot de la Armadura:");

        cb_dialogoMP_SlotArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel_dialogoMP_ConfigArma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Configuración del Arma"));

        cb_dialogoMP_TipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoMP_TipoArma.setText("Tipo de Arma:");

        cb_dialogoMP_RarezaArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_dialogoMP_RarezaArma.setText("Rareza:");

        eti_dialogoMP_ModificadorArma.setText("Modificador:");

        cb_dialogoMP_ModificadorArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chk_dialogoMP_InfusionSimple1Arma.setText("Infusión Simple 1");

        chk_dialogoMP_InfusionSimple2Arma.setText("Infusión Simple 2");

        javax.swing.GroupLayout panel_dialogoMP_ConfigArmaLayout = new javax.swing.GroupLayout(panel_dialogoMP_ConfigArma);
        panel_dialogoMP_ConfigArma.setLayout(panel_dialogoMP_ConfigArmaLayout);
        panel_dialogoMP_ConfigArmaLayout.setHorizontalGroup(
            panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_ConfigArmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoMP_TipoArma)
                    .addComponent(eti_dialogoMP_RarezaArma))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_dialogoMP_TipoArma, 0, 120, Short.MAX_VALUE)
                    .addComponent(cb_dialogoMP_RarezaArma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_dialogoMP_InfusionSimple1Arma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_dialogoMP_ConfigArmaLayout.createSequentialGroup()
                        .addComponent(chk_dialogoMP_InfusionSimple2Arma)
                        .addGap(120, 120, 120))
                    .addGroup(panel_dialogoMP_ConfigArmaLayout.createSequentialGroup()
                        .addComponent(eti_dialogoMP_ModificadorArma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_dialogoMP_ModificadorArma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel_dialogoMP_ConfigArmaLayout.setVerticalGroup(
            panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_ConfigArmaLayout.createSequentialGroup()
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoMP_TipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_TipoArma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoMP_RarezaArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_RarezaArma)
                    .addComponent(eti_dialogoMP_ModificadorArma)
                    .addComponent(cb_dialogoMP_ModificadorArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoMP_ConfigArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_dialogoMP_InfusionSimple1Arma)
                    .addComponent(chk_dialogoMP_InfusionSimple2Arma)))
        );

        javax.swing.GroupLayout panel_dialogoMP_EquipoLayout = new javax.swing.GroupLayout(panel_dialogoMP_Equipo);
        panel_dialogoMP_Equipo.setLayout(panel_dialogoMP_EquipoLayout);
        panel_dialogoMP_EquipoLayout.setHorizontalGroup(
            panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_dialogoMP_ConfigArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                        .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                                .addComponent(eti_dialogoMP_SlotArma)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dialogoMP_EquipoLayout.createSequentialGroup()
                                .addComponent(eti_dialogoMP_SlotArmadura)
                                .addGap(18, 18, 18)))
                        .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_dialogoMP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_dialogoMP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_dialogoMP_ConfigArma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_dialogoMP_EquipoLayout.setVerticalGroup(
            panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMP_SlotArma)
                    .addComponent(cb_dialogoMP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_dialogoMP_ConfigArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoMP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_SlotArmadura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_dialogoMP_ConfigArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_dialogoMP_Modificar.setText("Modificar");

        btn_dialogoMP_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoModificarPersonajeLayout = new javax.swing.GroupLayout(dialogoModificarPersonaje.getContentPane());
        dialogoModificarPersonaje.getContentPane().setLayout(dialogoModificarPersonajeLayout);
        dialogoModificarPersonajeLayout.setHorizontalGroup(
            dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarPersonajeLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btn_dialogoMP_Modificar)
                .addGap(122, 122, 122)
                .addComponent(btn_dialogoMP_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoModificarPersonajeLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoModificarPersonajeLayout.createSequentialGroup()
                        .addComponent(panel_dialogoMP_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoModificarPersonajeLayout.createSequentialGroup()
                        .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_dialogoMP_Nombre)
                            .addComponent(eti_dialogoMP_Raza))
                        .addGap(30, 30, 30)
                        .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dialogoMP_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_dialogoMP_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(eti_dialogoMP_Clase)
                        .addGap(31, 31, 31)
                        .addComponent(cb_dialogoMP_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        dialogoModificarPersonajeLayout.setVerticalGroup(
            dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarPersonajeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMP_Nombre)
                    .addComponent(txt_dialogoMP_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoMP_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_Raza)
                    .addComponent(cb_dialogoMP_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMP_Clase))
                .addGap(18, 18, 18)
                .addComponent(panel_dialogoMP_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoMP_Modificar)
                    .addComponent(btn_dialogoMP_Cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dialogoUnirseClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoUnirseClan.setTitle("Unirse al Clan");
        dialogoUnirseClan.setAlwaysOnTop(true);
        dialogoUnirseClan.setResizable(false);

        eti_dialogoUC_Clan.setText("Clan:");

        cb_dialogoUC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoUC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoUC_ClanActionPerformed(evt);
            }
        });

        btn_dialogoUC_Unirse.setText("Unirse");

        btn_dialogoUC_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoUnirseClanLayout = new javax.swing.GroupLayout(dialogoUnirseClan.getContentPane());
        dialogoUnirseClan.getContentPane().setLayout(dialogoUnirseClanLayout);
        dialogoUnirseClanLayout.setHorizontalGroup(
            dialogoUnirseClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoUnirseClanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(eti_dialogoUC_Clan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(cb_dialogoUC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(dialogoUnirseClanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_dialogoUC_Unirse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dialogoUC_Cancelar)
                .addGap(45, 45, 45))
        );
        dialogoUnirseClanLayout.setVerticalGroup(
            dialogoUnirseClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoUnirseClanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dialogoUnirseClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoUC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoUC_Clan))
                .addGap(32, 32, 32)
                .addGroup(dialogoUnirseClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoUC_Unirse)
                    .addComponent(btn_dialogoUC_Cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        dialogoAbandonarClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoAbandonarClan.setTitle("Abandonar Clan");
        dialogoAbandonarClan.setAlwaysOnTop(true);
        dialogoAbandonarClan.setResizable(false);

        eti_dialogoAC_Clan.setText("Clan:");

        cb_dialogoAC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoAC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoAC_ClanActionPerformed(evt);
            }
        });

        btn_dialogoAC_Abandonar.setText("Abandonar");

        btn_dialogoAC_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoAbandonarClanLayout = new javax.swing.GroupLayout(dialogoAbandonarClan.getContentPane());
        dialogoAbandonarClan.getContentPane().setLayout(dialogoAbandonarClanLayout);
        dialogoAbandonarClanLayout.setHorizontalGroup(
            dialogoAbandonarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAbandonarClanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(eti_dialogoAC_Clan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(cb_dialogoAC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(dialogoAbandonarClanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_dialogoAC_Abandonar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dialogoAC_Cancelar)
                .addGap(45, 45, 45))
        );
        dialogoAbandonarClanLayout.setVerticalGroup(
            dialogoAbandonarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAbandonarClanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dialogoAbandonarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoAC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoAC_Clan))
                .addGap(32, 32, 32)
                .addGroup(dialogoAbandonarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoAC_Abandonar)
                    .addComponent(btn_dialogoAC_Cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        dialogoCrearClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoCrearClan.setTitle("Crear Clan");
        dialogoCrearClan.setAlwaysOnTop(true);
        dialogoCrearClan.setResizable(false);

        eti_dialogoCC_NombreClan.setText("Nombre del Clan:");

        txt_dialogoCC_NombreClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoCC_NombreClanActionPerformed(evt);
            }
        });

        eti_dialogoCC_Tag.setText("Tag:");

        btn_dialogoCC_Crear.setText("Crear");
        btn_dialogoCC_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoCC_CrearActionPerformed(evt);
            }
        });

        btn_dialogoCC_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoCrearClanLayout = new javax.swing.GroupLayout(dialogoCrearClan.getContentPane());
        dialogoCrearClan.getContentPane().setLayout(dialogoCrearClanLayout);
        dialogoCrearClanLayout.setHorizontalGroup(
            dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCrearClanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_dialogoCC_Crear)
                    .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eti_dialogoCC_NombreClan)
                        .addComponent(eti_dialogoCC_Tag)))
                .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoCrearClanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dialogoCC_NombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dialogoCC_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(dialogoCrearClanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_dialogoCC_Cancelar)
                        .addGap(51, 51, 51))))
        );
        dialogoCrearClanLayout.setVerticalGroup(
            dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCrearClanLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoCC_NombreClan)
                    .addComponent(txt_dialogoCC_NombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoCC_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoCC_Tag))
                .addGap(31, 31, 31)
                .addGroup(dialogoCrearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoCC_Crear)
                    .addComponent(btn_dialogoCC_Cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dialogoModificarClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarClan.setTitle("Modificar Clan");
        dialogoModificarClan.setAlwaysOnTop(true);
        dialogoModificarClan.setResizable(false);

        eti_dialogoMC_NombreClan.setText("Nombre del Clan:");

        txt_dialogoMC_NombreClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoMC_NombreClanActionPerformed(evt);
            }
        });

        eti_dialogoMC_Tag.setText("Tag:");

        btn_dialogoMC_Modificar.setText("Crear");
        btn_dialogoMC_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoMC_ModificarActionPerformed(evt);
            }
        });

        btn_dialogoMC_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoModificarClanLayout = new javax.swing.GroupLayout(dialogoModificarClan.getContentPane());
        dialogoModificarClan.getContentPane().setLayout(dialogoModificarClanLayout);
        dialogoModificarClanLayout.setHorizontalGroup(
            dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarClanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_dialogoMC_Modificar)
                    .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eti_dialogoMC_NombreClan)
                        .addComponent(eti_dialogoMC_Tag)))
                .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoModificarClanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dialogoMC_NombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dialogoMC_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(dialogoModificarClanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_dialogoMC_Cancelar)
                        .addGap(51, 51, 51))))
        );
        dialogoModificarClanLayout.setVerticalGroup(
            dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarClanLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_dialogoMC_NombreClan)
                    .addComponent(txt_dialogoMC_NombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoMC_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoMC_Tag))
                .addGap(31, 31, 31)
                .addGroup(dialogoModificarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoMC_Modificar)
                    .addComponent(btn_dialogoMC_Cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dialogoEliminarClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoEliminarClan.setTitle("Eliminar Clan");
        dialogoEliminarClan.setAlwaysOnTop(true);
        dialogoEliminarClan.setResizable(false);

        eti_dialogoEC_Clan.setText("Clan:");

        cb_dialogoEC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoEC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoEC_ClanActionPerformed(evt);
            }
        });

        btn_dialogoEC_Eliminar.setText("Eliminar");

        btn_dialogoEC_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoEliminarClanLayout = new javax.swing.GroupLayout(dialogoEliminarClan.getContentPane());
        dialogoEliminarClan.getContentPane().setLayout(dialogoEliminarClanLayout);
        dialogoEliminarClanLayout.setHorizontalGroup(
            dialogoEliminarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoEliminarClanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(eti_dialogoEC_Clan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(cb_dialogoEC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(dialogoEliminarClanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_dialogoEC_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dialogoEC_Cancelar)
                .addGap(45, 45, 45))
        );
        dialogoEliminarClanLayout.setVerticalGroup(
            dialogoEliminarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoEliminarClanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dialogoEliminarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_dialogoEC_Clan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoEC_Clan))
                .addGap(32, 32, 32)
                .addGroup(dialogoEliminarClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoEC_Eliminar)
                    .addComponent(btn_dialogoEC_Cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        dialogoCambioServidor.setTitle("Cambiar Servidor");
        dialogoCambioServidor.setAlwaysOnTop(true);
        dialogoCambioServidor.setResizable(false);

        eti_dialogoCS_DireccionIP.setText("Dirección IP:");

        eti_dialogoCS_NombreBD.setText("Nombre de la Base de Datos:");

        eti_dialogoCS_Usuario.setText("Usuario de la BD:");

        eti_dialogoCS_Contraseña.setText("Contraseña:");

        btn_dialogoCS_Aplicar.setText("Aplicar");

        btn_dialogoCS_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout dialogoCambioServidorLayout = new javax.swing.GroupLayout(dialogoCambioServidor.getContentPane());
        dialogoCambioServidor.getContentPane().setLayout(dialogoCambioServidorLayout);
        dialogoCambioServidorLayout.setHorizontalGroup(
            dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCambioServidorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoCS_DireccionIP)
                    .addComponent(eti_dialogoCS_NombreBD)
                    .addComponent(eti_dialogoCS_Usuario)
                    .addComponent(eti_dialogoCS_Contraseña))
                .addGap(18, 18, 18)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_dialogoCS_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt_dialogoCS_NombreBD)
                    .addComponent(txt_dialogoCS_DireccionIP)
                    .addComponent(txt_dialogoCS_Usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dialogoCambioServidorLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_dialogoCS_Aplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btn_dialogoCS_Cancelar)
                .addGap(56, 56, 56))
        );
        dialogoCambioServidorLayout.setVerticalGroup(
            dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCambioServidorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoCS_DireccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoCS_DireccionIP))
                .addGap(18, 18, 18)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoCS_NombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoCS_NombreBD))
                .addGap(18, 18, 18)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoCS_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoCS_Usuario))
                .addGap(18, 18, 18)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dialogoCS_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dialogoCS_Contraseña))
                .addGap(34, 34, 34)
                .addGroup(dialogoCambioServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dialogoCS_Aplicar)
                    .addComponent(btn_dialogoCS_Cancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_dialogoAD_Aceptar.setText("Aceptar");

        eti_dialogoAD_Texto.setText("jLabel2");

        javax.swing.GroupLayout dialogoAcercaDeLayout = new javax.swing.GroupLayout(dialogoAcercaDe.getContentPane());
        dialogoAcercaDe.getContentPane().setLayout(dialogoAcercaDeLayout);
        dialogoAcercaDeLayout.setHorizontalGroup(
            dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAcercaDeLayout.createSequentialGroup()
                .addGroup(dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoAcercaDeLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_dialogoAD_Aceptar))
                    .addGroup(dialogoAcercaDeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(eti_dialogoAD_Texto)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        dialogoAcercaDeLayout.setVerticalGroup(
            dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAcercaDeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(eti_dialogoAD_Texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btn_dialogoAD_Aceptar)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guild Wars 2 Character Browser");
        setMinimumSize(new java.awt.Dimension(982, 661));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/busqueda.png"))); // NOI18N
        getContentPane().add(tituloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 220, 40));

        tituloPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/personaje.png"))); // NOI18N
        getContentPane().add(tituloPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 378, 220, 40));

        tituloEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/equipo.png"))); // NOI18N
        getContentPane().add(tituloEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 220, 40));

        PanelTabla.setBackground(new java.awt.Color(255, 51, 51));
        PanelTabla.setBorder(null);
        PanelTabla.setOpaque(false);

        TablaPersonajes.setForeground(new java.awt.Color(27, 23, 20));
        TablaPersonajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPersonajes.setOpaque(false);
        TablaPersonajes.getTableHeader().setResizingAllowed(false);
        TablaPersonajes.getTableHeader().setReorderingAllowed(false);
        PanelTabla.setViewportView(TablaPersonajes);

        getContentPane().add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 580, 330));

        PanelInformacion.setMaximumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setMinimumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setPreferredSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarNombrePersonaje.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombrePersonaje.setText("-");
        PanelInformacion.add(mostrarNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, -1));

        etiNombrePersonaje.setForeground(new java.awt.Color(209, 194, 170));
        etiNombrePersonaje.setText("Nombre Personaje:");
        PanelInformacion.add(etiNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        etiIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        etiIdiomas.setText("Idiomas:");
        PanelInformacion.add(etiIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, -1));

        etiNombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        etiNombreCuenta.setText("Nombre de cuenta:");
        PanelInformacion.add(etiNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        etiServidor.setForeground(new java.awt.Color(209, 194, 170));
        etiServidor.setText("Servidor:");
        PanelInformacion.add(etiServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 50, -1));

        PanelAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Atributos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        PanelAtributos.setOpaque(false);

        etiPoder.setForeground(new java.awt.Color(209, 194, 170));
        etiPoder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Power.png"))); // NOI18N
        etiPoder.setText("  Poder:");

        mostrarPoder.setForeground(new java.awt.Color(209, 194, 170));
        mostrarPoder.setText("-");

        mostrarPrecision.setForeground(new java.awt.Color(209, 194, 170));
        mostrarPrecision.setText("-");

        mostrarDureza.setForeground(new java.awt.Color(209, 194, 170));
        mostrarDureza.setText("-");

        mostrarVitalidad.setForeground(new java.awt.Color(209, 194, 170));
        mostrarVitalidad.setText("-");

        mostrarDuracionBendicion.setForeground(new java.awt.Color(209, 194, 170));
        mostrarDuracionBendicion.setText("-");

        mostrarDanyoCondicion.setForeground(new java.awt.Color(209, 194, 170));
        mostrarDanyoCondicion.setText("-");

        mostrarDuracionCondicion.setForeground(new java.awt.Color(209, 194, 170));
        mostrarDuracionCondicion.setText("-");

        mostrarFerocidad.setForeground(new java.awt.Color(209, 194, 170));
        mostrarFerocidad.setText("-");

        mostrarPoderCuracion.setForeground(new java.awt.Color(209, 194, 170));
        mostrarPoderCuracion.setText("-");

        mostrarArmadura.setForeground(new java.awt.Color(209, 194, 170));
        mostrarArmadura.setText("-");

        mostrarProbabilidadCritica.setForeground(new java.awt.Color(209, 194, 170));
        mostrarProbabilidadCritica.setText("-");

        mostrarDanyoCritico.setForeground(new java.awt.Color(209, 194, 170));
        mostrarDanyoCritico.setText("-");

        mostrarSalud.setForeground(new java.awt.Color(209, 194, 170));
        mostrarSalud.setText("-");

        mostrarAgonia.setForeground(new java.awt.Color(209, 194, 170));
        mostrarAgonia.setText("-");

        etiDanyoCondicion.setForeground(new java.awt.Color(209, 194, 170));
        etiDanyoCondicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Condition_Damage.png"))); // NOI18N
        etiDanyoCondicion.setText("  Daño de Condición:");

        etiPrecision.setForeground(new java.awt.Color(209, 194, 170));
        etiPrecision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Precision.png"))); // NOI18N
        etiPrecision.setText("  Precisión:");

        etiDureza.setForeground(new java.awt.Color(209, 194, 170));
        etiDureza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Toughness.png"))); // NOI18N
        etiDureza.setText("  Dureza:");

        etiVitalidad.setForeground(new java.awt.Color(209, 194, 170));
        etiVitalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Vitality.png"))); // NOI18N
        etiVitalidad.setText("  Vitalidad:");

        etiFerocidad.setForeground(new java.awt.Color(209, 194, 170));
        etiFerocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Ferocity.png"))); // NOI18N
        etiFerocidad.setText("  Ferocidad:");

        etiPoderCuracion.setForeground(new java.awt.Color(209, 194, 170));
        etiPoderCuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/18px-Healing_Power.png"))); // NOI18N
        etiPoderCuracion.setText("  Poder de Curación:");

        etiDuracionBendicion.setForeground(new java.awt.Color(209, 194, 170));
        etiDuracionBendicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Boon_Duration.png"))); // NOI18N
        etiDuracionBendicion.setText("  Durac. Bendición:");

        etiDuracionCondicion.setForeground(new java.awt.Color(209, 194, 170));
        etiDuracionCondicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Condition_Duration.png"))); // NOI18N
        etiDuracionCondicion.setText("  Durac. de Condición:");

        etiArmadura.setForeground(new java.awt.Color(209, 194, 170));
        etiArmadura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Armor.png"))); // NOI18N
        etiArmadura.setText("  Armadura:");

        etiSalud.setForeground(new java.awt.Color(209, 194, 170));
        etiSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Health.png"))); // NOI18N
        etiSalud.setText("  Salud:");

        etiProbabilidadCritica.setForeground(new java.awt.Color(209, 194, 170));
        etiProbabilidadCritica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Critical_Chance.png"))); // NOI18N
        etiProbabilidadCritica.setText("  Prob. Crítica:");

        etiDanyoCritico.setForeground(new java.awt.Color(209, 194, 170));
        etiDanyoCritico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Critical_Damage.png"))); // NOI18N
        etiDanyoCritico.setText("  Daño Crítico:");

        etiAgonia.setForeground(new java.awt.Color(209, 194, 170));
        etiAgonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Atributos/Agony_Resistance.png"))); // NOI18N
        etiAgonia.setText("  Resist. Agonía:");

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etiPoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiDureza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiPrecision, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addComponent(etiVitalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarPrecision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarDureza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarVitalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarPoder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiDanyoCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiDuracionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiDuracionBendicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addComponent(etiPoderCuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiFerocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarDuracionBendicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mostrarPoderCuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarFerocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDuracionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDanyoCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etiAgonia, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(etiProbabilidadCritica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(etiSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiDanyoCritico, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarProbabilidadCritica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarDanyoCritico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarSalud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarAgonia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelAtributosLayout.setVerticalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiArmadura)
                            .addComponent(mostrarArmadura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiProbabilidadCritica)
                            .addComponent(mostrarProbabilidadCritica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDanyoCritico)
                            .addComponent(mostrarDanyoCritico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarSalud)
                            .addComponent(etiSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiAgonia)
                            .addComponent(mostrarAgonia)))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPoder)
                            .addComponent(mostrarPoder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPrecision)
                            .addComponent(mostrarPrecision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDureza)
                            .addComponent(mostrarDureza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiVitalidad)
                            .addComponent(mostrarVitalidad)))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDuracionBendicion)
                            .addComponent(mostrarDuracionBendicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDanyoCondicion)
                            .addComponent(mostrarDanyoCondicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDuracionCondicion)
                            .addComponent(mostrarDuracionCondicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiFerocidad)
                            .addComponent(mostrarFerocidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPoderCuracion)
                            .addComponent(mostrarPoderCuracion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelInformacion.add(PanelAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 560, 150));

        mostrarNombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombreCuenta.setText("-");
        PanelInformacion.add(mostrarNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 112, -1));

        mostrarIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        mostrarIdiomas.setText("-");
        mostrarIdiomas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelInformacion.add(mostrarIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, -1));

        mostrarServidor.setForeground(new java.awt.Color(209, 194, 170));
        mostrarServidor.setText("-");
        PanelInformacion.add(mostrarServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, -1));

        etiClase.setForeground(new java.awt.Color(209, 194, 170));
        etiClase.setText("Clase:");
        PanelInformacion.add(etiClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 40, -1));

        mostrarClase.setForeground(new java.awt.Color(209, 194, 170));
        mostrarClase.setText("-");
        PanelInformacion.add(mostrarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 80, -1));

        fondoInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        PanelInformacion.add(fondoInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 230));

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 580, 230));

        PanelEquipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelEquipo.setLayout(null);

        icoCabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/cabeza.jpg"))); // NOI18N
        PanelEquipo.add(icoCabeza);
        icoCabeza.setBounds(10, 20, 60, 54);

        icoHombros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/hombreras.jpg"))); // NOI18N
        PanelEquipo.add(icoHombros);
        icoHombros.setBounds(10, 80, 60, 54);

        icoPecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/pecho.jpg"))); // NOI18N
        PanelEquipo.add(icoPecho);
        icoPecho.setBounds(10, 140, 60, 54);

        icoManos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/guantes.jpg"))); // NOI18N
        PanelEquipo.add(icoManos);
        icoManos.setBounds(10, 200, 60, 54);

        icoPiernas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pantalon.jpg"))); // NOI18N
        PanelEquipo.add(icoPiernas);
        icoPiernas.setBounds(10, 260, 60, 54);

        icoPies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botas.jpg"))); // NOI18N
        PanelEquipo.add(icoPies);
        icoPies.setBounds(10, 320, 60, 54);

        icoSet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Armas/Set1.png"))); // NOI18N
        icoSet1.setText("jLabel10");
        PanelEquipo.add(icoSet1);
        icoSet1.setBounds(107, 66, 30, 22);

        icoArmaPSet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/ArmaPSet1.png"))); // NOI18N
        PanelEquipo.add(icoArmaPSet1);
        icoArmaPSet1.setBounds(90, 20, 60, 60);

        icoArmaSSet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/ArmaSSet1.png"))); // NOI18N
        icoArmaSSet1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaSSet1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaSSet1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaSSet1);
        icoArmaSSet1.setBounds(95, 78, 50, 50);

        icoSet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Armas/Set2.png"))); // NOI18N
        icoSet2.setText("jLabel10");
        PanelEquipo.add(icoSet2);
        icoSet2.setBounds(197, 66, 30, 20);

        icoArmaPSet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/ArmaPSet2.png"))); // NOI18N
        PanelEquipo.add(icoArmaPSet2);
        icoArmaPSet2.setBounds(180, 20, 60, 60);

        icoArmaSSet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/ArmaSSet2.png"))); // NOI18N
        icoArmaSSet2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaSSet2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaSSet2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaSSet2);
        icoArmaSSet2.setBounds(185, 78, 50, 50);

        icoAnillo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/anillo2.jpg"))); // NOI18N
        icoAnillo2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAnillo2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAnillo2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAnillo2);
        icoAnillo2.setBounds(190, 190, 50, 50);

        icoAnillo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/anillo1.jpg"))); // NOI18N
        icoAnillo1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAnillo1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAnillo1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAnillo1);
        icoAnillo1.setBounds(140, 190, 50, 50);

        icoAccesorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/accesorio2.jpg"))); // NOI18N
        icoAccesorio2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAccesorio2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAccesorio2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAccesorio2);
        icoAccesorio2.setBounds(90, 190, 50, 50);

        icoAccesorio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/accesorio1.jpg"))); // NOI18N
        icoAccesorio1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAccesorio1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAccesorio1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAccesorio1);
        icoAccesorio1.setBounds(190, 140, 50, 50);

        icoAmuleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/amuleto.jpg"))); // NOI18N
        icoAmuleto.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAmuleto.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAmuleto.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAmuleto);
        icoAmuleto.setBounds(140, 140, 50, 50);

        icoArmaAcu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/acuaarma1.png"))); // NOI18N
        icoArmaAcu1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaAcu1);
        icoArmaAcu1.setBounds(100, 320, 50, 50);

        icoArmaAcu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/acuaarma2.png"))); // NOI18N
        icoArmaAcu2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaAcu2);
        icoArmaAcu2.setBounds(180, 320, 50, 50);

        icoCabezaAcu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/acuacabeza.png"))); // NOI18N
        icoCabezaAcu.setMaximumSize(new java.awt.Dimension(40, 40));
        icoCabezaAcu.setMinimumSize(new java.awt.Dimension(40, 40));
        icoCabezaAcu.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoCabezaAcu);
        icoCabezaAcu.setBounds(140, 260, 50, 50);

        icoEspaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/espaldar.jpg"))); // NOI18N
        icoEspaldar.setMaximumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setMinimumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoEspaldar);
        icoEspaldar.setBounds(90, 140, 50, 50);

        icoCambio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/cambio.png"))); // NOI18N
        PanelEquipo.add(icoCambio2);
        icoCambio2.setBounds(148, 320, 30, 40);

        icoCambio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/cambio.png"))); // NOI18N
        PanelEquipo.add(icoCambio1);
        icoCambio1.setBounds(147, 60, 30, 40);

        PanelEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        PanelEstadisticas.setOpaque(false);

        etiPieza.setForeground(new java.awt.Color(209, 194, 170));
        etiPieza.setText("Pieza:");

        muestraPieza.setForeground(new java.awt.Color(209, 194, 170));
        muestraPieza.setText("-");

        etiRareza.setForeground(new java.awt.Color(209, 194, 170));
        etiRareza.setText("Rareza:");

        muestraRareza.setForeground(new java.awt.Color(209, 194, 170));
        muestraRareza.setText("-");

        etiPoder1.setForeground(new java.awt.Color(209, 194, 170));
        etiPoder1.setText("Poder:");

        etiDureza1.setForeground(new java.awt.Color(209, 194, 170));
        etiDureza1.setText("Dureza:");

        etiVitalidad1.setForeground(new java.awt.Color(209, 194, 170));
        etiVitalidad1.setText("Vitalidad:");

        etiPrecision1.setForeground(new java.awt.Color(209, 194, 170));
        etiPrecision1.setText("Precisión:");

        etiFerocidad1.setForeground(new java.awt.Color(209, 194, 170));
        etiFerocidad1.setText("Ferocidad:");

        etiDanyoCondicion1.setForeground(new java.awt.Color(209, 194, 170));
        etiDanyoCondicion1.setText("Daño Cond.:");

        etiPoderCuracion1.setForeground(new java.awt.Color(209, 194, 170));
        etiPoderCuracion1.setText("Pod. Curación:");

        jLabel1.setForeground(new java.awt.Color(209, 194, 170));
        jLabel1.setText("Resist. Agonía:");

        jLabel2.setForeground(new java.awt.Color(209, 194, 170));
        jLabel2.setText("-");
        jLabel2.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(34, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel3.setForeground(new java.awt.Color(209, 194, 170));
        jLabel3.setText("-");
        jLabel3.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(34, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel4.setForeground(new java.awt.Color(209, 194, 170));
        jLabel4.setText("-");
        jLabel4.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(34, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel5.setForeground(new java.awt.Color(209, 194, 170));
        jLabel5.setText("-");
        jLabel5.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(34, 14));
        jLabel5.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel6.setForeground(new java.awt.Color(209, 194, 170));
        jLabel6.setText("-");

        jLabel7.setForeground(new java.awt.Color(209, 194, 170));
        jLabel7.setText("-");

        jLabel8.setForeground(new java.awt.Color(209, 194, 170));
        jLabel8.setText("-");

        jLabel9.setForeground(new java.awt.Color(209, 194, 170));
        jLabel9.setText("-");
        jLabel9.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout PanelEstadisticasLayout = new javax.swing.GroupLayout(PanelEstadisticas);
        PanelEstadisticas.setLayout(PanelEstadisticasLayout);
        PanelEstadisticasLayout.setHorizontalGroup(
            PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiRareza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                                .addComponent(muestraPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(muestraRareza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiPoder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiDureza1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiVitalidad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPrecision1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiPoderCuracion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiDanyoCondicion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiFerocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        PanelEstadisticasLayout.setVerticalGroup(
            PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPieza)
                    .addComponent(muestraPieza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiRareza)
                    .addComponent(muestraRareza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPoder1)
                    .addComponent(etiFerocidad1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDureza1)
                    .addComponent(etiDanyoCondicion1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiVitalidad1)
                    .addComponent(etiPoderCuracion1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPrecision1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelEquipo.add(PanelEstadisticas);
        PanelEstadisticas.setBounds(10, 403, 240, 170);

        fondoEquipo.setBackground(new java.awt.Color(209, 194, 170));
        fondoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        fondoEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 33, 33)));
        PanelEquipo.add(fondoEquipo);
        fondoEquipo.setBounds(0, 0, 260, 590);

        getContentPane().add(PanelEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 258, 580));

        PanelBusqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelBusqueda.setAlignmentX(0.0F);
        PanelBusqueda.setAlignmentY(0.0F);
        PanelBusqueda.setPreferredSize(new java.awt.Dimension(221, 36));
        PanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelBusqueda.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 197, -1));

        grupoBuscador.add(radPersonaje);
        radPersonaje.setForeground(new java.awt.Color(209, 194, 170));
        radPersonaje.setText("Personaje");
        radPersonaje.setOpaque(false);
        radPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPersonajeActionPerformed(evt);
            }
        });
        PanelBusqueda.add(radPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        grupoBuscador.add(radClan);
        radClan.setForeground(new java.awt.Color(209, 194, 170));
        radClan.setText("Clan");
        radClan.setOpaque(false);
        PanelBusqueda.add(radClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        grupoBuscador.add(radCuenta);
        radCuenta.setForeground(new java.awt.Color(209, 194, 170));
        radCuenta.setText("Cuenta");
        radCuenta.setOpaque(false);
        PanelBusqueda.add(radCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        etiNivelFracMinimo.setForeground(new java.awt.Color(209, 194, 170));
        etiNivelFracMinimo.setText("Nivel Fractales mínimo:");
        PanelBusqueda.add(etiNivelFracMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        PanelBusqueda.add(txtNivelfracMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 117, 75, -1));

        etiResistAgoniaMin.setForeground(new java.awt.Color(209, 194, 170));
        etiResistAgoniaMin.setText("Resist. Agonía mínima:");
        PanelBusqueda.add(etiResistAgoniaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));
        PanelBusqueda.add(txtAgoniaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 75, -1));

        btnBuscar.setBackground(new java.awt.Color(209, 194, 170));
        btnBuscar.setText("Buscar");
        btnBuscar.setOpaque(false);
        PanelBusqueda.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 197, -1));

        etiIdioma.setForeground(new java.awt.Color(209, 194, 170));
        etiIdioma.setText("Idioma:");
        PanelBusqueda.add(etiIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        chkEspanyol.setForeground(new java.awt.Color(209, 194, 170));
        chkEspanyol.setText("Español");
        chkEspanyol.setOpaque(false);
        PanelBusqueda.add(chkEspanyol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        chkAleman.setForeground(new java.awt.Color(209, 194, 170));
        chkAleman.setText("Alemán");
        chkAleman.setOpaque(false);
        PanelBusqueda.add(chkAleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        chkFrances.setForeground(new java.awt.Color(209, 194, 170));
        chkFrances.setText("Francés");
        chkFrances.setOpaque(false);
        PanelBusqueda.add(chkFrances, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        chkIngles.setForeground(new java.awt.Color(209, 194, 170));
        chkIngles.setText("Inglés");
        chkIngles.setOpaque(false);
        PanelBusqueda.add(chkIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        etiClases.setForeground(new java.awt.Color(209, 194, 170));
        etiClases.setText("Clases:");
        PanelBusqueda.add(etiClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        chkGuardian.setForeground(new java.awt.Color(209, 194, 170));
        chkGuardian.setText("Guardián");
        chkGuardian.setOpaque(false);
        PanelBusqueda.add(chkGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        chkElementalista.setForeground(new java.awt.Color(209, 194, 170));
        chkElementalista.setText("Elementalista");
        chkElementalista.setOpaque(false);
        PanelBusqueda.add(chkElementalista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        chkGuerrero.setForeground(new java.awt.Color(209, 194, 170));
        chkGuerrero.setText("Guerrero");
        chkGuerrero.setOpaque(false);
        PanelBusqueda.add(chkGuerrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        chkNigromante.setForeground(new java.awt.Color(209, 194, 170));
        chkNigromante.setText("Nigromante");
        chkNigromante.setOpaque(false);
        PanelBusqueda.add(chkNigromante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        chkGuardabosques.setForeground(new java.awt.Color(209, 194, 170));
        chkGuardabosques.setText("Guardabosques");
        chkGuardabosques.setOpaque(false);
        PanelBusqueda.add(chkGuardabosques, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        chkIngeniero.setForeground(new java.awt.Color(209, 194, 170));
        chkIngeniero.setText("Ingeniero");
        chkIngeniero.setOpaque(false);
        PanelBusqueda.add(chkIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        chkLadron.setForeground(new java.awt.Color(209, 194, 170));
        chkLadron.setText("Ladrón");
        chkLadron.setOpaque(false);
        chkLadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLadronActionPerformed(evt);
            }
        });
        PanelBusqueda.add(chkLadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        chkHipnotizador.setForeground(new java.awt.Color(209, 194, 170));
        chkHipnotizador.setText("Hipnotizador");
        chkHipnotizador.setOpaque(false);
        PanelBusqueda.add(chkHipnotizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        chkBuscarMiembrosMiClan.setForeground(new java.awt.Color(209, 194, 170));
        chkBuscarMiembrosMiClan.setText("Buscar solo miembros de mi clan");
        chkBuscarMiembrosMiClan.setOpaque(false);
        PanelBusqueda.add(chkBuscarMiembrosMiClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        fondoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        PanelBusqueda.add(fondoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 450));

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 450));

        etiConectadoComo.setText("Conectado como:");
        getContentPane().add(etiConectadoComo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 9, -1, 20));

        mostrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrarUsuario.setText("-");
        getContentPane().add(mostrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 9, 140, 20));

        cbPersonaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPersonaje.setToolTipText("Seleccionar personaje");
        cbPersonaje.setOpaque(false);
        getContentPane().add(cbPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 10, 140, 22));

        btnCrearPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/add.png"))); // NOI18N
        btnCrearPj.setToolTipText("Crear nuevo personaje");
        btnCrearPj.setBorder(null);
        btnCrearPj.setBorderPainted(false);
        btnCrearPj.setOpaque(false);
        btnCrearPj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPjActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearPj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 8, 27, 26));

        btnModPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/edit1.png"))); // NOI18N
        btnModPj.setToolTipText("Editar equipo del personaje");
        btnModPj.setBorder(null);
        btnModPj.setBorderPainted(false);
        btnModPj.setOpaque(false);
        btnModPj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPjActionPerformed(evt);
            }
        });
        getContentPane().add(btnModPj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 8, 27, 26));

        fondoConectadoComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        fondoConectadoComo.setText("jLabel17");
        getContentPane().add(fondoConectadoComo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 220, 20));

        etiNivelFractales.setText("Tu nivel de fractales actual:");
        getContentPane().add(etiNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 20));

        usuNivelFractalActual.setToolTipText("Tu nivel actual de fractales");
        getContentPane().add(usuNivelFractalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, -1));

        fondoNivelFractales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        fondoNivelFractales.setText("jLabel17");
        getContentPane().add(fondoNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 10, 185, 20));

        etiPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        etiPersonaje.setText("Personaje:");
        getContentPane().add(etiPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 70, 20));

        fondoPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        fondoPersonaje.setText("jLabel16");
        getContentPane().add(fondoPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 11, 100, 20));

        fondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondogeneral.jpg"))); // NOI18N
        fondoPrincipal.setMaximumSize(new java.awt.Dimension(1280, 640));
        fondoPrincipal.setMinimumSize(new java.awt.Dimension(1280, 640));
        fondoPrincipal.setPreferredSize(new java.awt.Dimension(1280, 640));
        fondoPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(fondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 640));

        menuUsuario.setText("Usuario");

        itemModificarDatos.setText("Modificar datos...");
        menuUsuario.add(itemModificarDatos);
        menuUsuario.add(separadorUsuario);

        itemCerrarUsuario.setText("Cerrar usuario");
        menuUsuario.add(itemCerrarUsuario);

        MenuBarra.add(menuUsuario);

        menuEditar.setText("Editar");

        itemRegPj.setText("Registrar Personaje...");
        menuEditar.add(itemRegPj);

        itemModPj.setText("Modificar Personaje...");
        menuEditar.add(itemModPj);
        menuEditar.add(separadorEditar1);

        itemUnirClan.setText("Unirse al Clan...");
        menuEditar.add(itemUnirClan);

        itemAbandonarClan.setText("Abandonar Clan...");
        menuEditar.add(itemAbandonarClan);
        menuEditar.add(separadorEditar2);

        itemRegClan.setText("Registrar Clan...");
        menuEditar.add(itemRegClan);

        itemModClan.setText("Modificar Clan...");
        menuEditar.add(itemModClan);

        itemEliminarClan.setText("Eliminar Clan...");
        menuEditar.add(itemEliminarClan);

        MenuBarra.add(menuEditar);

        menuConfiguracion.setText("Configuración");

        itemCambiarBD.setText("Cambiar Base de Datos...");
        menuConfiguracion.add(itemCambiarBD);

        MenuBarra.add(menuConfiguracion);

        menuAyuda.setText("Ayuda");

        itemAcerca.setText("Acerca de...");
        menuAyuda.add(itemAcerca);

        MenuBarra.add(menuAyuda);

        setJMenuBar(MenuBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radPersonajeActionPerformed

    private void btnModPjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModPjActionPerformed

    private void chkLadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLadronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLadronActionPerformed

    private void txt_dialogoRP_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoRP_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoRP_NombreActionPerformed

    private void txt_dialogoMP_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoMP_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoMP_NombreActionPerformed

    private void chk_dialogoMP_InfusionSimpleArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_dialogoMP_InfusionSimpleArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_dialogoMP_InfusionSimpleArmaduraActionPerformed

    private void btnCrearPjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearPjActionPerformed

    private void cb_dialogoUC_ClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoUC_ClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoUC_ClanActionPerformed

    private void cb_dialogoAC_ClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoAC_ClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoAC_ClanActionPerformed

    private void txt_dialogoCC_NombreClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoCC_NombreClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoCC_NombreClanActionPerformed

    private void btn_dialogoCC_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoCC_CrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoCC_CrearActionPerformed

    private void txt_dialogoMC_NombreClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoMC_NombreClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoMC_NombreClanActionPerformed

    private void btn_dialogoMC_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoMC_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoMC_ModificarActionPerformed

    private void cb_dialogoEC_ClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoEC_ClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoEC_ClanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuBar MenuBarra;
    public javax.swing.JPanel PanelAtributos;
    public javax.swing.JPanel PanelBusqueda;
    public javax.swing.JPanel PanelEquipo;
    public javax.swing.JPanel PanelEstadisticas;
    public javax.swing.JPanel PanelInformacion;
    public javax.swing.JScrollPane PanelTabla;
    private javax.swing.JPanel Panel_dialogoMU_CambiarContrasenya;
    private javax.swing.JPanel Panel_dialogoMU_Idiomas;
    public javax.swing.JTable TablaPersonajes;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCrearPj;
    public javax.swing.JButton btnModPj;
    private javax.swing.JButton btn_dialogoAC_Abandonar;
    private javax.swing.JButton btn_dialogoAC_Cancelar;
    private javax.swing.JButton btn_dialogoAD_Aceptar;
    private javax.swing.JButton btn_dialogoCC_Cancelar;
    private javax.swing.JButton btn_dialogoCC_Crear;
    private javax.swing.JButton btn_dialogoCS_Aplicar;
    private javax.swing.JButton btn_dialogoCS_Cancelar;
    private javax.swing.JButton btn_dialogoEC_Cancelar;
    private javax.swing.JButton btn_dialogoEC_Eliminar;
    private javax.swing.JButton btn_dialogoMC_Cancelar;
    private javax.swing.JButton btn_dialogoMC_Modificar;
    private javax.swing.JButton btn_dialogoMP_Cancelar;
    private javax.swing.JButton btn_dialogoMP_Modificar;
    private javax.swing.JButton btn_dialogoMU_Cancelar;
    private javax.swing.JButton btn_dialogoMU_Modificar;
    private javax.swing.JButton btn_dialogoRP_Cancelar;
    private javax.swing.JButton btn_dialogoRP_Registrar;
    private javax.swing.JButton btn_dialogoUC_Cancelar;
    private javax.swing.JButton btn_dialogoUC_Unirse;
    public javax.swing.JComboBox cbPersonaje;
    private javax.swing.JComboBox cb_dialogoAC_Clan;
    private javax.swing.JComboBox cb_dialogoEC_Clan;
    private javax.swing.JComboBox cb_dialogoMP_Clase;
    private javax.swing.JComboBox cb_dialogoMP_ModificadorArma;
    private javax.swing.JComboBox cb_dialogoMP_ModificadorArmadura;
    private javax.swing.JComboBox cb_dialogoMP_RarezaArma;
    private javax.swing.JComboBox cb_dialogoMP_RarezaArmadura;
    private javax.swing.JComboBox cb_dialogoMP_Raza;
    private javax.swing.JComboBox cb_dialogoMP_SlotArma;
    private javax.swing.JComboBox cb_dialogoMP_SlotArmadura;
    private javax.swing.JComboBox cb_dialogoMP_TipoArma;
    private javax.swing.JComboBox cb_dialogoMU_Servidor;
    private javax.swing.JComboBox cb_dialogoRP_Clase;
    private javax.swing.JComboBox cb_dialogoRP_ModificadorArma;
    private javax.swing.JComboBox cb_dialogoRP_ModificadorArmadura;
    private javax.swing.JComboBox cb_dialogoRP_RarezaArma;
    private javax.swing.JComboBox cb_dialogoRP_RarezaArmadura;
    private javax.swing.JComboBox cb_dialogoRP_Raza;
    private javax.swing.JComboBox cb_dialogoRP_SlotArma;
    private javax.swing.JComboBox cb_dialogoRP_SlotArmadura;
    private javax.swing.JComboBox cb_dialogoRP_TipoArma;
    private javax.swing.JComboBox cb_dialogoUC_Clan;
    public javax.swing.JCheckBox chkAleman;
    public javax.swing.JCheckBox chkBuscarMiembrosMiClan;
    public javax.swing.JCheckBox chkElementalista;
    public javax.swing.JCheckBox chkEspanyol;
    public javax.swing.JCheckBox chkFrances;
    public javax.swing.JCheckBox chkGuardabosques;
    public javax.swing.JCheckBox chkGuardian;
    public javax.swing.JCheckBox chkGuerrero;
    public javax.swing.JCheckBox chkHipnotizador;
    public javax.swing.JCheckBox chkIngeniero;
    public javax.swing.JCheckBox chkIngles;
    public javax.swing.JCheckBox chkLadron;
    public javax.swing.JCheckBox chkNigromante;
    private javax.swing.JCheckBox chk_dialogoMP_InfusionSimple1Arma;
    private javax.swing.JCheckBox chk_dialogoMP_InfusionSimple2Arma;
    private javax.swing.JCheckBox chk_dialogoMP_InfusionSimpleArmadura;
    private javax.swing.JCheckBox chk_dialogoMU_Aleman;
    private javax.swing.JCheckBox chk_dialogoMU_Espanyol;
    private javax.swing.JCheckBox chk_dialogoMU_Frances;
    private javax.swing.JCheckBox chk_dialogoMU_Ingles;
    private javax.swing.JCheckBox chk_dialogoRP_InfusionSimple1Arma;
    private javax.swing.JCheckBox chk_dialogoRP_InfusionSimple2Arma;
    private javax.swing.JCheckBox chk_dialogoRP_InfusionSimpleArmadura;
    private javax.swing.JDialog dialogoAbandonarClan;
    private javax.swing.JDialog dialogoAcercaDe;
    private javax.swing.JDialog dialogoCambioServidor;
    private javax.swing.JDialog dialogoCrearClan;
    private javax.swing.JDialog dialogoEliminarClan;
    private javax.swing.JDialog dialogoModificarClan;
    public javax.swing.JDialog dialogoModificarPersonaje;
    public javax.swing.JDialog dialogoModificarUsuario;
    private javax.swing.JDialog dialogoRegistrarPersonaje;
    private javax.swing.JDialog dialogoUnirseClan;
    public javax.swing.JLabel etiAgonia;
    public javax.swing.JLabel etiArmadura;
    public javax.swing.JLabel etiClase;
    public javax.swing.JLabel etiClases;
    public javax.swing.JLabel etiConectadoComo;
    public javax.swing.JLabel etiDanyoCondicion;
    public javax.swing.JLabel etiDanyoCondicion1;
    public javax.swing.JLabel etiDanyoCritico;
    public javax.swing.JLabel etiDuracionBendicion;
    public javax.swing.JLabel etiDuracionCondicion;
    public javax.swing.JLabel etiDureza;
    public javax.swing.JLabel etiDureza1;
    public javax.swing.JLabel etiFerocidad;
    public javax.swing.JLabel etiFerocidad1;
    public javax.swing.JLabel etiIdioma;
    public javax.swing.JLabel etiIdiomas;
    public javax.swing.JLabel etiNivelFracMinimo;
    private javax.swing.JLabel etiNivelFractales;
    public javax.swing.JLabel etiNombreCuenta;
    public javax.swing.JLabel etiNombrePersonaje;
    public javax.swing.JLabel etiPersonaje;
    private javax.swing.JLabel etiPieza;
    public javax.swing.JLabel etiPoder;
    public javax.swing.JLabel etiPoder1;
    public javax.swing.JLabel etiPoderCuracion;
    public javax.swing.JLabel etiPoderCuracion1;
    public javax.swing.JLabel etiPrecision;
    public javax.swing.JLabel etiPrecision1;
    public javax.swing.JLabel etiProbabilidadCritica;
    private javax.swing.JLabel etiRareza;
    public javax.swing.JLabel etiResistAgoniaMin;
    public javax.swing.JLabel etiSalud;
    public javax.swing.JLabel etiServidor;
    public javax.swing.JLabel etiVitalidad;
    public javax.swing.JLabel etiVitalidad1;
    private javax.swing.JLabel eti_dialogoAC_Clan;
    private javax.swing.JLabel eti_dialogoAD_Texto;
    private javax.swing.JLabel eti_dialogoCC_NombreClan;
    private javax.swing.JLabel eti_dialogoCC_Tag;
    private javax.swing.JLabel eti_dialogoCS_Contraseña;
    private javax.swing.JLabel eti_dialogoCS_DireccionIP;
    private javax.swing.JLabel eti_dialogoCS_NombreBD;
    private javax.swing.JLabel eti_dialogoCS_Usuario;
    private javax.swing.JLabel eti_dialogoEC_Clan;
    private javax.swing.JLabel eti_dialogoMC_NombreClan;
    private javax.swing.JLabel eti_dialogoMC_Tag;
    private javax.swing.JLabel eti_dialogoMP_AR;
    private javax.swing.JLabel eti_dialogoMP_Clase;
    private javax.swing.JLabel eti_dialogoMP_InfusionAgoniaArmadura;
    private javax.swing.JLabel eti_dialogoMP_ModificadorArma;
    private javax.swing.JLabel eti_dialogoMP_ModificadorArmadura;
    private javax.swing.JLabel eti_dialogoMP_Nombre;
    private javax.swing.JLabel eti_dialogoMP_RarezaArma;
    private javax.swing.JLabel eti_dialogoMP_RarezaArmadura;
    private javax.swing.JLabel eti_dialogoMP_Raza;
    private javax.swing.JLabel eti_dialogoMP_SlotArma;
    private javax.swing.JLabel eti_dialogoMP_SlotArmadura;
    private javax.swing.JLabel eti_dialogoMP_TipoArma;
    private javax.swing.JLabel eti_dialogoMU_ContrasenyaAntigua;
    private javax.swing.JLabel eti_dialogoMU_Email;
    private javax.swing.JLabel eti_dialogoMU_Idiomas;
    private javax.swing.JLabel eti_dialogoMU_NombreCuenta;
    private javax.swing.JLabel eti_dialogoMU_NuevaContrasenya;
    private javax.swing.JLabel eti_dialogoMU_RepetirContrasenya;
    private javax.swing.JLabel eti_dialogoMU_Servidor;
    private javax.swing.JLabel eti_dialogoRP_AR;
    private javax.swing.JLabel eti_dialogoRP_Clase;
    private javax.swing.JLabel eti_dialogoRP_InfusionAgoniaArmadura;
    private javax.swing.JLabel eti_dialogoRP_ModificadorArma;
    private javax.swing.JLabel eti_dialogoRP_ModificadorArmadura;
    private javax.swing.JLabel eti_dialogoRP_Nombre;
    private javax.swing.JLabel eti_dialogoRP_RarezaArma;
    private javax.swing.JLabel eti_dialogoRP_RarezaArmadura;
    private javax.swing.JLabel eti_dialogoRP_Raza;
    private javax.swing.JLabel eti_dialogoRP_SlotArma;
    private javax.swing.JLabel eti_dialogoRP_SlotArmadura;
    private javax.swing.JLabel eti_dialogoRP_TipoArma;
    private javax.swing.JLabel eti_dialogoUC_Clan;
    public javax.swing.JLabel fondoBusqueda;
    public javax.swing.JLabel fondoConectadoComo;
    public javax.swing.JLabel fondoEquipo;
    public javax.swing.JLabel fondoInformacion;
    public javax.swing.JLabel fondoNivelFractales;
    public javax.swing.JLabel fondoPersonaje;
    public javax.swing.JLabel fondoPrincipal;
    private javax.swing.ButtonGroup grupoBuscador;
    public javax.swing.JLabel icoAccesorio1;
    public javax.swing.JLabel icoAccesorio2;
    public javax.swing.JLabel icoAmuleto;
    public javax.swing.JLabel icoAnillo1;
    public javax.swing.JLabel icoAnillo2;
    public javax.swing.JLabel icoArmaAcu1;
    public javax.swing.JLabel icoArmaAcu2;
    public javax.swing.JLabel icoArmaPSet1;
    public javax.swing.JLabel icoArmaPSet2;
    public javax.swing.JLabel icoArmaSSet1;
    public javax.swing.JLabel icoArmaSSet2;
    public javax.swing.JLabel icoCabeza;
    public javax.swing.JLabel icoCabezaAcu;
    private javax.swing.JLabel icoCambio1;
    private javax.swing.JLabel icoCambio2;
    public javax.swing.JLabel icoEspaldar;
    public javax.swing.JLabel icoHombros;
    public javax.swing.JLabel icoManos;
    public javax.swing.JLabel icoPecho;
    public javax.swing.JLabel icoPiernas;
    public javax.swing.JLabel icoPies;
    private javax.swing.JLabel icoSet1;
    private javax.swing.JLabel icoSet2;
    public javax.swing.JMenuItem itemAbandonarClan;
    public javax.swing.JMenuItem itemAcerca;
    public javax.swing.JMenuItem itemCambiarBD;
    public javax.swing.JMenuItem itemCerrarUsuario;
    public javax.swing.JMenuItem itemEliminarClan;
    public javax.swing.JMenuItem itemModClan;
    public javax.swing.JMenuItem itemModPj;
    public javax.swing.JMenuItem itemModificarDatos;
    public javax.swing.JMenuItem itemRegClan;
    public javax.swing.JMenuItem itemRegPj;
    public javax.swing.JMenuItem itemUnirClan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JMenu menuAyuda;
    public javax.swing.JMenu menuConfiguracion;
    public javax.swing.JMenu menuEditar;
    public javax.swing.JMenu menuUsuario;
    private javax.swing.JLabel mostar_dialogoMU_NombreCuenta;
    public javax.swing.JLabel mostrarAgonia;
    public javax.swing.JLabel mostrarArmadura;
    public javax.swing.JLabel mostrarClase;
    public javax.swing.JLabel mostrarDanyoCondicion;
    public javax.swing.JLabel mostrarDanyoCritico;
    public javax.swing.JLabel mostrarDuracionBendicion;
    public javax.swing.JLabel mostrarDuracionCondicion;
    public javax.swing.JLabel mostrarDureza;
    public javax.swing.JLabel mostrarFerocidad;
    public javax.swing.JLabel mostrarIdiomas;
    public javax.swing.JLabel mostrarNombreCuenta;
    public javax.swing.JLabel mostrarNombrePersonaje;
    public javax.swing.JLabel mostrarPoder;
    public javax.swing.JLabel mostrarPoderCuracion;
    public javax.swing.JLabel mostrarPrecision;
    public javax.swing.JLabel mostrarProbabilidadCritica;
    public javax.swing.JLabel mostrarSalud;
    public javax.swing.JLabel mostrarServidor;
    public javax.swing.JLabel mostrarUsuario;
    public javax.swing.JLabel mostrarVitalidad;
    private javax.swing.JLabel muestraPieza;
    private javax.swing.JLabel muestraRareza;
    private javax.swing.JPanel panel_dialogoMP_ConfigArma;
    private javax.swing.JPanel panel_dialogoMP_ConfigArmadura;
    private javax.swing.JPanel panel_dialogoMP_Equipo;
    private javax.swing.JPanel panel_dialogoRP_ConfigArma;
    private javax.swing.JPanel panel_dialogoRP_ConfigArmadura;
    private javax.swing.JPanel panel_dialogoRP_Equipo;
    public javax.swing.JRadioButton radClan;
    public javax.swing.JRadioButton radCuenta;
    public javax.swing.JRadioButton radPersonaje;
    public javax.swing.JPopupMenu.Separator separadorEditar1;
    public javax.swing.JPopupMenu.Separator separadorEditar2;
    public javax.swing.JPopupMenu.Separator separadorUsuario;
    public javax.swing.JLabel tituloBusqueda;
    public javax.swing.JLabel tituloEquipo;
    public javax.swing.JLabel tituloPersonaje;
    public javax.swing.JTextField txtAgoniaMinima;
    public javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtNivelfracMinimo;
    private javax.swing.JTextField txt_dialogoCC_NombreClan;
    private javax.swing.JTextField txt_dialogoCC_Tag;
    private javax.swing.JPasswordField txt_dialogoCS_Contraseña;
    private javax.swing.JTextField txt_dialogoCS_DireccionIP;
    private javax.swing.JTextField txt_dialogoCS_NombreBD;
    private javax.swing.JTextField txt_dialogoCS_Usuario;
    private javax.swing.JTextField txt_dialogoMC_NombreClan;
    private javax.swing.JTextField txt_dialogoMC_Tag;
    private javax.swing.JTextField txt_dialogoMP_InfusionAgoniaArmadura;
    private javax.swing.JTextField txt_dialogoMP_Nombre;
    private javax.swing.JPasswordField txt_dialogoMU_ContrasenyaAntigua;
    private javax.swing.JTextField txt_dialogoMU_Email;
    private javax.swing.JPasswordField txt_dialogoMU_NuevaContrasenya;
    private javax.swing.JPasswordField txt_dialogoMU_RepetirContrasenya;
    private javax.swing.JTextField txt_dialogoRP_InfusionAgoniaArmadura;
    private javax.swing.JTextField txt_dialogoRP_Nombre;
    public javax.swing.JSpinner usuNivelFractalActual;
    // End of variables declaration//GEN-END:variables
}
