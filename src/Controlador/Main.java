package Controlador;

import Vista.Login;
import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        //ejecuta el controlador y este la vista
        new ControladorLogin(new Login()).iniciar();
        //new ControladorPrincipal(new VentanaPrincipal()).iniciar();
    }
}
