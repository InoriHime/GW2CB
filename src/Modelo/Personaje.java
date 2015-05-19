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
    
    int poder;
    int precision; 
    int dureza;
    int vitalidad; 
            
    int duraBendicion, danyoCondicion, duraCondicion, ferocidad, pCuracion;
    int armadura, probCritica, danyoCritico, salud, rAgonia;

    public Personaje() {
        this.poder=926;
        this.precision=926; 
        this.dureza=926;
        this.vitalidad=926; 
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
        int pod=0; 
        int prec=0; 
        int dur=0;
        int vit=0;
        int dancond=0;
        int fero=0;
        int probcritic=4;
        int pcuracion=0;
        int dancritic=150;
        int saludbase=0;
        int ar=0;
        int defensa=0;
        for(Arma a:armas){
            pod+=a.getPoder();
            prec+=a.getPrecision();
            dur+=a.getDureza();
            vit+=a.getVitalidad();
            dancond+=a.getdCondicion();
            fero+=a.getFerocidad();
            pcuracion+=a.getpCuracion();
            ar+=a.calcAgonia();
        }
        for(Armadura a:armaduras){
            pod+=a.getPoder();
            prec+=a.getPrecision();
            dur+=a.getDureza();
            vit+=a.getVitalidad();
            dancond+=a.getdCondicion();
            fero+=a.getFerocidad();
            pcuracion+=a.getpCuracion();
            ar+=a.calcAgonia();
            defensa+=a.getDefensa();
        }
        
        if(this.getClase().equals("Guerrero") || this.getClase().equals("Nigromante")){
            saludbase=9212;
        }else if(this.getClase().equals("Ingeniero") || this.getClase().equals("Guardabosques")||
                this.getClase().equals("Hipnotizador")){
            saludbase=5922;
        }else{
            saludbase=1645;
        }
        
        
        this.poder=this.poder=pod;
        this.precision=this.precision=prec;
        this.dureza=this.dureza=dur;
        this.vitalidad=this.vitalidad=vit;
        this.danyoCondicion=dancond;
        this.ferocidad=fero;
        this.pCuracion=pcuracion;
        this.rAgonia=ar;
        this.duraBendicion=0;
        this.duraCondicion=0;
        this.armadura=this.dureza+defensa;
        this.probCritica=probcritic+((int)this.precision/21);
        this.danyoCritico=dancritic+((int)this.ferocidad/15);
        this.salud=saludbase+(this.vitalidad*10);
        
    }

}
