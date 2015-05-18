package Modelo;

public class Armadura {

    private int slot;
    private int rareza;
    private int poder, dureza, vitalidad, precision, ferocidad, dCondicion, pCuracion;
    private int infS, infA;

    public Armadura(int slot, int rareza, int poder, int dureza, int vitalidad, int precision, int ferocidad, int dCondicion, int pCuracion, int infS, int infA) {
        this.slot = slot;
        this.rareza = rareza;
        this.poder = poder;
        this.dureza = dureza;
        this.vitalidad = vitalidad;
        this.precision = precision;
        this.ferocidad = ferocidad;
        this.dCondicion = dCondicion;
        this.pCuracion = pCuracion;
        this.infS = infS;
        this.infA = infA;
    }

    public String getSlot() {
        switch (this.slot) {
            case 1:
                return "Botas";

            case 2:
                return "Pantalones";

            case 3:
                return "Guantes";

            case 4:
                return "Hombros";
            case 5:
                return "Pecho";

            case 6:
                return "Cabeza";
            case 7:
                return "Accesorio 1";

            case 8:
                return "Accesorio 2";

            case 9:
                return "Anillo 1";

            case 10:
                return "Anillo 2";

            case 11:
                return "Espalda";

            case 12:
                return "Amuleto";

            case 13:
                return "Casco acuático";

        }
        return null;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
    
    public void setRareza(int rareza){
        this.rareza=rareza;
    }
    
    public String getRareza(){
        if (this.rareza == 1) {
            return "Exótico";
        } else {
            return "Ascendido";
        }
    }

    public int stat(int stat) {
        //Cascos 6, 13
        //Hombreras, guantes, botas 1, 3, 4
        //Pecho 5
        //Pantalon 2
        //Amuleto 12
        //Anillos 9, 10
        //Accesorios 7, 8
        //Espaldar 11
        if (slot == 6 || slot == 13) {//Cascos
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 32;
                } else if (stat == 2) {//principal
                    return 45;
                } else if (stat == 3) {//celestial
                    return 21;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 34;
                } else if (stat == 2) {//principal
                    return 47;
                } else if (stat == 3) {//celestial
                    return 22;
                } else {
                    return 0;
                }
            }
        } else if (slot == 1 || slot == 3 || slot == 4) {//guantes, botas, hombreras
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 24;
                } else if (stat == 2) {//principal
                    return 34;
                } else if (stat == 3) {//celestial
                    return 16;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 25;
                } else if (stat == 2) {//principal
                    return 35;
                } else if (stat == 3) {//celestial
                    return 17;
                } else {
                    return 0;
                }
            }
        } else if (slot == 5) {//pecho
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 72;
                } else if (stat == 2) {//principal
                    return 101;
                } else if (stat == 3) {//celestial
                    return 47;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 76;
                } else if (stat == 2) {//principal
                    return 106;
                } else if (stat == 3) {//celestial
                    return 50;
                } else {
                    return 0;
                }
            }
        } else if (slot == 2) {//pantalon
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 48;
                } else if (stat == 2) {//principal
                    return 67;
                } else if (stat == 3) {//celestial
                    return 32;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 50;
                } else if (stat == 2) {//principal
                    return 71;
                } else if (stat == 3) {//celestial
                    return 33;
                } else {
                    return 0;
                }
            }
        } else if (slot == 12) {//amuleto
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
                    return 85;
                } else if (stat == 2) {//principal
                    return 126;
                } else if (stat == 3) {//celestial
                    return 57;
                } else {
                    return 0;
                }
            }
        } else if (slot == 9 || slot == 10) {//anillos
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 48;
                } else if (stat == 2) {//principal
                    return 67;
                } else if (stat == 3) {//celestial
                    return 32;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 68;
                } else if (stat == 2) {//principal
                    return 103;
                } else if (stat == 3) {//celestial
                    return 46;
                } else {
                    return 0;
                }
            }
        } else if (slot == 7 || slot == 8) {//accesorios
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 40;
                } else if (stat == 2) {//principal
                    return 56;
                } else if (stat == 3) {//celestial
                    return 26;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 60;
                } else if (stat == 2) {//principal
                    return 91;
                } else if (stat == 3) {//celestial
                    return 41;
                } else {
                    return 0;
                }
            }
        }else if (slot == 11) {//espaldar
            if (this.rareza == 1) {//exótico
                if (stat == 1) {//secundario
                    return 16;
                } else if (stat == 2) {//principal
                    return 22;
                } else if (stat == 3) {//celestial
                    return 11;
                } else {
                    return 0;
                }
            } else {//ascendido
                if (stat == 1) {//secundario
                    return 35;
                } else if (stat == 2) {//principal
                    return 56;
                } else if (stat == 3) {//celestial
                    return 25;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }//fin stat
    
    public int calcAgonia(){
        return this.infS*5+this.infA;
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
    
    public int getInfS() {
        return infS;
    }
    
    public void setInfS(int infS) {
        this.infS = infS;
    }
    
    public int getInfA() {
        return infA;
    }

    public void setInfA(int infA) {
        this.infA = infA;
    }

}
