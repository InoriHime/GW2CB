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

    Personaje personajeSeleccionado = new Personaje();
    
    
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
        
        this.vista.icoCabeza.setName("Cabeza");
        this.vista.icoCabeza.addMouseListener(this);
        
        
        
        //armas
        this.vista.icoArmaPSet1.setName("ArmaPSet1");
        this.vista.icoArmaPSet1.addMouseListener(this);

  
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
            mostrarImagenes(personaje);
            personajeSeleccionado.setArmas(equiparArmas(personaje));
            personajeSeleccionado.setArmaduras(equiparArmaduras(personaje));
            
            break;
    }
    }

   
    
    
    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
       ArrayList<Arma> armas  = personajeSeleccionado.getArmas();
       ArrayList<Armadura> armaduras  = personajeSeleccionado.getArmaduras();
       
    switch(e.getComponent().getName()){
        case "ArmaPSet1":

            for(Arma arma:armas){

                if(arma.getSlot()==1){
                    
                }
            }
            break;
    }
    
    
    }

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
    public ArrayList<Arma> equiparArmas(String personaje){
        
        return this.modelo.setArmas(personaje);
        
    }
    
    public ArrayList<Armadura> equiparArmaduras(String personaje){
        return this.modelo.setArmaduras(personaje);
    }
    
    
     public void mostrarImagenes(String personaje){
            if(this.modelo.piezaEquipada(personaje, 1)==1){
                this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpies.png"));
            }else{
                this.vista.icoPies.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/botas.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 2)==1){
                this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpiernas.png"));
            }else{
                this.vista.icoPiernas.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/pantalon.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 3)==1){
                this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tguantes.png"));
            }else{
                this.vista.icoManos.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/guantes.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 4)==1){
                this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tpecho.png"));
            }else{
                this.vista.icoPecho.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/pecho.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 5)==1){
                this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Thombros.png"));
            }else{
                this.vista.icoHombros.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/hombreras.jpg"));
            }

            if(this.modelo.piezaEquipada(personaje, 6)==1){
                this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tcabeza.png"));
            }else{
                this.vista.icoCabeza.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/cabeza.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 7)==1){
                this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Taccesorio1.png"));
            }else{
                this.vista.icoAccesorio1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/accesorio1.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 8)==1){
                this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Taccesorio2.png"));
            }else{
                this.vista.icoAccesorio2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/accesorio2.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 9)==1){
                this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tanillo1.png"));
            }else{
                this.vista.icoAnillo1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/anillo1.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 10)==1){
                this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tanillo2.png"));
            }else{
                this.vista.icoAnillo2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/anillo2.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 11)==1){
                this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tespaldar.png"));
            }else{
                this.vista.icoEspaldar.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/espaldar.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 12)==1){
                this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tamuleto.png"));
            }else{
                this.vista.icoAmuleto.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/amuleto.jpg"));
            }
            if(this.modelo.piezaEquipada(personaje, 13)==1){
                this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/Armaduras/Tacuacabeza.png"));
            }else{
                this.vista.icoCabezaAcu.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuacabeza.png"));
            }
            if(this.modelo.armaEquipada(personaje, 1)!=0){
                this.vista.icoArmaPSet1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 1)+".png"));
            }else{
                this.vista.icoArmaPSet1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaPSet1.png"));
            }

            if(this.modelo.armaEquipada(personaje, 2)!=0){
                this.vista.icoArmaSSet1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 2)+".png"));
            }else{
                this.vista.icoArmaSSet1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaSSet1.png"));
            }

            if(this.modelo.armaEquipada(personaje, 4)!=0){
                this.vista.icoArmaPSet2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 4)+".png"));
            }else{
                this.vista.icoArmaPSet2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaPSet2.png"));
            }

            if(this.modelo.armaEquipada(personaje, 5)!=0){
                this.vista.icoArmaSSet2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 5)+".png"));
            }else{
                this.vista.icoArmaSSet2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/ArmaSSet2.png"));
            }

            if(this.modelo.armaEquipada(personaje, 3)!=0){
                this.vista.icoArmaAcu1.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 3)+"1.png"));
            }else{
                this.vista.icoArmaAcu1.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuaarma1.png"));
            }

            if(this.modelo.armaEquipada(personaje, 6)!=0){
                this.vista.icoArmaAcu2.setIcon(new ImageIcon("src/Vista/Imagenes/Armas/"+this.modelo.armaEquipada(personaje, 6)+"2.png"));
            }else{
                this.vista.icoArmaAcu2.setIcon(new ImageIcon("src/Vista/Imagenes/ArmadurasV/acuaarma2.png"));
            }
    }
}
