package Modelo;

import java.util.ArrayList;

public class Personaje {

    String nombre;
    String cuenta;
    String raza;
    String clase;
    String servidor;
    String idiomas;
    ArrayList<Arma> armas;
    ArrayList<Armadura> armaduras;
    
    int poder, precision, dureza, vitalidad, duraBendicion, danyoCondicion, duraCondicion, ferocidad, pCuracion;
    int armadura, probCritica, danyoCritico, salud, rAgonia;

    public Personaje() {

    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getDuraBendicion() {
        return duraBendicion;
    }

    public void setDuraBendicion(int duraBendicion) {
        this.duraBendicion = duraBendicion;
    }

    public int getDanyoCondicion() {
        return danyoCondicion;
    }

    public void setDanyoCondicion(int danyoCondicion) {
        this.danyoCondicion = danyoCondicion;
    }

    public int getDuraCondicion() {
        return duraCondicion;
    }

    public void setDuraCondicion(int duraCondicion) {
        this.duraCondicion = duraCondicion;
    }

    public int getFerocidad() {
        return ferocidad;
    }

    public void setFerocidad(int ferocidad) {
        this.ferocidad = ferocidad;
    }

    public int getpCuracion() {
        return pCuracion;
    }

    public void setpCuracion(int pCuracion) {
        this.pCuracion = pCuracion;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getProbCritica() {
        return probCritica;
    }

    public void setProbCritica(int probCritica) {
        this.probCritica = probCritica;
    }

    public int getDanyoCritico() {
        return danyoCritico;
    }

    public void setDanyoCritico(int danyoCritico) {
        this.danyoCritico = danyoCritico;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getrAgonia() {
        return rAgonia;
    }

    public void setrAgonia(int rAgonia) {
        this.rAgonia = rAgonia;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    public void calcularStats(){
        
    }

}
