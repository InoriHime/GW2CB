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

    
    public VentanaPrincipal() {
        
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
        txt_dialogoMU_ContrasenyaAntigua = new javax.swing.JTextField();
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
        icoSetArma1 = new javax.swing.JLabel();
        icoSetArma2 = new javax.swing.JLabel();
        icoAnillo2 = new javax.swing.JLabel();
        icoAnillo1 = new javax.swing.JLabel();
        icoAccesorio2 = new javax.swing.JLabel();
        icoAccesorio1 = new javax.swing.JLabel();
        icoAmuleto = new javax.swing.JLabel();
        icoEspaldar = new javax.swing.JLabel();
        PanelEstadisticas = new javax.swing.JPanel();
        fondoEquipo = new javax.swing.JLabel();
        PanelBusqueda = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        radPersonaje = new javax.swing.JRadioButton();
        radClan = new javax.swing.JRadioButton();
        radCuenta = new javax.swing.JRadioButton();
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
        jSpinner1 = new javax.swing.JSpinner();
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
                        .addComponent(eti_dialogoMU_NuevaContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dialogoMU_NuevaContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                        .addComponent(eti_dialogoMU_ContrasenyaAntigua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dialogoMU_ContrasenyaAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_dialogoMU_CambiarContrasenyaLayout.createSequentialGroup()
                        .addComponent(eti_dialogoMU_RepetirContrasenya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dialogoMU_RepetirContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guild Wars 2 Character Browser");
        setMinimumSize(new java.awt.Dimension(982, 661));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/busqueda.png"))); // NOI18N
        getContentPane().add(tituloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 220, 40));

        tituloPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/personaje.png"))); // NOI18N
        getContentPane().add(tituloPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 365, 220, 40));

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
        ));
        TablaPersonajes.setOpaque(false);
        TablaPersonajes.setRowSelectionAllowed(false);
        TablaPersonajes.getTableHeader().setResizingAllowed(false);
        TablaPersonajes.getTableHeader().setReorderingAllowed(false);
        PanelTabla.setViewportView(TablaPersonajes);

        getContentPane().add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 580, 320));

        PanelInformacion.setMaximumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setMinimumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setPreferredSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarNombrePersonaje.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombrePersonaje.setText("-");
        PanelInformacion.add(mostrarNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 129, -1));

        etiNombrePersonaje.setForeground(new java.awt.Color(209, 194, 170));
        etiNombrePersonaje.setText("Nombre Personaje:");
        PanelInformacion.add(etiNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        etiIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        etiIdiomas.setText("Idiomas:");
        PanelInformacion.add(etiIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 55, -1));

        etiNombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        etiNombreCuenta.setText("Nombre de cuenta:");
        PanelInformacion.add(etiNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        etiServidor.setForeground(new java.awt.Color(209, 194, 170));
        etiServidor.setText("Servidor:");
        PanelInformacion.add(etiServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 92, -1));

        PanelAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Atributos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        PanelAtributos.setOpaque(false);

        etiPoder.setForeground(new java.awt.Color(209, 194, 170));
        etiPoder.setText("Poder:");

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
        etiDanyoCondicion.setText("Daño de Condición:");

        etiPrecision.setForeground(new java.awt.Color(209, 194, 170));
        etiPrecision.setText("Precisión:");

        etiDureza.setForeground(new java.awt.Color(209, 194, 170));
        etiDureza.setText("Dureza:");

        etiVitalidad.setForeground(new java.awt.Color(209, 194, 170));
        etiVitalidad.setText("Vitalidad:");

        etiFerocidad.setForeground(new java.awt.Color(209, 194, 170));
        etiFerocidad.setText("Ferocidad:");

        etiPoderCuracion.setForeground(new java.awt.Color(209, 194, 170));
        etiPoderCuracion.setText("Poder de Curación:");

        etiDuracionBendicion.setForeground(new java.awt.Color(209, 194, 170));
        etiDuracionBendicion.setText("Durac. Bendición:");

        etiDuracionCondicion.setForeground(new java.awt.Color(209, 194, 170));
        etiDuracionCondicion.setText("Durac. de Condición:");

        etiArmadura.setForeground(new java.awt.Color(209, 194, 170));
        etiArmadura.setText("Armadura:");

        etiSalud.setForeground(new java.awt.Color(209, 194, 170));
        etiSalud.setText("Salud:");

        etiProbabilidadCritica.setForeground(new java.awt.Color(209, 194, 170));
        etiProbabilidadCritica.setText("Prob. Crítica:");

        etiDanyoCritico.setForeground(new java.awt.Color(209, 194, 170));
        etiDanyoCritico.setText("Daño Crítico:");

        etiAgonia.setForeground(new java.awt.Color(209, 194, 170));
        etiAgonia.setText("Resist. Agonía:");

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiPoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiPrecision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDureza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiVitalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarPrecision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarDureza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarVitalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarPoder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiDuracionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiDanyoCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiDuracionBendicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiFerocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiPoderCuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarDuracionBendicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mostrarPoderCuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarFerocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDuracionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDanyoCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiAgonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiProbabilidadCritica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDanyoCritico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarProbabilidadCritica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarDanyoCritico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarSalud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarAgonia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiProbabilidadCritica)
                            .addComponent(mostrarProbabilidadCritica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDanyoCritico)
                            .addComponent(mostrarDanyoCritico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiSalud)
                            .addComponent(mostrarSalud))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiAgonia)
                            .addComponent(mostrarAgonia)))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDuracionBendicion)
                            .addComponent(mostrarDuracionBendicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDanyoCondicion)
                            .addComponent(mostrarDanyoCondicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDuracionCondicion)
                            .addComponent(mostrarDuracionCondicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiFerocidad)
                            .addComponent(mostrarFerocidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPoderCuracion)
                            .addComponent(mostrarPoderCuracion)))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPoder)
                            .addComponent(mostrarPoder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPrecision)
                            .addComponent(mostrarPrecision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDureza)
                            .addComponent(mostrarDureza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiVitalidad)
                            .addComponent(mostrarVitalidad))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelInformacion.add(PanelAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, 150));

        mostrarNombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombreCuenta.setText("-");
        PanelInformacion.add(mostrarNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 112, -1));

        mostrarIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        mostrarIdiomas.setText("-");
        mostrarIdiomas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelInformacion.add(mostrarIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 149, 29));

        mostrarServidor.setForeground(new java.awt.Color(209, 194, 170));
        mostrarServidor.setText("-");
        PanelInformacion.add(mostrarServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 129, -1));

        etiClase.setForeground(new java.awt.Color(209, 194, 170));
        etiClase.setText("Clase:");
        PanelInformacion.add(etiClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 92, -1));

        mostrarClase.setForeground(new java.awt.Color(209, 194, 170));
        mostrarClase.setText("-");
        PanelInformacion.add(mostrarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 129, -1));

        fondoInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        PanelInformacion.add(fondoInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 240));

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 580, 240));

        PanelEquipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelEquipo.setLayout(null);

        icoCabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/cabeza.jpg"))); // NOI18N
        PanelEquipo.add(icoCabeza);
        icoCabeza.setBounds(10, 20, 60, 54);

        icoHombros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/hombreras.jpg"))); // NOI18N
        PanelEquipo.add(icoHombros);
        icoHombros.setBounds(10, 80, 60, 54);

        icoPecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pecho.jpg"))); // NOI18N
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

        icoSetArma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/arma1.png"))); // NOI18N
        PanelEquipo.add(icoSetArma1);
        icoSetArma1.setBounds(90, 20, 60, 110);

        icoSetArma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/arma2.png"))); // NOI18N
        PanelEquipo.add(icoSetArma2);
        icoSetArma2.setBounds(170, 20, 60, 110);

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

        icoEspaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/espaldar.jpg"))); // NOI18N
        icoEspaldar.setMaximumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setMinimumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoEspaldar);
        icoEspaldar.setBounds(90, 140, 50, 50);

        PanelEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        PanelEstadisticas.setOpaque(false);

        javax.swing.GroupLayout PanelEstadisticasLayout = new javax.swing.GroupLayout(PanelEstadisticas);
        PanelEstadisticas.setLayout(PanelEstadisticasLayout);
        PanelEstadisticasLayout.setHorizontalGroup(
            PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelEstadisticasLayout.setVerticalGroup(
            PanelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
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

        etiResistAgoniaMin.setForeground(new java.awt.Color(209, 194, 170));
        etiResistAgoniaMin.setText("Resist. Agonía mínima:");
        PanelBusqueda.add(etiResistAgoniaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));
        PanelBusqueda.add(txtAgoniaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 75, -1));

        btnBuscar.setBackground(new java.awt.Color(209, 194, 170));
        btnBuscar.setText("Buscar");
        btnBuscar.setOpaque(false);
        PanelBusqueda.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 197, -1));

        etiIdioma.setForeground(new java.awt.Color(209, 194, 170));
        etiIdioma.setText("Idioma:");
        PanelBusqueda.add(etiIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        chkEspanyol.setForeground(new java.awt.Color(209, 194, 170));
        chkEspanyol.setText("Español");
        chkEspanyol.setOpaque(false);
        PanelBusqueda.add(chkEspanyol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        chkAleman.setForeground(new java.awt.Color(209, 194, 170));
        chkAleman.setText("Alemán");
        chkAleman.setOpaque(false);
        PanelBusqueda.add(chkAleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        chkFrances.setForeground(new java.awt.Color(209, 194, 170));
        chkFrances.setText("Francés");
        chkFrances.setOpaque(false);
        PanelBusqueda.add(chkFrances, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        chkIngles.setForeground(new java.awt.Color(209, 194, 170));
        chkIngles.setText("Inglés");
        chkIngles.setOpaque(false);
        PanelBusqueda.add(chkIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        etiClases.setForeground(new java.awt.Color(209, 194, 170));
        etiClases.setText("Clases:");
        PanelBusqueda.add(etiClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        chkGuardian.setForeground(new java.awt.Color(209, 194, 170));
        chkGuardian.setText("Guardián");
        chkGuardian.setOpaque(false);
        PanelBusqueda.add(chkGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        chkElementalista.setForeground(new java.awt.Color(209, 194, 170));
        chkElementalista.setText("Elementalista");
        chkElementalista.setOpaque(false);
        PanelBusqueda.add(chkElementalista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        chkGuerrero.setForeground(new java.awt.Color(209, 194, 170));
        chkGuerrero.setText("Guerrero");
        chkGuerrero.setOpaque(false);
        PanelBusqueda.add(chkGuerrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        chkNigromante.setForeground(new java.awt.Color(209, 194, 170));
        chkNigromante.setText("Nigromante");
        chkNigromante.setOpaque(false);
        PanelBusqueda.add(chkNigromante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        chkGuardabosques.setForeground(new java.awt.Color(209, 194, 170));
        chkGuardabosques.setText("Guardabosques");
        chkGuardabosques.setOpaque(false);
        PanelBusqueda.add(chkGuardabosques, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        chkIngeniero.setForeground(new java.awt.Color(209, 194, 170));
        chkIngeniero.setText("Ingeniero");
        chkIngeniero.setOpaque(false);
        PanelBusqueda.add(chkIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        chkLadron.setForeground(new java.awt.Color(209, 194, 170));
        chkLadron.setText("Ladrón");
        chkLadron.setOpaque(false);
        chkLadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLadronActionPerformed(evt);
            }
        });
        PanelBusqueda.add(chkLadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        chkHipnotizador.setForeground(new java.awt.Color(209, 194, 170));
        chkHipnotizador.setText("Hipnotizador");
        chkHipnotizador.setOpaque(false);
        PanelBusqueda.add(chkHipnotizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        chkBuscarMiembrosMiClan.setForeground(new java.awt.Color(209, 194, 170));
        chkBuscarMiembrosMiClan.setText("Buscar solo miembros de mi clan");
        chkBuscarMiembrosMiClan.setOpaque(false);
        PanelBusqueda.add(chkBuscarMiembrosMiClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        fondoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        PanelBusqueda.add(fondoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 407));

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 407));

        etiConectadoComo.setText("Conectado como:");
        getContentPane().add(etiConectadoComo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, -1, 20));

        mostrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrarUsuario.setText("-");
        getContentPane().add(mostrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 20));

        cbPersonaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPersonaje.setToolTipText("Seleccionar personaje");
        cbPersonaje.setOpaque(false);
        getContentPane().add(cbPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 10, 130, 22));

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
        getContentPane().add(btnCrearPj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 8, 27, 26));

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
        getContentPane().add(btnModPj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 8, 27, 26));

        fondoConectadoComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        fondoConectadoComo.setText("jLabel17");
        getContentPane().add(fondoConectadoComo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 220, 20));

        etiNivelFractales.setText("Nivel de Fractales:");
        getContentPane().add(etiNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, 20));

        jSpinner1.setToolTipText("Tu nivel actual de fractales");
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, -1));

        fondoNivelFractales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        fondoNivelFractales.setText("jLabel17");
        getContentPane().add(fondoNivelFractales, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 150, 20));

        etiPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        etiPersonaje.setText("Personaje:");
        getContentPane().add(etiPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 70, 20));

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
    private javax.swing.JButton btn_dialogoMP_Cancelar;
    private javax.swing.JButton btn_dialogoMP_Modificar;
    private javax.swing.JButton btn_dialogoMU_Cancelar;
    private javax.swing.JButton btn_dialogoMU_Modificar;
    private javax.swing.JButton btn_dialogoRP_Cancelar;
    private javax.swing.JButton btn_dialogoRP_Registrar;
    public javax.swing.JComboBox cbPersonaje;
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
    private javax.swing.JDialog dialogoModificarPersonaje;
    private javax.swing.JDialog dialogoModificarUsuario;
    private javax.swing.JDialog dialogoRegistrarPersonaje;
    public javax.swing.JLabel etiAgonia;
    public javax.swing.JLabel etiArmadura;
    public javax.swing.JLabel etiClase;
    public javax.swing.JLabel etiClases;
    public javax.swing.JLabel etiConectadoComo;
    public javax.swing.JLabel etiDanyoCondicion;
    public javax.swing.JLabel etiDanyoCritico;
    public javax.swing.JLabel etiDuracionBendicion;
    public javax.swing.JLabel etiDuracionCondicion;
    public javax.swing.JLabel etiDureza;
    public javax.swing.JLabel etiFerocidad;
    public javax.swing.JLabel etiIdioma;
    public javax.swing.JLabel etiIdiomas;
    private javax.swing.JLabel etiNivelFractales;
    public javax.swing.JLabel etiNombreCuenta;
    public javax.swing.JLabel etiNombrePersonaje;
    public javax.swing.JLabel etiPersonaje;
    public javax.swing.JLabel etiPoder;
    public javax.swing.JLabel etiPoderCuracion;
    public javax.swing.JLabel etiPrecision;
    public javax.swing.JLabel etiProbabilidadCritica;
    public javax.swing.JLabel etiResistAgoniaMin;
    public javax.swing.JLabel etiSalud;
    public javax.swing.JLabel etiServidor;
    public javax.swing.JLabel etiVitalidad;
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
    public javax.swing.JLabel icoCabeza;
    public javax.swing.JLabel icoEspaldar;
    public javax.swing.JLabel icoHombros;
    public javax.swing.JLabel icoManos;
    public javax.swing.JLabel icoPecho;
    public javax.swing.JLabel icoPiernas;
    public javax.swing.JLabel icoPies;
    public javax.swing.JLabel icoSetArma1;
    public javax.swing.JLabel icoSetArma2;
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
    private javax.swing.JSpinner jSpinner1;
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
    private javax.swing.JTextField txt_dialogoMP_InfusionAgoniaArmadura;
    private javax.swing.JTextField txt_dialogoMP_Nombre;
    private javax.swing.JTextField txt_dialogoMU_ContrasenyaAntigua;
    private javax.swing.JTextField txt_dialogoMU_Email;
    private javax.swing.JPasswordField txt_dialogoMU_NuevaContrasenya;
    private javax.swing.JPasswordField txt_dialogoMU_RepetirContrasenya;
    private javax.swing.JTextField txt_dialogoRP_InfusionAgoniaArmadura;
    private javax.swing.JTextField txt_dialogoRP_Nombre;
    // End of variables declaration//GEN-END:variables
}
