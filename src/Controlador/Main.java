package Controlador;

import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        //ejecuta el controlador y este la vista
        new ControladorPrincipal(new VentanaPrincipal()).iniciar() ;
    }
}
