
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
        } else if(slot == 1 || slot == 3 || slot == 4){//guantes, botas, hombreras
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
        }else if (slot == 5){
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
        }
        return 0;
    }//fin stat
    
}
