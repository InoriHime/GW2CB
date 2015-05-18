package Controlador;

/* Importamos el modelo y la interfaz*/
import Modelo.Cuenta;
import Modelo.ModeloPrincipal;
import Modelo.Personaje;
import Vista.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ControladorPrincipal implements ActionListener, MouseListener{
    /** instancia a nuestra interfaz de usuario*/
    VentanaPrincipal vista;
    /** instancia a nuestro modelo */
    ModeloPrincipal modelo = new ModeloPrincipal();
    //Usuario de sesion
    Cuenta usuario;
    //Array para almacenar temporalmente los datos de usuario con el fin de pasarlos como parametro en el constructur del usuario
    Object[] datosUsuario = new Object[9];
    //Almacenamiento del nombre de usuario de sesion pasado como parametro en el contructor
    String usu;
    //Array de personajes
    ArrayList <Personaje> personajes = new ArrayList<>();
    //Array de nombres de personajes para mostrar
    ArrayList<String> nomPjs = new ArrayList<>();

    
    
    /** Se declaran en un ENUM las acciones que se realizan desde la
     * interfaz de usuario VISTA y posterior ejecución desde el controlador
     */
    
    public enum AccionMVC{
        __MOSTRAR_ICONOS_EQUIPO,
        __EDITAR_PERSONAJE;
    }
     
     /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public ControladorPrincipal(String idusuario, VentanaPrincipal vista ){
        this.vista = vista;
        this.usu=idusuario;
    }
    
     /** Inicia el skin y las diferentes variables que se utilizan */
    public void iniciar(){
        
        // Skin tipo WINDOWS
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
            this.vista.setLocationRelativeTo(null);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        // Mostramos datos en la tabla
        this.vista.TablaPersonajes.setModel(this.modelo.getTablaPersonaje());
        //Definimos la apariencia de la tabla
        this.vista.TablaPersonajes.setRowSelectionAllowed(true);
        this.vista.PanelTabla.getViewport().setBorder(null);
        this.vista.TablaPersonajes.setSelectionBackground(new Color(27, 23, 20, 159));
        this.vista.TablaPersonajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.vista.txtBusqueda.requestFocus(true);
        
        //Recogemos los datos del usuario a partir del nombre de cuenta recibido en el constructor
        datosUsuario=this.modelo.getDatosCuenta(usu);
        usuario = new Cuenta(String.valueOf(datosUsuario[0]),String.valueOf(datosUsuario[1]), String.valueOf(datosUsuario[2]), 
                (int)datosUsuario[3],  (int)datosUsuario[4], (int)datosUsuario[5], (int)datosUsuario[6], (int)datosUsuario[7], (int)datosUsuario[8]);
        //Mostramos los datos de usuario en la interfaz
        this.vista.usuNivelFractalActual.setValue(usuario.getNivelFrac());
        this.vista.mostrarUsuario.setText(usuario.getNombreCuenta());
        //Rellenamos el array de personajes
        personajes = this.modelo.getPersonajesCuenta(usuario.getNombreCuenta());
        //Rellenamos el array de nombre de personajes para mostrar
        for(Personaje p:personajes){
            nomPjs.add(p.getNombre());
        }
        //Cargamos los nombres de personaje en el combo box de los personajes del usuario
        this.vista.cbPersonaje.setModel(new DefaultComboBoxModel(nomPjs.toArray()));
        
        this.vista.TablaPersonajes.setName("Tabla");
        this.vista.TablaPersonajes.addMouseListener(this);
        this.vista.btnModPj.setActionCommand("__EDITAR_PERSONAJE");
        this.vista.btnModPj.addActionListener(this);
  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(AccionMVC.valueOf(e.getActionCommand())) {
            case __EDITAR_PERSONAJE:
                String npj;
                npj = String.valueOf(this.vista.cbPersonaje.getSelectedItem());
                new ControladorEditarPersonaje(npj, this.vista.dialogoModificarPersonaje).iniciar();
            break;
        }
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
    int fila;
    String personaje;
    switch(e.getComponent().getName()){
        case "Tabla":
            fila = this.vista.TablaPersonajes.getSelectedRow();
            personaje = String.valueOf(this.vista.TablaPersonajes.getValueAt(fila, 0));
            if(this.modelo.piezaEquipada(personaje, 1)==1){
                this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/Tpies.png"));
            }else{
                this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/botas.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 2)==1){
                this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/Tpiernas.png"));
            }else{
                this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/pantalon.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 3)==1){
                this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/Tguantes.png"));
            }else{
                this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/guantes.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 4)==1){
                this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/Tpecho.png"));
            }else{
                this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/pecho.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 5)==1){
                this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/Thombros.png"));
            }else{
                this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/hombreras.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 6)==1){
                this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/Tcabeza.png"));
            }else{
                this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/cabeza.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 7)==1){
                this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/Taccesorio1.png"));
            }else{
                this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/accesorio1.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 8)==1){
                this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/Taccesorio2.png"));
            }else{
                this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/accesorio2.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 9)==1){
                this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/Tanillo1.png"));
            }else{
                this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/anillo1.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 10)==1){
                this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/Tanillo2.png"));
            }else{
                this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/anillo2.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 11)==1){
                this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/Tespaldar.png"));
            }else{
                this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/espaldar.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 12)==1){
                this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/Tamuleto.png"));
            }else{
                this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/amuleto.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 13)==1){
                this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/Tacuacabeza.png"));
            }else{
                this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/acuacabeza.png"));
            }
            
            break;
    }
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
}
