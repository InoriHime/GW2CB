package Controlador;

import Vista.Login;

public class Main {
    public static void main(String[] args) {
        //ejecuta el controlador y este la vista
        new ControladorLogin(new Login()).iniciar();
    }
}
