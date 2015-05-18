package Modelo;

import java.util.ArrayList;

public class Personaje {

    String nombre;
    String cuenta;
    int raza;
    int clase;
    ArrayList<Arma> armas;
    ArrayList<Armadura> armaduras;

    public Personaje() {

    }

    public ArrayList<Arma> getArmas() {
        return this.armas;
    }
    
    public ArrayList<Armadura> getArmaduras(){
        return this.armaduras;
    }
    
    public void setArmaduras(ArrayList<Armadura> armaduras){
        this.armaduras=armaduras;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

}
