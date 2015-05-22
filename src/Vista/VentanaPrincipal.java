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
        fondo_dialogoMU = new javax.swing.JLabel();
        dialogoRegistrarPersonaje = new javax.swing.JDialog();
        txt_dialogoRP_Nombre = new javax.swing.JTextField();
        eti_dialogoRP_Nombre = new javax.swing.JLabel();
        eti_dialogoRP_Clase = new javax.swing.JLabel();
        cb_dialogoRP_Raza = new javax.swing.JComboBox();
        cb_dialogoRP_Clase = new javax.swing.JComboBox();
        eti_dialogoRP_Raza = new javax.swing.JLabel();
        panel_dialogoRP_Equipo = new javax.swing.JPanel();
        eti_dialogoRP_SlotArma = new javax.swing.JLabel();
        cb_dialogoRP_SlotArma = new javax.swing.JComboBox();
        eti_dialogoRP_SlotArmadura = new javax.swing.JLabel();
        cb_dialogoRP_SlotArmadura = new javax.swing.JComboBox();
        btn_dialogoRP_ModArmadura = new javax.swing.JButton();
        btn_dialogoRP_ModArma = new javax.swing.JButton();
        btn_dialogoRP_Registrar = new javax.swing.JButton();
        btn_dialogoRP_Cancelar = new javax.swing.JButton();
        fondo_dialogoRP = new javax.swing.JLabel();
        dialogoModificarPersonaje = new javax.swing.JDialog();
        txt_dialogoMP_Nombre = new javax.swing.JTextField();
        eti_dialogoMP_Nombre = new javax.swing.JLabel();
        eti_dialogoMP_Clase = new javax.swing.JLabel();
        cb_dialogoMP_Raza = new javax.swing.JComboBox();
        cb_dialogoMP_Clase = new javax.swing.JComboBox();
        eti_dialogoMP_Raza = new javax.swing.JLabel();
        panel_dialogoMP_Equipo = new javax.swing.JPanel();
        eti_dialogoMP_SlotArma = new javax.swing.JLabel();
        cb_dialogoMP_SlotArma = new javax.swing.JComboBox();
        eti_dialogoMP_SlotArmadura = new javax.swing.JLabel();
        cb_dialogoMP_SlotArmadura = new javax.swing.JComboBox();
        btn_dialogoMP_ModArmadura = new javax.swing.JButton();
        btn_dialogoMP_ModArma = new javax.swing.JButton();
        btn_dialogoMP_Modificar = new javax.swing.JButton();
        btn_dialogoMP_Cancelar = new javax.swing.JButton();
        fondo_dialogoMP = new javax.swing.JLabel();
        dialogoConfigurarArma = new javax.swing.JDialog();
        eti_dialogoCArma_TipoArma = new javax.swing.JLabel();
        cb_dialogoCArma_TipoArma = new javax.swing.JComboBox();
        eti_dialogoCArma_RarezaArma = new javax.swing.JLabel();
        cb_dialogoCArma_RarezaArma = new javax.swing.JComboBox();
        eti_dialogoCArma_ModificadorArma = new javax.swing.JLabel();
        cb_dialogoCArma_ModificadorArma = new javax.swing.JComboBox();
        chk_dialogoCArma_InfusionSimple1 = new javax.swing.JCheckBox();
        chk_dialogoCArma_InfusionSimple2 = new javax.swing.JCheckBox();
        eti_dialogoCArma_SlotArma = new javax.swing.JLabel();
        mostrar_dialogoCArma_SlotArma = new javax.swing.JLabel();
        btn_dialogoCArma_Aplicar = new javax.swing.JButton();
        btn_dialogoCArma_Cancelar = new javax.swing.JButton();
        btn_dialogoCArma_SinEquipar = new javax.swing.JButton();
        fondo_dialogoCArma = new javax.swing.JLabel();
        dialogoConfigurarArmadura = new javax.swing.JDialog();
        eti_dialogoCArmadura_RarezaArmadura = new javax.swing.JLabel();
        cb_dialogoCArmadura_RarezaArmadura = new javax.swing.JComboBox();
        eti_dialogoCArmadura_ModificadorArmadura = new javax.swing.JLabel();
        cb_dialogoCArmadura_ModificadorArmadura = new javax.swing.JComboBox();
        chk_dialogoCArmadura_InfusionSimple = new javax.swing.JCheckBox();
        eti_dialogoCArmadura_SlotArmadura = new javax.swing.JLabel();
        mostrar_dialogoCArmadura_SlotArmadura = new javax.swing.JLabel();
        btn_dialogoCArmadura_Aplicar = new javax.swing.JButton();
        btn_dialogoCArmadura_Cancelar = new javax.swing.JButton();
        txt_dialogoCArmadura_ResistAgonia = new javax.swing.JTextField();
        txt_dialogoCArmadura_InfusionAgonia = new javax.swing.JLabel();
        eti_dialogoCArmadura_InfusionAgonia = new javax.swing.JLabel();
        btn_dialogoCArmadura_SinEquipar = new javax.swing.JButton();
        fondo_dialogoCArmadura = new javax.swing.JLabel();
        dialogoUnirseClan = new javax.swing.JDialog();
        eti_dialogoUC_Clan = new javax.swing.JLabel();
        cb_dialogoUC_Clan = new javax.swing.JComboBox();
        btn_dialogoUC_Unirse = new javax.swing.JButton();
        btn_dialogoUC_Cancelar = new javax.swing.JButton();
        fondo_dialogoUC = new javax.swing.JLabel();
        dialogoAbandonarClan = new javax.swing.JDialog();
        eti_dialogoAC_Clan = new javax.swing.JLabel();
        cb_dialogoAC_Clan = new javax.swing.JComboBox();
        btn_dialogoAC_Abandonar = new javax.swing.JButton();
        btn_dialogoAC_Cancelar = new javax.swing.JButton();
        fondo_dialogoAC = new javax.swing.JLabel();
        dialogoCrearClan = new javax.swing.JDialog();
        eti_dialogoCC_NombreClan = new javax.swing.JLabel();
        txt_dialogoCC_NombreClan = new javax.swing.JTextField();
        eti_dialogoCC_Tag = new javax.swing.JLabel();
        txt_dialogoCC_Tag = new javax.swing.JTextField();
        btn_dialogoCC_Crear = new javax.swing.JButton();
        btn_dialogoCC_Cancelar = new javax.swing.JButton();
        btn_dialogoCC = new javax.swing.JLabel();
        dialogoEliminarClan = new javax.swing.JDialog();
        eti_dialogoEC_Clan = new javax.swing.JLabel();
        cb_dialogoEC_Clan = new javax.swing.JComboBox();
        btn_dialogoEC_Eliminar = new javax.swing.JButton();
        btn_dialogoEC_Cancelar = new javax.swing.JButton();
        fondo_dialogoEC = new javax.swing.JLabel();
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
        txt_dialogoCS_Puerto = new javax.swing.JTextField();
        eti_dialogoCS_Puerto = new javax.swing.JLabel();
        fondo_dialogoCS = new javax.swing.JLabel();
        dialogoAcercaDe = new javax.swing.JDialog();
        btn_dialogoAD_Aceptar = new javax.swing.JButton();
        eti_dialogoAD_Texto = new javax.swing.JLabel();
        fondo_dialogoAD = new javax.swing.JLabel();
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
        icoAmuleto = new javax.swing.JLabel();
        icoAccesorio2 = new javax.swing.JLabel();
        icoAccesorio1 = new javax.swing.JLabel();
        icoArmaAcu1 = new javax.swing.JLabel();
        icoArmaAcu2 = new javax.swing.JLabel();
        icoCabezaAcu = new javax.swing.JLabel();
        icoEspaldar = new javax.swing.JLabel();
        icoCambio2 = new javax.swing.JLabel();
        icoCambio1 = new javax.swing.JLabel();
        PanelEstadisticas = new javax.swing.JPanel();
        etiStatBase = new javax.swing.JLabel();
        muestraStatBase = new javax.swing.JLabel();
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
        muestraPoder = new javax.swing.JLabel();
        muestraFerocidad = new javax.swing.JLabel();
        muestraDureza = new javax.swing.JLabel();
        muestraVitalidad = new javax.swing.JLabel();
        muestraPrecision = new javax.swing.JLabel();
        muestraDanyoCondicion = new javax.swing.JLabel();
        muestraPoderCuracion = new javax.swing.JLabel();
        muestraRAgonia = new javax.swing.JLabel();
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
        itemEliminarClan = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        itemCambiarBD = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcerca = new javax.swing.JMenuItem();

        dialogoModificarUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarUsuario.setTitle("Modificar Usuario");
        dialogoModificarUsuario.setModal(true);
        dialogoModificarUsuario.setResizable(false);
        dialogoModificarUsuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_dialogoMU_Servidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoMU_Servidor.setOpaque(false);
        dialogoModificarUsuario.getContentPane().add(cb_dialogoMU_Servidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 98, 181, -1));

        eti_dialogoMU_NombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_NombreCuenta.setText("Nombre cuenta (GW2):");
        dialogoModificarUsuario.getContentPane().add(eti_dialogoMU_NombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 28, -1, -1));

        Panel_dialogoMU_Idiomas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true));
        Panel_dialogoMU_Idiomas.setOpaque(false);

        chk_dialogoMU_Ingles.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoMU_Ingles.setText("Inglés");
        chk_dialogoMU_Ingles.setOpaque(false);

        chk_dialogoMU_Espanyol.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoMU_Espanyol.setText("Español");
        chk_dialogoMU_Espanyol.setOpaque(false);

        chk_dialogoMU_Aleman.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoMU_Aleman.setText("Aleman");
        chk_dialogoMU_Aleman.setOpaque(false);

        chk_dialogoMU_Frances.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoMU_Frances.setText("Francés");
        chk_dialogoMU_Frances.setOpaque(false);

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

        dialogoModificarUsuario.getContentPane().add(Panel_dialogoMU_Idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 136, -1, -1));

        eti_dialogoMU_Email.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_Email.setText("Email:");
        dialogoModificarUsuario.getContentPane().add(eti_dialogoMU_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 63, 111, -1));

        eti_dialogoMU_Servidor.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_Servidor.setText("Servidor:");
        dialogoModificarUsuario.getContentPane().add(eti_dialogoMU_Servidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 101, 104, -1));

        eti_dialogoMU_Idiomas.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_Idiomas.setText("Idiomas:");
        dialogoModificarUsuario.getContentPane().add(eti_dialogoMU_Idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 136, 107, -1));
        dialogoModificarUsuario.getContentPane().add(txt_dialogoMU_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 60, 181, -1));

        mostar_dialogoMU_NombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        mostar_dialogoMU_NombreCuenta.setText("-");
        dialogoModificarUsuario.getContentPane().add(mostar_dialogoMU_NombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 28, 181, -1));

        Panel_dialogoMU_CambiarContrasenya.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Cambiar Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        Panel_dialogoMU_CambiarContrasenya.setOpaque(false);

        eti_dialogoMU_NuevaContrasenya.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_NuevaContrasenya.setText("Nueva contraseña:");

        eti_dialogoMU_RepetirContrasenya.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMU_RepetirContrasenya.setText("Repetir contraseña:");

        txt_dialogoMU_RepetirContrasenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoMU_RepetirContrasenyaActionPerformed(evt);
            }
        });

        eti_dialogoMU_ContrasenyaAntigua.setForeground(new java.awt.Color(209, 194, 170));
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

        dialogoModificarUsuario.getContentPane().add(Panel_dialogoMU_CambiarContrasenya, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, 350, -1));

        btn_dialogoMU_Modificar.setText("Modificar");
        btn_dialogoMU_Modificar.setOpaque(false);
        dialogoModificarUsuario.getContentPane().add(btn_dialogoMU_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 371, -1, -1));

        btn_dialogoMU_Cancelar.setText("Cancelar");
        btn_dialogoMU_Cancelar.setOpaque(false);
        btn_dialogoMU_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoMU_CancelarActionPerformed(evt);
            }
        });
        dialogoModificarUsuario.getContentPane().add(btn_dialogoMU_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 371, -1, -1));

        fondo_dialogoMU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoModificarUsuario.getContentPane().add(fondo_dialogoMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 420));

        dialogoRegistrarPersonaje.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoRegistrarPersonaje.setTitle("Registrar Personaje");
        dialogoRegistrarPersonaje.setMinimumSize(new java.awt.Dimension(375, 345));
        dialogoRegistrarPersonaje.setModal(true);
        dialogoRegistrarPersonaje.setResizable(false);
        dialogoRegistrarPersonaje.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_dialogoRP_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoRP_NombreActionPerformed(evt);
            }
        });
        dialogoRegistrarPersonaje.getContentPane().add(txt_dialogoRP_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 170, -1));

        eti_dialogoRP_Nombre.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoRP_Nombre.setText("Nombre:");
        dialogoRegistrarPersonaje.getContentPane().add(eti_dialogoRP_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        eti_dialogoRP_Clase.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoRP_Clase.setText("Clase:");
        dialogoRegistrarPersonaje.getContentPane().add(eti_dialogoRP_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cb_dialogoRP_Raza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoRP_Raza.setOpaque(false);
        dialogoRegistrarPersonaje.getContentPane().add(cb_dialogoRP_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));

        cb_dialogoRP_Clase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoRP_Clase.setOpaque(false);
        dialogoRegistrarPersonaje.getContentPane().add(cb_dialogoRP_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, -1));

        eti_dialogoRP_Raza.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoRP_Raza.setText("Raza:");
        dialogoRegistrarPersonaje.getContentPane().add(eti_dialogoRP_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        panel_dialogoRP_Equipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Equipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        panel_dialogoRP_Equipo.setForeground(new java.awt.Color(209, 194, 170));
        panel_dialogoRP_Equipo.setOpaque(false);

        eti_dialogoRP_SlotArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoRP_SlotArma.setText("Slot del Arma:");

        cb_dialogoRP_SlotArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoRP_SlotArma.setOpaque(false);
        cb_dialogoRP_SlotArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoRP_SlotArmaActionPerformed(evt);
            }
        });

        eti_dialogoRP_SlotArmadura.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoRP_SlotArmadura.setText("Slot de la Armadura:");

        cb_dialogoRP_SlotArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoRP_SlotArmadura.setOpaque(false);
        cb_dialogoRP_SlotArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoRP_SlotArmaduraActionPerformed(evt);
            }
        });

        btn_dialogoRP_ModArmadura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/edit1.png"))); // NOI18N
        btn_dialogoRP_ModArmadura.setToolTipText("Editar equipo del personaje");
        btn_dialogoRP_ModArmadura.setBorder(null);
        btn_dialogoRP_ModArmadura.setBorderPainted(false);
        btn_dialogoRP_ModArmadura.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArmadura.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArmadura.setOpaque(false);
        btn_dialogoRP_ModArmadura.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoRP_ModArmaduraActionPerformed(evt);
            }
        });

        btn_dialogoRP_ModArma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/edit1.png"))); // NOI18N
        btn_dialogoRP_ModArma.setToolTipText("Editar equipo del personaje");
        btn_dialogoRP_ModArma.setBorder(null);
        btn_dialogoRP_ModArma.setBorderPainted(false);
        btn_dialogoRP_ModArma.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArma.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArma.setOpaque(false);
        btn_dialogoRP_ModArma.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_dialogoRP_ModArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoRP_ModArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dialogoRP_EquipoLayout = new javax.swing.GroupLayout(panel_dialogoRP_Equipo);
        panel_dialogoRP_Equipo.setLayout(panel_dialogoRP_EquipoLayout);
        panel_dialogoRP_EquipoLayout.setHorizontalGroup(
            panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoRP_SlotArmadura)
                    .addComponent(eti_dialogoRP_SlotArma))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                        .addComponent(cb_dialogoRP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dialogoRP_ModArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                        .addComponent(cb_dialogoRP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dialogoRP_ModArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dialogoRP_EquipoLayout.setVerticalGroup(
            panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoRP_EquipoLayout.createSequentialGroup()
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_dialogoRP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_dialogoRP_SlotArma))
                    .addComponent(btn_dialogoRP_ModArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_dialogoRP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_dialogoRP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_dialogoRP_SlotArmadura))
                    .addComponent(btn_dialogoRP_ModArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        dialogoRegistrarPersonaje.getContentPane().add(panel_dialogoRP_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 110));

        btn_dialogoRP_Registrar.setText("Registrar");
        btn_dialogoRP_Registrar.setOpaque(false);
        dialogoRegistrarPersonaje.getContentPane().add(btn_dialogoRP_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btn_dialogoRP_Cancelar.setText("Cancelar");
        btn_dialogoRP_Cancelar.setOpaque(false);
        dialogoRegistrarPersonaje.getContentPane().add(btn_dialogoRP_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        fondo_dialogoRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoRegistrarPersonaje.getContentPane().add(fondo_dialogoRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        dialogoModificarPersonaje.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarPersonaje.setTitle("Modificar Personaje");
        dialogoModificarPersonaje.setMinimumSize(new java.awt.Dimension(375, 345));
        dialogoModificarPersonaje.setModal(true);
        dialogoModificarPersonaje.setResizable(false);
        dialogoModificarPersonaje.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_dialogoMP_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoMP_NombreActionPerformed(evt);
            }
        });
        dialogoModificarPersonaje.getContentPane().add(txt_dialogoMP_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 170, -1));

        eti_dialogoMP_Nombre.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMP_Nombre.setText("Nombre:");
        dialogoModificarPersonaje.getContentPane().add(eti_dialogoMP_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        eti_dialogoMP_Clase.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMP_Clase.setText("Clase:");
        dialogoModificarPersonaje.getContentPane().add(eti_dialogoMP_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cb_dialogoMP_Raza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoMP_Raza.setOpaque(false);
        dialogoModificarPersonaje.getContentPane().add(cb_dialogoMP_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));

        cb_dialogoMP_Clase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoMP_Clase.setOpaque(false);
        dialogoModificarPersonaje.getContentPane().add(cb_dialogoMP_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, -1));

        eti_dialogoMP_Raza.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMP_Raza.setText("Raza:");
        dialogoModificarPersonaje.getContentPane().add(eti_dialogoMP_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        panel_dialogoMP_Equipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Equipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        panel_dialogoMP_Equipo.setForeground(new java.awt.Color(209, 194, 170));
        panel_dialogoMP_Equipo.setOpaque(false);

        eti_dialogoMP_SlotArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMP_SlotArma.setText("Slot del Arma:");

        cb_dialogoMP_SlotArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoMP_SlotArma.setOpaque(false);
        cb_dialogoMP_SlotArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoMP_SlotArmaActionPerformed(evt);
            }
        });

        eti_dialogoMP_SlotArmadura.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoMP_SlotArmadura.setText("Slot de la Armadura:");

        cb_dialogoMP_SlotArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoMP_SlotArmadura.setOpaque(false);
        cb_dialogoMP_SlotArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoMP_SlotArmaduraActionPerformed(evt);
            }
        });

        btn_dialogoMP_ModArmadura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/edit1.png"))); // NOI18N
        btn_dialogoMP_ModArmadura.setToolTipText("Editar equipo del personaje");
        btn_dialogoMP_ModArmadura.setBorder(null);
        btn_dialogoMP_ModArmadura.setBorderPainted(false);
        btn_dialogoMP_ModArmadura.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArmadura.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArmadura.setOpaque(false);
        btn_dialogoMP_ModArmadura.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoMP_ModArmaduraActionPerformed(evt);
            }
        });

        btn_dialogoMP_ModArma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/edit1.png"))); // NOI18N
        btn_dialogoMP_ModArma.setToolTipText("Editar equipo del personaje");
        btn_dialogoMP_ModArma.setBorder(null);
        btn_dialogoMP_ModArma.setBorderPainted(false);
        btn_dialogoMP_ModArma.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArma.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArma.setOpaque(false);
        btn_dialogoMP_ModArma.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_dialogoMP_ModArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoMP_ModArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dialogoMP_EquipoLayout = new javax.swing.GroupLayout(panel_dialogoMP_Equipo);
        panel_dialogoMP_Equipo.setLayout(panel_dialogoMP_EquipoLayout);
        panel_dialogoMP_EquipoLayout.setHorizontalGroup(
            panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_dialogoMP_SlotArmadura)
                    .addComponent(eti_dialogoMP_SlotArma))
                .addGap(18, 18, 18)
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                        .addComponent(cb_dialogoMP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dialogoMP_ModArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                        .addComponent(cb_dialogoMP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dialogoMP_ModArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dialogoMP_EquipoLayout.setVerticalGroup(
            panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogoMP_EquipoLayout.createSequentialGroup()
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_dialogoMP_SlotArma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_dialogoMP_SlotArma))
                    .addComponent(btn_dialogoMP_ModArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_dialogoMP_EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_dialogoMP_SlotArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_dialogoMP_SlotArmadura))
                    .addComponent(btn_dialogoMP_ModArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btn_dialogoMP_ModArmadura.getAccessibleContext().setAccessibleDescription("Modificar el slot de armadura seleccionado.");
        btn_dialogoMP_ModArma.getAccessibleContext().setAccessibleDescription("Modificar el slot del arma seleccionado.");

        dialogoModificarPersonaje.getContentPane().add(panel_dialogoMP_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 110));

        btn_dialogoMP_Modificar.setText("Modificar");
        btn_dialogoMP_Modificar.setOpaque(false);
        dialogoModificarPersonaje.getContentPane().add(btn_dialogoMP_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btn_dialogoMP_Cancelar.setText("Cancelar");
        btn_dialogoMP_Cancelar.setOpaque(false);
        dialogoModificarPersonaje.getContentPane().add(btn_dialogoMP_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        fondo_dialogoMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoModificarPersonaje.getContentPane().add(fondo_dialogoMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        dialogoConfigurarArma.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoConfigurarArma.setTitle("Configurar Arma");
        dialogoConfigurarArma.setMinimumSize(new java.awt.Dimension(235, 314));
        dialogoConfigurarArma.setModal(true);
        dialogoConfigurarArma.setResizable(false);
        dialogoConfigurarArma.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoCArma_TipoArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArma_TipoArma.setText("Tipo de Arma:");
        dialogoConfigurarArma.getContentPane().add(eti_dialogoCArma_TipoArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        cb_dialogoCArma_TipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoCArma_TipoArma.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(cb_dialogoCArma_TipoArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 43, 120, -1));

        eti_dialogoCArma_RarezaArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArma_RarezaArma.setText("Rareza:");
        dialogoConfigurarArma.getContentPane().add(eti_dialogoCArma_RarezaArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        cb_dialogoCArma_RarezaArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoCArma_RarezaArma.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(cb_dialogoCArma_RarezaArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 81, 120, -1));

        eti_dialogoCArma_ModificadorArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArma_ModificadorArma.setText("Modificador:");
        dialogoConfigurarArma.getContentPane().add(eti_dialogoCArma_ModificadorArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        cb_dialogoCArma_ModificadorArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoCArma_ModificadorArma.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(cb_dialogoCArma_ModificadorArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 119, 120, -1));

        chk_dialogoCArma_InfusionSimple1.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoCArma_InfusionSimple1.setText("Infusión Simple 1 (+ 5 RA)");
        chk_dialogoCArma_InfusionSimple1.setOpaque(false);
        chk_dialogoCArma_InfusionSimple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_dialogoCArma_InfusionSimple1ActionPerformed(evt);
            }
        });
        dialogoConfigurarArma.getContentPane().add(chk_dialogoCArma_InfusionSimple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, -1));

        chk_dialogoCArma_InfusionSimple2.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoCArma_InfusionSimple2.setText("Infusión Simple 2 (+ 5 RA)");
        chk_dialogoCArma_InfusionSimple2.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(chk_dialogoCArma_InfusionSimple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        eti_dialogoCArma_SlotArma.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArma_SlotArma.setText("Slot del Arma:");
        dialogoConfigurarArma.getContentPane().add(eti_dialogoCArma_SlotArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        mostrar_dialogoCArma_SlotArma.setForeground(new java.awt.Color(209, 194, 170));
        mostrar_dialogoCArma_SlotArma.setText("-");
        dialogoConfigurarArma.getContentPane().add(mostrar_dialogoCArma_SlotArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 120, -1));

        btn_dialogoCArma_Aplicar.setText("Aplicar");
        btn_dialogoCArma_Aplicar.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(btn_dialogoCArma_Aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, -1, -1));

        btn_dialogoCArma_Cancelar.setText("Cancelar");
        btn_dialogoCArma_Cancelar.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(btn_dialogoCArma_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 254, -1, -1));

        btn_dialogoCArma_SinEquipar.setText("Sin Equipar");
        btn_dialogoCArma_SinEquipar.setOpaque(false);
        dialogoConfigurarArma.getContentPane().add(btn_dialogoCArma_SinEquipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        fondo_dialogoCArma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoConfigurarArma.getContentPane().add(fondo_dialogoCArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 290));

        dialogoConfigurarArmadura.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoConfigurarArmadura.setTitle("Configurar Armadura");
        dialogoConfigurarArmadura.setMinimumSize(new java.awt.Dimension(255, 280));
        dialogoConfigurarArmadura.setModal(true);
        dialogoConfigurarArmadura.setResizable(false);
        dialogoConfigurarArmadura.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoCArmadura_RarezaArmadura.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArmadura_RarezaArmadura.setText("Rareza:");
        dialogoConfigurarArmadura.getContentPane().add(eti_dialogoCArmadura_RarezaArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        cb_dialogoCArmadura_RarezaArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoCArmadura_RarezaArmadura.setOpaque(false);
        dialogoConfigurarArmadura.getContentPane().add(cb_dialogoCArmadura_RarezaArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 43, 120, -1));

        eti_dialogoCArmadura_ModificadorArmadura.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArmadura_ModificadorArmadura.setText("Modificador:");
        dialogoConfigurarArmadura.getContentPane().add(eti_dialogoCArmadura_ModificadorArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        cb_dialogoCArmadura_ModificadorArmadura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoCArmadura_ModificadorArmadura.setOpaque(false);
        dialogoConfigurarArmadura.getContentPane().add(cb_dialogoCArmadura_ModificadorArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 81, 120, -1));

        chk_dialogoCArmadura_InfusionSimple.setForeground(new java.awt.Color(209, 194, 170));
        chk_dialogoCArmadura_InfusionSimple.setText("Infusión Simple (+ 5 RA)");
        chk_dialogoCArmadura_InfusionSimple.setOpaque(false);
        chk_dialogoCArmadura_InfusionSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_dialogoCArmadura_InfusionSimpleActionPerformed(evt);
            }
        });
        dialogoConfigurarArmadura.getContentPane().add(chk_dialogoCArmadura_InfusionSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        eti_dialogoCArmadura_SlotArmadura.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArmadura_SlotArmadura.setText("Slot del Armadura:");
        dialogoConfigurarArmadura.getContentPane().add(eti_dialogoCArmadura_SlotArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        mostrar_dialogoCArmadura_SlotArmadura.setForeground(new java.awt.Color(209, 194, 170));
        mostrar_dialogoCArmadura_SlotArmadura.setText("-");
        dialogoConfigurarArmadura.getContentPane().add(mostrar_dialogoCArmadura_SlotArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, 120, -1));

        btn_dialogoCArmadura_Aplicar.setText("Aplicar");
        btn_dialogoCArmadura_Aplicar.setOpaque(false);
        btn_dialogoCArmadura_Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoCArmadura_AplicarActionPerformed(evt);
            }
        });
        dialogoConfigurarArmadura.getContentPane().add(btn_dialogoCArmadura_Aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        btn_dialogoCArmadura_Cancelar.setText("Cancelar");
        btn_dialogoCArmadura_Cancelar.setOpaque(false);
        dialogoConfigurarArmadura.getContentPane().add(btn_dialogoCArmadura_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 219, -1, -1));
        dialogoConfigurarArmadura.getContentPane().add(txt_dialogoCArmadura_ResistAgonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 149, 32, -1));

        txt_dialogoCArmadura_InfusionAgonia.setForeground(new java.awt.Color(209, 194, 170));
        txt_dialogoCArmadura_InfusionAgonia.setText("RA)");
        dialogoConfigurarArmadura.getContentPane().add(txt_dialogoCArmadura_InfusionAgonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 152, -1, -1));

        eti_dialogoCArmadura_InfusionAgonia.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCArmadura_InfusionAgonia.setText("Infusión Agonía (+");
        dialogoConfigurarArmadura.getContentPane().add(eti_dialogoCArmadura_InfusionAgonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 149, -1, 20));

        btn_dialogoCArmadura_SinEquipar.setText("Sin Equipar");
        btn_dialogoCArmadura_SinEquipar.setOpaque(false);
        dialogoConfigurarArmadura.getContentPane().add(btn_dialogoCArmadura_SinEquipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 186, -1, -1));

        fondo_dialogoCArmadura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoConfigurarArmadura.getContentPane().add(fondo_dialogoCArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 260));

        dialogoUnirseClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoUnirseClan.setTitle("Unirse al Clan");
        dialogoUnirseClan.setModal(true);
        dialogoUnirseClan.setResizable(false);
        dialogoUnirseClan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoUC_Clan.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoUC_Clan.setText("Clan:");
        dialogoUnirseClan.getContentPane().add(eti_dialogoUC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 33, -1, -1));

        cb_dialogoUC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoUC_Clan.setOpaque(false);
        cb_dialogoUC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoUC_ClanActionPerformed(evt);
            }
        });
        dialogoUnirseClan.getContentPane().add(cb_dialogoUC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 30, 160, -1));

        btn_dialogoUC_Unirse.setText("Unirse");
        btn_dialogoUC_Unirse.setOpaque(false);
        dialogoUnirseClan.getContentPane().add(btn_dialogoUC_Unirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 82, -1, -1));

        btn_dialogoUC_Cancelar.setText("Cancelar");
        btn_dialogoUC_Cancelar.setOpaque(false);
        dialogoUnirseClan.getContentPane().add(btn_dialogoUC_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 82, -1, -1));

        fondo_dialogoUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoUnirseClan.getContentPane().add(fondo_dialogoUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 130));

        dialogoAbandonarClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoAbandonarClan.setTitle("Abandonar Clan");
        dialogoAbandonarClan.setModal(true);
        dialogoAbandonarClan.setResizable(false);
        dialogoAbandonarClan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoAC_Clan.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoAC_Clan.setText("Clan:");
        dialogoAbandonarClan.getContentPane().add(eti_dialogoAC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 33, -1, -1));

        cb_dialogoAC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoAC_Clan.setOpaque(false);
        cb_dialogoAC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoAC_ClanActionPerformed(evt);
            }
        });
        dialogoAbandonarClan.getContentPane().add(cb_dialogoAC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 30, 160, -1));

        btn_dialogoAC_Abandonar.setText("Abandonar");
        btn_dialogoAC_Abandonar.setOpaque(false);
        dialogoAbandonarClan.getContentPane().add(btn_dialogoAC_Abandonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 82, -1, -1));

        btn_dialogoAC_Cancelar.setText("Cancelar");
        btn_dialogoAC_Cancelar.setOpaque(false);
        dialogoAbandonarClan.getContentPane().add(btn_dialogoAC_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 82, -1, -1));

        fondo_dialogoAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoAbandonarClan.getContentPane().add(fondo_dialogoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 130));

        dialogoCrearClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoCrearClan.setTitle("Crear Clan");
        dialogoCrearClan.setModal(true);
        dialogoCrearClan.setResizable(false);
        dialogoCrearClan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoCC_NombreClan.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCC_NombreClan.setText("Nombre del Clan:");
        dialogoCrearClan.getContentPane().add(eti_dialogoCC_NombreClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 29, -1, -1));

        txt_dialogoCC_NombreClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoCC_NombreClanActionPerformed(evt);
            }
        });
        dialogoCrearClan.getContentPane().add(txt_dialogoCC_NombreClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 26, 160, -1));

        eti_dialogoCC_Tag.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCC_Tag.setText("Tag:");
        dialogoCrearClan.getContentPane().add(eti_dialogoCC_Tag, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 67, -1, -1));
        dialogoCrearClan.getContentPane().add(txt_dialogoCC_Tag, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 64, 48, -1));

        btn_dialogoCC_Crear.setText("Crear");
        btn_dialogoCC_Crear.setOpaque(false);
        btn_dialogoCC_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogoCC_CrearActionPerformed(evt);
            }
        });
        dialogoCrearClan.getContentPane().add(btn_dialogoCC_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, -1, -1));

        btn_dialogoCC_Cancelar.setText("Cancelar");
        btn_dialogoCC_Cancelar.setOpaque(false);
        dialogoCrearClan.getContentPane().add(btn_dialogoCC_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 115, -1, -1));

        btn_dialogoCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoCrearClan.getContentPane().add(btn_dialogoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 160));

        dialogoEliminarClan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoEliminarClan.setTitle("Eliminar Clan");
        dialogoEliminarClan.setModal(true);
        dialogoEliminarClan.setResizable(false);
        dialogoEliminarClan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoEC_Clan.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoEC_Clan.setText("Clan:");
        dialogoEliminarClan.getContentPane().add(eti_dialogoEC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 33, -1, -1));

        cb_dialogoEC_Clan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_dialogoEC_Clan.setOpaque(false);
        cb_dialogoEC_Clan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dialogoEC_ClanActionPerformed(evt);
            }
        });
        dialogoEliminarClan.getContentPane().add(cb_dialogoEC_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 30, 160, -1));

        btn_dialogoEC_Eliminar.setText("Eliminar");
        btn_dialogoEC_Eliminar.setOpaque(false);
        dialogoEliminarClan.getContentPane().add(btn_dialogoEC_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 82, -1, -1));

        btn_dialogoEC_Cancelar.setText("Cancelar");
        btn_dialogoEC_Cancelar.setOpaque(false);
        dialogoEliminarClan.getContentPane().add(btn_dialogoEC_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 82, -1, -1));

        fondo_dialogoEC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoEliminarClan.getContentPane().add(fondo_dialogoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 130));

        dialogoCambioServidor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoCambioServidor.setTitle("Cambiar Servidor");
        dialogoCambioServidor.setModal(true);
        dialogoCambioServidor.setResizable(false);
        dialogoCambioServidor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_dialogoCS_DireccionIP.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCS_DireccionIP.setText("Dirección IP:");
        dialogoCambioServidor.getContentPane().add(eti_dialogoCS_DireccionIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        dialogoCambioServidor.getContentPane().add(txt_dialogoCS_DireccionIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 11, 140, -1));

        eti_dialogoCS_NombreBD.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCS_NombreBD.setText("Nombre de la Base de Datos:");
        dialogoCambioServidor.getContentPane().add(eti_dialogoCS_NombreBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        dialogoCambioServidor.getContentPane().add(txt_dialogoCS_NombreBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 87, 140, -1));

        eti_dialogoCS_Usuario.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCS_Usuario.setText("Usuario de la BD:");
        dialogoCambioServidor.getContentPane().add(eti_dialogoCS_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        txt_dialogoCS_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dialogoCS_UsuarioActionPerformed(evt);
            }
        });
        dialogoCambioServidor.getContentPane().add(txt_dialogoCS_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 125, 140, -1));
        dialogoCambioServidor.getContentPane().add(txt_dialogoCS_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 163, 140, -1));

        eti_dialogoCS_Contraseña.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCS_Contraseña.setText("Contraseña:");
        dialogoCambioServidor.getContentPane().add(eti_dialogoCS_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, -1, -1));

        btn_dialogoCS_Aplicar.setText("Aplicar");
        btn_dialogoCS_Aplicar.setOpaque(false);
        dialogoCambioServidor.getContentPane().add(btn_dialogoCS_Aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 201, -1, -1));

        btn_dialogoCS_Cancelar.setText("Cancelar");
        btn_dialogoCS_Cancelar.setOpaque(false);
        dialogoCambioServidor.getContentPane().add(btn_dialogoCS_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 201, -1, -1));
        dialogoCambioServidor.getContentPane().add(txt_dialogoCS_Puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 49, 68, -1));

        eti_dialogoCS_Puerto.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoCS_Puerto.setText("Puerto:");
        dialogoCambioServidor.getContentPane().add(eti_dialogoCS_Puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        fondo_dialogoCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoCambioServidor.getContentPane().add(fondo_dialogoCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 240));

        dialogoAcercaDe.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoAcercaDe.setTitle("Acerca de...");
        dialogoAcercaDe.setModal(true);
        dialogoAcercaDe.setResizable(false);
        dialogoAcercaDe.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dialogoAD_Aceptar.setText("Aceptar");
        btn_dialogoAD_Aceptar.setOpaque(false);
        dialogoAcercaDe.getContentPane().add(btn_dialogoAD_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 237, -1, -1));

        eti_dialogoAD_Texto.setForeground(new java.awt.Color(209, 194, 170));
        eti_dialogoAD_Texto.setText("Texto sobre la Aplicación.");
        dialogoAcercaDe.getContentPane().add(eti_dialogoAD_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, -1, -1));

        fondo_dialogoAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
        dialogoAcercaDe.getContentPane().add(fondo_dialogoAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guild Wars 2 Character Browser");
        setMinimumSize(new java.awt.Dimension(982, 661));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/busqueda.png"))); // NOI18N
        getContentPane().add(tituloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 220, 40));

        tituloPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/personaje.png"))); // NOI18N
        getContentPane().add(tituloPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 378, 220, 40));

        tituloEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/equipo.png"))); // NOI18N
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

        fondoInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo1.jpg"))); // NOI18N
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

        icoManos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/guantes.jpg"))); // NOI18N
        PanelEquipo.add(icoManos);
        icoManos.setBounds(10, 200, 60, 54);

        icoPiernas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/pantalon.jpg"))); // NOI18N
        PanelEquipo.add(icoPiernas);
        icoPiernas.setBounds(10, 260, 60, 54);

        icoPies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/botas.jpg"))); // NOI18N
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

        icoAnillo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/anillo2.jpg"))); // NOI18N
        icoAnillo2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAnillo2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAnillo2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAnillo2);
        icoAnillo2.setBounds(190, 190, 50, 50);

        icoAnillo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/anillo1.jpg"))); // NOI18N
        icoAnillo1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAnillo1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAnillo1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAnillo1);
        icoAnillo1.setBounds(140, 190, 50, 50);

        icoAmuleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/amuleto.jpg"))); // NOI18N
        icoAmuleto.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAmuleto.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAmuleto.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAmuleto);
        icoAmuleto.setBounds(90, 190, 50, 50);

        icoAccesorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/accesorio2.jpg"))); // NOI18N
        icoAccesorio2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAccesorio2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAccesorio2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAccesorio2);
        icoAccesorio2.setBounds(190, 140, 50, 50);

        icoAccesorio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/accesorio1.jpg"))); // NOI18N
        icoAccesorio1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoAccesorio1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoAccesorio1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoAccesorio1);
        icoAccesorio1.setBounds(140, 140, 50, 50);

        icoArmaAcu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/acuaarma1.png"))); // NOI18N
        icoArmaAcu1.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu1.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaAcu1);
        icoArmaAcu1.setBounds(100, 320, 40, 50);

        icoArmaAcu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/acuaarma2.png"))); // NOI18N
        icoArmaAcu2.setMaximumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu2.setMinimumSize(new java.awt.Dimension(40, 40));
        icoArmaAcu2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoArmaAcu2);
        icoArmaAcu2.setBounds(185, 320, 40, 50);

        icoCabezaAcu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/acuacabeza.png"))); // NOI18N
        icoCabezaAcu.setMaximumSize(new java.awt.Dimension(40, 40));
        icoCabezaAcu.setMinimumSize(new java.awt.Dimension(40, 40));
        icoCabezaAcu.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoCabezaAcu);
        icoCabezaAcu.setBounds(140, 260, 50, 50);

        icoEspaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ArmadurasV/espaldar.jpg"))); // NOI18N
        icoEspaldar.setMaximumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setMinimumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoEspaldar);
        icoEspaldar.setBounds(90, 140, 50, 50);

        icoCambio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Armas/cambio.png"))); // NOI18N
        PanelEquipo.add(icoCambio2);
        icoCambio2.setBounds(148, 320, 30, 40);

        icoCambio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Armas/cambio.png"))); // NOI18N
        PanelEquipo.add(icoCambio1);
        icoCambio1.setBounds(147, 60, 30, 40);

        PanelEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        PanelEstadisticas.setOpaque(false);

        etiStatBase.setForeground(new java.awt.Color(209, 194, 170));

        muestraStatBase.setForeground(new java.awt.Color(209, 194, 170));

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

        muestraPoder.setForeground(new java.awt.Color(209, 194, 170));
        muestraPoder.setText("-");
        muestraPoder.setMaximumSize(new java.awt.Dimension(34, 14));
        muestraPoder.setMinimumSize(new java.awt.Dimension(34, 14));
        muestraPoder.setPreferredSize(new java.awt.Dimension(34, 14));

        muestraFerocidad.setForeground(new java.awt.Color(209, 194, 170));
        muestraFerocidad.setText("-");
        muestraFerocidad.setMaximumSize(new java.awt.Dimension(34, 14));
        muestraFerocidad.setMinimumSize(new java.awt.Dimension(34, 14));
        muestraFerocidad.setPreferredSize(new java.awt.Dimension(34, 14));

        muestraDureza.setForeground(new java.awt.Color(209, 194, 170));
        muestraDureza.setText("-");
        muestraDureza.setMaximumSize(new java.awt.Dimension(34, 14));
        muestraDureza.setMinimumSize(new java.awt.Dimension(34, 14));
        muestraDureza.setPreferredSize(new java.awt.Dimension(34, 14));

        muestraVitalidad.setForeground(new java.awt.Color(209, 194, 170));
        muestraVitalidad.setText("-");
        muestraVitalidad.setMaximumSize(new java.awt.Dimension(34, 14));
        muestraVitalidad.setMinimumSize(new java.awt.Dimension(34, 14));
        muestraVitalidad.setPreferredSize(new java.awt.Dimension(34, 14));

        muestraPrecision.setForeground(new java.awt.Color(209, 194, 170));
        muestraPrecision.setText("-");

        muestraDanyoCondicion.setForeground(new java.awt.Color(209, 194, 170));
        muestraDanyoCondicion.setText("-");

        muestraPoderCuracion.setForeground(new java.awt.Color(209, 194, 170));
        muestraPoderCuracion.setText("-");

        muestraRAgonia.setForeground(new java.awt.Color(209, 194, 170));
        muestraRAgonia.setText("-");
        muestraRAgonia.setMaximumSize(new java.awt.Dimension(34, 14));
        muestraRAgonia.setMinimumSize(new java.awt.Dimension(34, 14));

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
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestraPieza, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(muestraRareza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiStatBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestraStatBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiPoder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiDureza1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiVitalidad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPrecision1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(muestraPoder, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(muestraDureza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestraVitalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestraPrecision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(muestraRAgonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiPoderCuracion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiDanyoCondicion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiFerocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(muestraPoderCuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(muestraFerocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(muestraDanyoCondicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        PanelEstadisticasLayout.setVerticalGroup(
            PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPieza)
                    .addComponent(muestraPieza)
                    .addComponent(etiStatBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiRareza)
                        .addComponent(muestraRareza))
                    .addComponent(muestraStatBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPoder1)
                    .addComponent(etiFerocidad1)
                    .addComponent(muestraPoder, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraFerocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDureza1)
                    .addComponent(etiDanyoCondicion1)
                    .addComponent(muestraDureza, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraDanyoCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiVitalidad1)
                    .addComponent(etiPoderCuracion1)
                    .addComponent(muestraVitalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraPoderCuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPrecision1)
                    .addComponent(jLabel1)
                    .addComponent(muestraPrecision)
                    .addComponent(muestraRAgonia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelEquipo.add(PanelEstadisticas);
        PanelEstadisticas.setBounds(10, 403, 240, 170);

        fondoEquipo.setBackground(new java.awt.Color(209, 194, 170));
        fondoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
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

        fondoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondo2.jpg"))); // NOI18N
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

        btnCrearPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/add.png"))); // NOI18N
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

        btnModPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/edit1.png"))); // NOI18N
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

        fondoConectadoComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondolabel.png"))); // NOI18N
        fondoConectadoComo.setText("jLabel17");
        getContentPane().add(fondoConectadoComo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 220, 20));

        etiNivelFractales.setText("Tu nivel de fractales actual:");
        getContentPane().add(etiNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 20));

        usuNivelFractalActual.setToolTipText("Tu nivel actual de fractales");
        getContentPane().add(usuNivelFractalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, -1));

        fondoNivelFractales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondolabel.png"))); // NOI18N
        fondoNivelFractales.setText("jLabel17");
        getContentPane().add(fondoNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 10, 185, 20));

        etiPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        etiPersonaje.setText("Personaje:");
        getContentPane().add(etiPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 70, 20));

        fondoPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondolabel.png"))); // NOI18N
        fondoPersonaje.setText("jLabel16");
        getContentPane().add(fondoPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 11, 100, 20));

        fondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo/fondogeneral.jpg"))); // NOI18N
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

    private void cb_dialogoEC_ClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoEC_ClanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoEC_ClanActionPerformed

    private void chk_dialogoCArma_InfusionSimple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_dialogoCArma_InfusionSimple1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_dialogoCArma_InfusionSimple1ActionPerformed

    private void chk_dialogoCArmadura_InfusionSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_dialogoCArmadura_InfusionSimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_dialogoCArmadura_InfusionSimpleActionPerformed

    private void cb_dialogoMP_SlotArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoMP_SlotArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoMP_SlotArmaActionPerformed

    private void cb_dialogoMP_SlotArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoMP_SlotArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoMP_SlotArmaduraActionPerformed

    private void btn_dialogoMP_ModArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoMP_ModArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoMP_ModArmaduraActionPerformed

    private void btn_dialogoMP_ModArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoMP_ModArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoMP_ModArmaActionPerformed

    private void txt_dialogoMP_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoMP_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoMP_NombreActionPerformed

    private void txt_dialogoRP_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoRP_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoRP_NombreActionPerformed

    private void cb_dialogoRP_SlotArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoRP_SlotArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoRP_SlotArmaActionPerformed

    private void cb_dialogoRP_SlotArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dialogoRP_SlotArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dialogoRP_SlotArmaduraActionPerformed

    private void btn_dialogoRP_ModArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoRP_ModArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoRP_ModArmaduraActionPerformed

    private void btn_dialogoRP_ModArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoRP_ModArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoRP_ModArmaActionPerformed

    private void btn_dialogoCArmadura_AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoCArmadura_AplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoCArmadura_AplicarActionPerformed

    private void txt_dialogoCS_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoCS_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoCS_UsuarioActionPerformed

    private void txt_dialogoMU_RepetirContrasenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dialogoMU_RepetirContrasenyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dialogoMU_RepetirContrasenyaActionPerformed

    private void btn_dialogoMU_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogoMU_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dialogoMU_CancelarActionPerformed

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
    public javax.swing.JButton btn_dialogoCArma_Aplicar;
    public javax.swing.JButton btn_dialogoCArma_Cancelar;
    private javax.swing.JButton btn_dialogoCArma_SinEquipar;
    public javax.swing.JButton btn_dialogoCArmadura_Aplicar;
    public javax.swing.JButton btn_dialogoCArmadura_Cancelar;
    private javax.swing.JButton btn_dialogoCArmadura_SinEquipar;
    private javax.swing.JLabel btn_dialogoCC;
    private javax.swing.JButton btn_dialogoCC_Cancelar;
    private javax.swing.JButton btn_dialogoCC_Crear;
    private javax.swing.JButton btn_dialogoCS_Aplicar;
    private javax.swing.JButton btn_dialogoCS_Cancelar;
    private javax.swing.JButton btn_dialogoEC_Cancelar;
    private javax.swing.JButton btn_dialogoEC_Eliminar;
    public javax.swing.JButton btn_dialogoMP_Cancelar;
    public javax.swing.JButton btn_dialogoMP_ModArma;
    public javax.swing.JButton btn_dialogoMP_ModArmadura;
    public javax.swing.JButton btn_dialogoMP_Modificar;
    private javax.swing.JButton btn_dialogoMU_Cancelar;
    private javax.swing.JButton btn_dialogoMU_Modificar;
    private javax.swing.JButton btn_dialogoRP_Cancelar;
    public javax.swing.JButton btn_dialogoRP_ModArma;
    public javax.swing.JButton btn_dialogoRP_ModArmadura;
    private javax.swing.JButton btn_dialogoRP_Registrar;
    private javax.swing.JButton btn_dialogoUC_Cancelar;
    private javax.swing.JButton btn_dialogoUC_Unirse;
    public javax.swing.JComboBox cbPersonaje;
    private javax.swing.JComboBox cb_dialogoAC_Clan;
    public javax.swing.JComboBox cb_dialogoCArma_ModificadorArma;
    public javax.swing.JComboBox cb_dialogoCArma_RarezaArma;
    public javax.swing.JComboBox cb_dialogoCArma_TipoArma;
    public javax.swing.JComboBox cb_dialogoCArmadura_ModificadorArmadura;
    public javax.swing.JComboBox cb_dialogoCArmadura_RarezaArmadura;
    private javax.swing.JComboBox cb_dialogoEC_Clan;
    public javax.swing.JComboBox cb_dialogoMP_Clase;
    public javax.swing.JComboBox cb_dialogoMP_Raza;
    public javax.swing.JComboBox cb_dialogoMP_SlotArma;
    public javax.swing.JComboBox cb_dialogoMP_SlotArmadura;
    private javax.swing.JComboBox cb_dialogoMU_Servidor;
    private javax.swing.JComboBox cb_dialogoRP_Clase;
    private javax.swing.JComboBox cb_dialogoRP_Raza;
    private javax.swing.JComboBox cb_dialogoRP_SlotArma;
    private javax.swing.JComboBox cb_dialogoRP_SlotArmadura;
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
    public javax.swing.JCheckBox chk_dialogoCArma_InfusionSimple1;
    public javax.swing.JCheckBox chk_dialogoCArma_InfusionSimple2;
    public javax.swing.JCheckBox chk_dialogoCArmadura_InfusionSimple;
    private javax.swing.JCheckBox chk_dialogoMU_Aleman;
    private javax.swing.JCheckBox chk_dialogoMU_Espanyol;
    private javax.swing.JCheckBox chk_dialogoMU_Frances;
    private javax.swing.JCheckBox chk_dialogoMU_Ingles;
    private javax.swing.JDialog dialogoAbandonarClan;
    private javax.swing.JDialog dialogoAcercaDe;
    private javax.swing.JDialog dialogoCambioServidor;
    public javax.swing.JDialog dialogoConfigurarArma;
    public javax.swing.JDialog dialogoConfigurarArmadura;
    private javax.swing.JDialog dialogoCrearClan;
    private javax.swing.JDialog dialogoEliminarClan;
    public javax.swing.JDialog dialogoModificarPersonaje;
    public javax.swing.JDialog dialogoModificarUsuario;
    public javax.swing.JDialog dialogoRegistrarPersonaje;
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
    public javax.swing.JLabel etiStatBase;
    public javax.swing.JLabel etiVitalidad;
    public javax.swing.JLabel etiVitalidad1;
    private javax.swing.JLabel eti_dialogoAC_Clan;
    private javax.swing.JLabel eti_dialogoAD_Texto;
    private javax.swing.JLabel eti_dialogoCArma_ModificadorArma;
    private javax.swing.JLabel eti_dialogoCArma_RarezaArma;
    private javax.swing.JLabel eti_dialogoCArma_SlotArma;
    private javax.swing.JLabel eti_dialogoCArma_TipoArma;
    private javax.swing.JLabel eti_dialogoCArmadura_InfusionAgonia;
    private javax.swing.JLabel eti_dialogoCArmadura_ModificadorArmadura;
    private javax.swing.JLabel eti_dialogoCArmadura_RarezaArmadura;
    private javax.swing.JLabel eti_dialogoCArmadura_SlotArmadura;
    private javax.swing.JLabel eti_dialogoCC_NombreClan;
    private javax.swing.JLabel eti_dialogoCC_Tag;
    private javax.swing.JLabel eti_dialogoCS_Contraseña;
    private javax.swing.JLabel eti_dialogoCS_DireccionIP;
    private javax.swing.JLabel eti_dialogoCS_NombreBD;
    private javax.swing.JLabel eti_dialogoCS_Puerto;
    private javax.swing.JLabel eti_dialogoCS_Usuario;
    private javax.swing.JLabel eti_dialogoEC_Clan;
    private javax.swing.JLabel eti_dialogoMP_Clase;
    private javax.swing.JLabel eti_dialogoMP_Nombre;
    private javax.swing.JLabel eti_dialogoMP_Raza;
    private javax.swing.JLabel eti_dialogoMP_SlotArma;
    private javax.swing.JLabel eti_dialogoMP_SlotArmadura;
    private javax.swing.JLabel eti_dialogoMU_ContrasenyaAntigua;
    private javax.swing.JLabel eti_dialogoMU_Email;
    private javax.swing.JLabel eti_dialogoMU_Idiomas;
    private javax.swing.JLabel eti_dialogoMU_NombreCuenta;
    private javax.swing.JLabel eti_dialogoMU_NuevaContrasenya;
    private javax.swing.JLabel eti_dialogoMU_RepetirContrasenya;
    private javax.swing.JLabel eti_dialogoMU_Servidor;
    private javax.swing.JLabel eti_dialogoRP_Clase;
    private javax.swing.JLabel eti_dialogoRP_Nombre;
    private javax.swing.JLabel eti_dialogoRP_Raza;
    private javax.swing.JLabel eti_dialogoRP_SlotArma;
    private javax.swing.JLabel eti_dialogoRP_SlotArmadura;
    private javax.swing.JLabel eti_dialogoUC_Clan;
    public javax.swing.JLabel fondoBusqueda;
    public javax.swing.JLabel fondoConectadoComo;
    public javax.swing.JLabel fondoEquipo;
    public javax.swing.JLabel fondoInformacion;
    public javax.swing.JLabel fondoNivelFractales;
    public javax.swing.JLabel fondoPersonaje;
    public javax.swing.JLabel fondoPrincipal;
    private javax.swing.JLabel fondo_dialogoAC;
    private javax.swing.JLabel fondo_dialogoAD;
    private javax.swing.JLabel fondo_dialogoCArma;
    private javax.swing.JLabel fondo_dialogoCArmadura;
    private javax.swing.JLabel fondo_dialogoCS;
    private javax.swing.JLabel fondo_dialogoEC;
    private javax.swing.JLabel fondo_dialogoMP;
    private javax.swing.JLabel fondo_dialogoMU;
    private javax.swing.JLabel fondo_dialogoRP;
    private javax.swing.JLabel fondo_dialogoUC;
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
    public javax.swing.JMenuItem itemModPj;
    public javax.swing.JMenuItem itemModificarDatos;
    public javax.swing.JMenuItem itemRegClan;
    public javax.swing.JMenuItem itemRegPj;
    public javax.swing.JMenuItem itemUnirClan;
    private javax.swing.JLabel jLabel1;
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
    public javax.swing.JLabel mostrar_dialogoCArma_SlotArma;
    public javax.swing.JLabel mostrar_dialogoCArmadura_SlotArmadura;
    public javax.swing.JLabel muestraDanyoCondicion;
    public javax.swing.JLabel muestraDureza;
    public javax.swing.JLabel muestraFerocidad;
    public javax.swing.JLabel muestraPieza;
    public javax.swing.JLabel muestraPoder;
    public javax.swing.JLabel muestraPoderCuracion;
    public javax.swing.JLabel muestraPrecision;
    public javax.swing.JLabel muestraRAgonia;
    public javax.swing.JLabel muestraRareza;
    public javax.swing.JLabel muestraStatBase;
    public javax.swing.JLabel muestraVitalidad;
    public javax.swing.JPanel panel_dialogoMP_Equipo;
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
    private javax.swing.JLabel txt_dialogoCArmadura_InfusionAgonia;
    public javax.swing.JTextField txt_dialogoCArmadura_ResistAgonia;
    private javax.swing.JTextField txt_dialogoCC_NombreClan;
    private javax.swing.JTextField txt_dialogoCC_Tag;
    private javax.swing.JPasswordField txt_dialogoCS_Contraseña;
    private javax.swing.JTextField txt_dialogoCS_DireccionIP;
    private javax.swing.JTextField txt_dialogoCS_NombreBD;
    private javax.swing.JTextField txt_dialogoCS_Puerto;
    private javax.swing.JTextField txt_dialogoCS_Usuario;
    public javax.swing.JTextField txt_dialogoMP_Nombre;
    private javax.swing.JPasswordField txt_dialogoMU_ContrasenyaAntigua;
    private javax.swing.JTextField txt_dialogoMU_Email;
    private javax.swing.JPasswordField txt_dialogoMU_NuevaContrasenya;
    private javax.swing.JPasswordField txt_dialogoMU_RepetirContrasenya;
    private javax.swing.JTextField txt_dialogoRP_Nombre;
    public javax.swing.JSpinner usuNivelFractalActual;
    // End of variables declaration//GEN-END:variables
}
