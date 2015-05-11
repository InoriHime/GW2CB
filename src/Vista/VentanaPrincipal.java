/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        
        /*Interfaz del estilo Look and Feel*/
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        
        /*Le damos formato al header de la tabla*/
        TablaPersonajes.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            l.setBackground(new Color(27, 23, 20));
            l.setForeground(Color.white);
            l.setHorizontalAlignment(CENTER);
            
            return l;
        }
        });
        /*Hacemos invisible el JScrollpane*/
        PanelPersonajes.setOpaque(false);
        PanelPersonajes.getViewport().setOpaque(false);
        PanelPersonajes.setBorder(null);
        PanelPersonajes.getViewport().setBorder(null);
        
        TablaPersonajes.setBackground(new Color(160, 133, 117, 159));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBuscador = new javax.swing.ButtonGroup();
        PanelPersonajes = new javax.swing.JScrollPane();
        TablaPersonajes = new javax.swing.JTable();
        PanelInformacion = new javax.swing.JPanel();
        mostrarNombrePersonaje = new javax.swing.JLabel();
        etiNomPj = new javax.swing.JLabel();
        etiIdiomas = new javax.swing.JLabel();
        etiCuenta = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icoEspaldar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FondoPj = new javax.swing.JLabel();
        PanelBusqueda = new javax.swing.JPanel();
        etiBusqyeda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        radPersonaje = new javax.swing.JRadioButton();
        radClan = new javax.swing.JRadioButton();
        radCuenta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtAgoniaMinima = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etiIdioma = new javax.swing.JLabel();
        chkEspanyol = new javax.swing.JCheckBox();
        chkAleman = new javax.swing.JCheckBox();
        chkFrances = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chkIngles1 = new javax.swing.JCheckBox();
        chkAleman1 = new javax.swing.JCheckBox();
        chkEspanyol1 = new javax.swing.JCheckBox();
        chkFrances1 = new javax.swing.JCheckBox();
        chkIngles2 = new javax.swing.JCheckBox();
        chkAleman2 = new javax.swing.JCheckBox();
        chkEspanyol2 = new javax.swing.JCheckBox();
        chkFrances2 = new javax.swing.JCheckBox();
        fondoBusqueda = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FondoPrincipal = new javax.swing.JLabel();
        fondotable = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        UsuarioMenu = new javax.swing.JMenu();
        itemModificarDatos = new javax.swing.JMenuItem();
        SeparadorUsuario2 = new javax.swing.JPopupMenu.Separator();
        itemCerrarUsuario = new javax.swing.JMenuItem();
        EditarMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        AyudaMenu = new javax.swing.JMenu();
        itemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guild Wars 2 Character Search");
        setMinimumSize(new java.awt.Dimension(982, 661));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPersonajes.setBackground(new java.awt.Color(255, 51, 51));
        PanelPersonajes.setBorder(null);
        PanelPersonajes.setOpaque(false);

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
        PanelPersonajes.setViewportView(TablaPersonajes);

        getContentPane().add(PanelPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 465, 340));

        PanelInformacion.setMaximumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setMinimumSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setPreferredSize(new java.awt.Dimension(467, 245));
        PanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarNombrePersonaje.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombrePersonaje.setText("-");
        PanelInformacion.add(mostrarNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 11, 129, -1));

        etiNomPj.setForeground(new java.awt.Color(209, 194, 170));
        etiNomPj.setText("Nombre Personaje:");
        PanelInformacion.add(etiNomPj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        etiIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        etiIdiomas.setText("Idiomas:");
        PanelInformacion.add(etiIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 31, 55, -1));

        etiCuenta.setForeground(new java.awt.Color(209, 194, 170));
        etiCuenta.setText("Nombre de cuenta:");
        PanelInformacion.add(etiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 11, -1, -1));

        etiServidor.setForeground(new java.awt.Color(209, 194, 170));
        etiServidor.setText("Servidor:");
        PanelInformacion.add(etiServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 92, -1));

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
        etiAgonia.setText("Resis. Agonía:");

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

        PanelInformacion.add(PanelAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        mostrarNombreCuenta.setForeground(new java.awt.Color(209, 194, 170));
        mostrarNombreCuenta.setText("-");
        PanelInformacion.add(mostrarNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 11, 112, -1));

        mostrarIdiomas.setForeground(new java.awt.Color(209, 194, 170));
        mostrarIdiomas.setText("-");
        PanelInformacion.add(mostrarIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 31, 149, 29));

        mostrarServidor.setForeground(new java.awt.Color(209, 194, 170));
        mostrarServidor.setText("-");
        PanelInformacion.add(mostrarServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 31, 129, -1));

        etiClase.setForeground(new java.awt.Color(209, 194, 170));
        etiClase.setText("Clase:");
        PanelInformacion.add(etiClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 92, -1));

        mostrarClase.setForeground(new java.awt.Color(209, 194, 170));
        mostrarClase.setText("-");
        PanelInformacion.add(mostrarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 51, 129, -1));

        fondoInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        PanelInformacion.add(fondoInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 240));

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 465, 240));

        PanelEquipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelEquipo.setLayout(null);

        icoCabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/cabeza.jpg"))); // NOI18N
        PanelEquipo.add(icoCabeza);
        icoCabeza.setBounds(10, 30, 60, 54);

        icoHombros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/hombreras.jpg"))); // NOI18N
        PanelEquipo.add(icoHombros);
        icoHombros.setBounds(10, 90, 60, 54);

        icoPecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pecho.jpg"))); // NOI18N
        PanelEquipo.add(icoPecho);
        icoPecho.setBounds(10, 150, 60, 54);

        icoManos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/guantes.jpg"))); // NOI18N
        PanelEquipo.add(icoManos);
        icoManos.setBounds(10, 210, 60, 54);

        icoPiernas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pantalon.jpg"))); // NOI18N
        PanelEquipo.add(icoPiernas);
        icoPiernas.setBounds(10, 270, 60, 54);

        icoPies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botas.jpg"))); // NOI18N
        PanelEquipo.add(icoPies);
        icoPies.setBounds(10, 330, 60, 54);

        icoSetArma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/arma1.png"))); // NOI18N
        PanelEquipo.add(icoSetArma1);
        icoSetArma1.setBounds(130, 10, 60, 110);

        icoSetArma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/arma2.png"))); // NOI18N
        PanelEquipo.add(icoSetArma2);
        icoSetArma2.setBounds(130, 120, 60, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/anillo2.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(jLabel7);
        jLabel7.setBounds(180, 340, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/anillo1.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(jLabel6);
        jLabel6.setBounds(130, 340, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/accesorio2.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(jLabel5);
        jLabel5.setBounds(180, 290, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/accesorio1.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(jLabel4);
        jLabel4.setBounds(130, 290, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/amuleto.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(jLabel3);
        jLabel3.setBounds(180, 240, 50, 50);

        icoEspaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/espaldar.jpg"))); // NOI18N
        icoEspaldar.setMaximumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setMinimumSize(new java.awt.Dimension(40, 40));
        icoEspaldar.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelEquipo.add(icoEspaldar);
        icoEspaldar.setBounds(130, 240, 50, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 194, 170), 1, true), "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(209, 194, 170))); // NOI18N
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        PanelEquipo.add(jPanel1);
        jPanel1.setBounds(10, 403, 240, 180);

        FondoPj.setBackground(new java.awt.Color(209, 194, 170));
        FondoPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        FondoPj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 33, 33)));
        PanelEquipo.add(FondoPj);
        FondoPj.setBounds(0, 0, 260, 590);

        getContentPane().add(PanelEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 40, 258, 590));

        PanelBusqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelBusqueda.setAlignmentX(0.0F);
        PanelBusqueda.setAlignmentY(0.0F);
        PanelBusqueda.setPreferredSize(new java.awt.Dimension(221, 36));
        PanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiBusqyeda.setBackground(new java.awt.Color(209, 194, 170));
        etiBusqyeda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiBusqyeda.setForeground(new java.awt.Color(27, 23, 20));
        etiBusqyeda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiBusqyeda.setText("Búsqueda");
        etiBusqyeda.setAlignmentY(0.0F);
        etiBusqyeda.setBorder(new javax.swing.border.MatteBorder(null));
        etiBusqyeda.setMaximumSize(new java.awt.Dimension(41, 20));
        etiBusqyeda.setMinimumSize(new java.awt.Dimension(41, 20));
        etiBusqyeda.setOpaque(true);
        etiBusqyeda.setPreferredSize(new java.awt.Dimension(41, 20));
        PanelBusqueda.add(etiBusqyeda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -1, 230, -1));
        PanelBusqueda.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, 197, -1));

        grupoBuscador.add(radPersonaje);
        radPersonaje.setForeground(new java.awt.Color(209, 194, 170));
        radPersonaje.setText("Personaje");
        radPersonaje.setOpaque(false);
        radPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPersonajeActionPerformed(evt);
            }
        });
        PanelBusqueda.add(radPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));

        grupoBuscador.add(radClan);
        radClan.setForeground(new java.awt.Color(209, 194, 170));
        radClan.setText("Clan");
        radClan.setOpaque(false);
        PanelBusqueda.add(radClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 65, -1, -1));

        grupoBuscador.add(radCuenta);
        radCuenta.setForeground(new java.awt.Color(209, 194, 170));
        radCuenta.setText("Cuenta");
        radCuenta.setOpaque(false);
        PanelBusqueda.add(radCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 65, -1, -1));

        jLabel1.setForeground(new java.awt.Color(209, 194, 170));
        jLabel1.setText("R. Agonía minima:");
        PanelBusqueda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        PanelBusqueda.add(txtAgoniaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 75, -1));

        btnBuscar.setBackground(new java.awt.Color(209, 194, 170));
        btnBuscar.setText("Buscar");
        btnBuscar.setOpaque(false);
        PanelBusqueda.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 197, -1));

        etiIdioma.setForeground(new java.awt.Color(209, 194, 170));
        etiIdioma.setText("Idioma:");
        PanelBusqueda.add(etiIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        chkEspanyol.setForeground(new java.awt.Color(209, 194, 170));
        chkEspanyol.setText("Español");
        chkEspanyol.setOpaque(false);
        PanelBusqueda.add(chkEspanyol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        chkAleman.setForeground(new java.awt.Color(209, 194, 170));
        chkAleman.setText("Alemán");
        chkAleman.setOpaque(false);
        PanelBusqueda.add(chkAleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        chkFrances.setForeground(new java.awt.Color(209, 194, 170));
        chkFrances.setSelected(true);
        chkFrances.setText("Francés");
        chkFrances.setOpaque(false);
        PanelBusqueda.add(chkFrances, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        chkIngles.setForeground(new java.awt.Color(209, 194, 170));
        chkIngles.setText("Inglés");
        chkIngles.setOpaque(false);
        PanelBusqueda.add(chkIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel2.setForeground(new java.awt.Color(209, 194, 170));
        jLabel2.setText("Clases:");
        PanelBusqueda.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        chkIngles1.setForeground(new java.awt.Color(209, 194, 170));
        chkIngles1.setText("Guardián");
        chkIngles1.setOpaque(false);
        PanelBusqueda.add(chkIngles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        chkAleman1.setForeground(new java.awt.Color(209, 194, 170));
        chkAleman1.setText("Elementalista");
        chkAleman1.setOpaque(false);
        PanelBusqueda.add(chkAleman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        chkEspanyol1.setForeground(new java.awt.Color(209, 194, 170));
        chkEspanyol1.setText("Guerrero");
        chkEspanyol1.setOpaque(false);
        PanelBusqueda.add(chkEspanyol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        chkFrances1.setForeground(new java.awt.Color(209, 194, 170));
        chkFrances1.setSelected(true);
        chkFrances1.setText("Nigromante");
        chkFrances1.setOpaque(false);
        PanelBusqueda.add(chkFrances1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        chkIngles2.setForeground(new java.awt.Color(209, 194, 170));
        chkIngles2.setText("Guardabosques");
        chkIngles2.setOpaque(false);
        PanelBusqueda.add(chkIngles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        chkAleman2.setForeground(new java.awt.Color(209, 194, 170));
        chkAleman2.setText("Ingeniero");
        chkAleman2.setOpaque(false);
        PanelBusqueda.add(chkAleman2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        chkEspanyol2.setForeground(new java.awt.Color(209, 194, 170));
        chkEspanyol2.setText("Ladron");
        chkEspanyol2.setOpaque(false);
        PanelBusqueda.add(chkEspanyol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        chkFrances2.setForeground(new java.awt.Color(209, 194, 170));
        chkFrances2.setSelected(true);
        chkFrances2.setText("Hipnotizador");
        chkFrances2.setOpaque(false);
        PanelBusqueda.add(chkFrances2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        fondoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        PanelBusqueda.add(fondoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 400));

        jLabel11.setText("Conectado como:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel12.setText("-");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 132, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 10, 139, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 9, 26, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Personaje:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 13, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondolabel.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 70, 20));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/4.jpg"))); // NOI18N
        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 987, 640));

        fondotable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo2.jpg"))); // NOI18N
        fondotable.setText("jLabel6");
        getContentPane().add(fondotable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 470, 340));

        UsuarioMenu.setText("Usuario");

        itemModificarDatos.setText("Modificar datos...");
        UsuarioMenu.add(itemModificarDatos);
        UsuarioMenu.add(SeparadorUsuario2);

        itemCerrarUsuario.setText("Cerrar usuario");
        UsuarioMenu.add(itemCerrarUsuario);

        BarraMenu.add(UsuarioMenu);

        EditarMenu.setText("Editar");

        jMenuItem1.setText("Registrar Personaje...");
        EditarMenu.add(jMenuItem1);

        jMenuItem3.setText("Eliminar Personaje...");
        EditarMenu.add(jMenuItem3);
        EditarMenu.add(jSeparator1);

        jMenuItem4.setText("Registrar Clan...");
        EditarMenu.add(jMenuItem4);

        jMenuItem5.setText("Modificar Clan...");
        EditarMenu.add(jMenuItem5);

        jMenuItem6.setText("Eliminar Clan...");
        EditarMenu.add(jMenuItem6);

        BarraMenu.add(EditarMenu);

        AyudaMenu.setText("Ayuda");

        itemAcerca.setText("Acerca de...");
        AyudaMenu.add(itemAcerca);

        BarraMenu.add(AyudaMenu);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radPersonajeActionPerformed

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
    private javax.swing.JMenu AyudaMenu;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu EditarMenu;
    private javax.swing.JLabel FondoPj;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelEquipo;
    private javax.swing.JPanel PanelInformacion;
    private javax.swing.JScrollPane PanelPersonajes;
    private javax.swing.JPopupMenu.Separator SeparadorUsuario2;
    private javax.swing.JTable TablaPersonajes;
    private javax.swing.JMenu UsuarioMenu;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox chkAleman;
    private javax.swing.JCheckBox chkAleman1;
    private javax.swing.JCheckBox chkAleman2;
    private javax.swing.JCheckBox chkEspanyol;
    private javax.swing.JCheckBox chkEspanyol1;
    private javax.swing.JCheckBox chkEspanyol2;
    private javax.swing.JCheckBox chkFrances;
    private javax.swing.JCheckBox chkFrances1;
    private javax.swing.JCheckBox chkFrances2;
    private javax.swing.JCheckBox chkIngles;
    private javax.swing.JCheckBox chkIngles1;
    private javax.swing.JCheckBox chkIngles2;
    private javax.swing.JLabel etiAgonia;
    private javax.swing.JLabel etiArmadura;
    private javax.swing.JLabel etiBusqyeda;
    private javax.swing.JLabel etiClase;
    private javax.swing.JLabel etiCuenta;
    private javax.swing.JLabel etiDanyoCondicion;
    private javax.swing.JLabel etiDanyoCritico;
    private javax.swing.JLabel etiDuracionBendicion;
    private javax.swing.JLabel etiDuracionCondicion;
    private javax.swing.JLabel etiDureza;
    private javax.swing.JLabel etiFerocidad;
    private javax.swing.JLabel etiIdioma;
    private javax.swing.JLabel etiIdiomas;
    private javax.swing.JLabel etiNomPj;
    private javax.swing.JLabel etiPoder;
    private javax.swing.JLabel etiPoderCuracion;
    private javax.swing.JLabel etiPrecision;
    private javax.swing.JLabel etiProbabilidadCritica;
    private javax.swing.JLabel etiSalud;
    private javax.swing.JLabel etiServidor;
    private javax.swing.JLabel etiVitalidad;
    private javax.swing.JLabel fondoBusqueda;
    private javax.swing.JLabel fondoInformacion;
    private javax.swing.JLabel fondotable;
    private javax.swing.ButtonGroup grupoBuscador;
    private javax.swing.JLabel icoCabeza;
    private javax.swing.JLabel icoEspaldar;
    private javax.swing.JLabel icoHombros;
    private javax.swing.JLabel icoManos;
    private javax.swing.JLabel icoPecho;
    private javax.swing.JLabel icoPiernas;
    private javax.swing.JLabel icoPies;
    private javax.swing.JLabel icoSetArma1;
    private javax.swing.JLabel icoSetArma2;
    private javax.swing.JMenuItem itemAcerca;
    private javax.swing.JMenuItem itemCerrarUsuario;
    private javax.swing.JMenuItem itemModificarDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel mostrarAgonia;
    private javax.swing.JLabel mostrarArmadura;
    private javax.swing.JLabel mostrarClase;
    private javax.swing.JLabel mostrarDanyoCondicion;
    private javax.swing.JLabel mostrarDanyoCritico;
    private javax.swing.JLabel mostrarDuracionBendicion;
    private javax.swing.JLabel mostrarDuracionCondicion;
    private javax.swing.JLabel mostrarDureza;
    private javax.swing.JLabel mostrarFerocidad;
    private javax.swing.JLabel mostrarIdiomas;
    private javax.swing.JLabel mostrarNombreCuenta;
    private javax.swing.JLabel mostrarNombrePersonaje;
    private javax.swing.JLabel mostrarPoder;
    private javax.swing.JLabel mostrarPoderCuracion;
    private javax.swing.JLabel mostrarPrecision;
    private javax.swing.JLabel mostrarProbabilidadCritica;
    private javax.swing.JLabel mostrarSalud;
    private javax.swing.JLabel mostrarServidor;
    private javax.swing.JLabel mostrarVitalidad;
    private javax.swing.JRadioButton radClan;
    private javax.swing.JRadioButton radCuenta;
    private javax.swing.JRadioButton radPersonaje;
    private javax.swing.JTextField txtAgoniaMinima;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
