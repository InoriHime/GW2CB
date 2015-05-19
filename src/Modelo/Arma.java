
package Modelo;

public class Arma {

    private int poder, dureza, vitalidad, precision, ferocidad, dCondicion, pCuracion;
    private int rareza;
    private int infS1, infS2;
    private int tipo;
    private int slot;
    private int[] fuerza = new int[2];

    public Arma(int slot, int tipo, int rareza, int poder, int dureza, int vitalidad, int precision, int ferocidad, int dCondicion, int pCuracion, int infS1, int infS2) {
        this.tipo = tipo;
        this.slot = slot;
        this.poder = poder;
        this.dureza = dureza;
        this.vitalidad = vitalidad;
        this.precision = precision;
        this.ferocidad = ferocidad;
        this.dCondicion = dCondicion;
        this.pCuracion = pCuracion;
        this.rareza = rareza;
        this.infS1 = infS1;
        this.infS2 = infS2;
        this.setFuerza();
    }
    
    public String getFuerza(){
        return fuerza[0]+"-"+fuerza[1];
    }
    
    public void setFuerza(){
        //1 mano 1, 2, 3, 7, 9, 10, 12, 14, 15, 16
        //2 mano 4, 5, 6, 8, 11, 13, 17, 18, 19
        if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 7 || tipo == 9 || tipo == 10 || tipo == 12 || tipo == 14 || tipo == 15 || tipo == 16) {//1 mano
            if (this.rareza == 1) {//exótico
                this.fuerza[0]=905;
                this.fuerza[1]=1000;
            } else {//ascendido
                this.fuerza[0]=950;
                this.fuerza[1]=1050;
            }
        } else {//2 manos
            if (this.rareza == 1) {//exótico
                this.fuerza[0]=920;
                this.fuerza[1]=1080;
            } else {//ascendido
                this.fuerza[0]=966;
                this.fuerza[1]=1134;
            }
        }
    }
    
    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getTipo() {
        switch (this.tipo) {
            case 1:
                return "Hacha";

            case 2:
                return "Daga";

            case 3:
                return "Foco";

            case 4:
                return "Mandoble";
            case 5:
                return "Martillo";

            case 6:
                return "Arco largo";
            case 7:
                return "Espada";

            case 8:
                return "Arco corto";

            case 9:
                return "Maza";

            case 10:
                return "Pistola";

            case 11:
                return "Rifle";

            case 12:
                return "Cetro";

            case 13:
                return "Báculo";

            case 14:
                return "Antorcha";

            case 15:
                return "Cuerno de guerra";

            case 16:
                return "Escudo";

            case 17:
                return "Lanza";

            case 18:
                return "Cañón de arpón";
            case 19:
                return "Tridente";

        }
        return null;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return stat(this.poder);
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDureza() {
        return stat(this.dureza);
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getVitalidad() {
        return stat(this.vitalidad);
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getPrecision() {
        return stat(this.precision);
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getFerocidad() {
        return stat(this.ferocidad);
    }

    public void setFerocidad(int ferocidad) {
        this.ferocidad = ferocidad;
    }

    public int getdCondicion() {
        return stat(this.dCondicion);
    }

    public void setdCondicion(int dCondicion) {
        this.dCondicion = dCondicion;
    }

    public int getpCuracion() {
        return stat(this.pCuracion);
    }

    public void setpCuracion(int pCuracion) {
        this.pCuracion = pCuracion;
    }

    public String getRareza() {

        if (this.rareza == 1) {
            return "Exótico";
        } else {
            return "Ascendido";
        }
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public int getInfS1() {
        return infS1;
    }

    public void setInfS1(int infS1) {
        this.infS1 = infS1;
    }

    public int getInfS2() {
        return infS2;
    }

    public void setInfS2(int infS2) {
        this.infS2 = infS2;
    }

    public int stat(int stat) {
        //1 mano 1, 2, 3, 7, 9, 10, 12, 14, 15, 16
        //2 mano 4, 5, 6, 8, 11, 13, 17, 18, 19
        if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 7 || tipo == 9 || tipo == 10 || tipo == 12 || tipo == 14 || tipo == 15 || tipo == 16) {//1 mano
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 64;
                } else if (stat == 2) {//principal
                    return 90;
                } else if (stat == 3) {//celestial
                    return 42;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 67;
                } else if (stat == 2) {//principal
                    return 94;
                } else if (stat == 3) {//celestial
                    return 44;
                } else {
                    return 0;
                }
            }
        } else {//2 manos
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 128;
                } else if (stat == 2) {//principal
                    return 179;
                } else if (stat == 3) {//celestial
                    return 84;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 134;
                } else if (stat == 2) {//principal
                    return 188;
                } else if (stat == 3) {//celestial
                    return 89;
                } else {
                    return 0;
                }
            }
        }
    }//fin stat

    public int calcAgonia(){
        return this.infS1*5+this.infS2*5;
    }
    
    @Override
    public String toString() {
        return "Arma{" + "poder=" + getPoder() + ", dureza=" + getDureza() + ", vitalidad=" + getVitalidad() + ", precision=" + getPrecision() + ", ferocidad=" + getFerocidad() + ", dCondicion=" + getdCondicion() + ", pCuracion=" + getpCuracion() + ", rareza=" + getRareza() + ", infS1=" + infS1 + ", infS2=" + infS2 + ", tipo=" + getTipo() + ", slot=" + slot +", agonia = "+calcAgonia()+'}';
    }

    
    
}
