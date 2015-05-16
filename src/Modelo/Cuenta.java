package Modelo;

public class Cuenta {
    String nombreCuenta;
    String email;
    String contrasenya;
    int nivelFrac;
    int servidor;
    int[] idiomas = {0,0,0,0};
    
    public Cuenta(String nombreCuenta, String email, String contrasenya,  int nivelFrac, int servidor,
                    int idiomaIng,  int idiomaEsp, int idiomaFra, int idiomaAle){
        this.nombreCuenta=nombreCuenta;
        this.email=email;
        this.contrasenya=contrasenya;
        this.nivelFrac=nivelFrac;
        this.servidor=servidor;
        idiomas[0]=idiomaIng;
        idiomas[1]=idiomaEsp;
        idiomas[2]=idiomaFra;
        idiomas[3]=idiomaAle;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getNivelFrac() {
        return nivelFrac;
    }

    public void setNivelFrac(int nivelFrac) {
        this.nivelFrac = nivelFrac;
    }

    public int getServidor() {
        return servidor;
    }

    public void setServidor(int servidor) {
        this.servidor = servidor;
    }

    public int[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int[] idiomas) {
        this.idiomas = idiomas;
    }
//    
    
}
