package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ModeloPrincipal extends Database {

    Database db = null;
    /*Constructor de la clase*/

    public ModeloPrincipal() {
        db = new Database();
    }

    /**
     * Obtiene registros de la tabla Personajes y los devuelve en un
     * DefaultTableModel
     */
    public DefaultTableModel getTablaPersonaje() {
        DefaultTableModel tablemodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        int registros = 0;
        String[] columNames = {"Personaje", "Cuenta", "Clase", "Niv.Frac", "R.Agonía", "Clan", "Idiomas"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos

        Statement stmt = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        Statement stmt3 = null;
        try {

            stmt = db.getConexion().createStatement();
            stmt1 = db.getConexion().createStatement();
            stmt2 = db.getConexion().createStatement();
            stmt3 = db.getConexion().createStatement();
            ResultSet res = stmt.executeQuery("SELECT count(*) as total FROM Personajes");
            res.next();
            registros = res.getInt("total");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][7];
        try {
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"

            //Recogemos los datos a mostrar de personajes y el nombre de sus clases
            ResultSet res = stmt.executeQuery("SELECT NomPj,Cuenta,NomClase, Clase FROM Personajes, Clases WHERE ID_Clase=Clase");
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("NomPj");
                data[i][1] = res.getString("Cuenta");
                data[i][2] = res.getString("NomClase");
                ResultSet res1 = stmt1.executeQuery("SELECT NivFractales,IdiomaIngles,IdiomaEspañol,IdiomaFrances,IdiomaAleman FROM Cuentas WHERE NomCuenta='" + data[i][1] + "'");
                res1.next();
                data[i][3] = res1.getString("Nivfractales");

                String cad = "";
                if (res1.getBoolean("IdiomaIngles")) {
                    cad = cad.concat("[EN]");
                }
                if (res1.getBoolean("IdiomaEspañol")) {
                    cad = cad.concat("[ES]");
                }
                if (res1.getBoolean("IdiomaFrances")) {
                    cad = cad.concat("[FR]");
                }
                if (res1.getBoolean("IdiomaAleman")) {
                    cad = cad.concat("[GER]");
                }
                data[i][6] = cad;

                ResultSet res3 = stmt3.executeQuery("SELECT getAgonia('" + data[i][0] + "') as Agonia");
                res3.next();

                data[i][4] = res3.getString("Agonia");
                if (data[i][4] == null) {
                    data[i][4] = "0";
                }

                try {
                    ResultSet res2 = stmt2.executeQuery("SELECT Clan FROM Clan_Cuenta WHERE Cuenta='" + data[i][1] + "'");
                    res2.next();
                    data[i][5] = res2.getString("Clan");
                    res2.close();
                } catch (Exception e) {
                    data[i][5] = "-";
                }

                i++;

            }
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return tablemodel;
    }

    //Devuelve los datos principales de la cuenta de la que se pasa el nombre por parámetro
    public Object[] getDatosCuenta(String cuenta) {
        Object[] datosCuenta = new Object[9];
        Statement stmt = null;
        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT * FROM Cuentas WHERE NomCuenta ='" + cuenta + "'");
            res.next();
            datosCuenta[0] = res.getString("NomCuenta");
            datosCuenta[1] = res.getString("Email");
            datosCuenta[2] = res.getString("Contraseña");
            datosCuenta[3] = res.getInt("NivFractales");
            datosCuenta[4] = res.getInt("Servidor");
            datosCuenta[5] = res.getInt("IdiomaIngles");
            datosCuenta[6] = res.getInt("IdiomaEspañol");
            datosCuenta[7] = res.getInt("IdiomaFrances");
            datosCuenta[8] = res.getInt("IdiomaAleman");

            return datosCuenta;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Devuelve los datos principales del personaje del que se pasa el nombre por parámetro
    public Object[] getDatosPersonaje(String nompj) {
        Object[] datosPersonaje = new Object[3];
        Statement stmt = null;
        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT Cuenta, Raza, Clase FROM Personajes WHERE NomPj ='" + nompj + "'");
            res.next();
            datosPersonaje[0] = res.getString("Cuenta");
            datosPersonaje[1] = res.getInt("Raza");
            datosPersonaje[2] = res.getInt("Clase");

            return datosPersonaje;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Devuelve los datos de los personajes de la cuenta que se pasa por parametro
    public ArrayList<Personaje> getPersonajesCuenta(String cuenta) {
        ArrayList<Personaje> personajes = new ArrayList<>();
        Personaje p;
        Statement stmt = null;
        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT * FROM Personajes WHERE Cuenta ='" + cuenta + "'");
            while (res.next()) {
                p = new Personaje();
                p.setNombre(res.getString("NomPj"));
                p.setCuenta(res.getString("Cuenta"));

                personajes.add(p);
            }

            return personajes;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Cambia los iconos de la derecha con los items equipados al pasarle por parámetro un nombre de personaje
    public int piezaEquipada(String personaje, int slot) {
        Statement stmt = null;
        int tiene;
        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT count(*) as Tiene FROM Pj_Armaduras WHERE NomPj ='" + personaje + "' AND SlotArmadura=" + slot);
            res.next();
            tiene = res.getInt("Tiene");
            return tiene;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    //Devuelve el tipo de arma deñl pj y slop pasados por parametro
    public int armaEquipada(String personaje, int slot) {
        Statement stmt = null;
        int tipo;
        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("SELECT TipoArma as Tipo FROM Pj_Armas WHERE NomPj ='" + personaje + "' AND SlotArma=" + slot);
            res.next();
            tipo = res.getInt("Tipo");
            return tipo;

        } catch (SQLException ex) {
            return 0;
        }
    }

    public ArrayList<Arma> setArmas(String personaje) {
        ArrayList<Arma> armas = new ArrayList<Arma>();
        Statement stmt = null;

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select SlotArma,TipoArma, Rareza, Poder, Dureza, Vitalidad, M.`Precision`, Ferocidad, DañoCondicion, PoderCuracion, InfSimple1, InfSimple2 \n"
                    + "from Pj_Armas as PJ, Modificadores as M \n"
                    + "WHERE M.ID_Mod = PJ.Modificador AND PJ.NomPj = '" + personaje + "'");
            while (res.next()) {
                armas.add(new Arma(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getInt(5), res.getInt(6), res.getInt(7), res.getInt(8), res.getInt(9), res.getInt(10), res.getInt(11), res.getInt(12)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return armas;

    }

    public ArrayList<Armadura> setArmaduras(String personaje) {
        ArrayList<Armadura> armaduras = new ArrayList<>();
        Statement stmt = null;

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select SlotArmadura, Rareza, Poder, Dureza, Vitalidad, M.`Precision`, Ferocidad, DañoCondicion, PoderCuracion, InfSimple, InfAgonia\n"
                    + "from Pj_Armaduras as PJ, Modificadores as M WHERE M.ID_Mod = PJ.Modificador AND PJ.NomPj = '" + personaje + "'");
            while (res.next()) {
                armaduras.add(new Armadura(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getInt(5), res.getInt(6), res.getInt(7), res.getInt(8), res.getInt(9), res.getInt(10), res.getInt(11)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return armaduras;

    }

    public String getNombreServidor(int serv) {
        Statement stmt = null;

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select NomServidor FROM Servidores  WHERE Id_Servidor = '" + serv + "'");
            res.next();
            return res.getString("NomServidor");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getNombreClase(int clase) {
        Statement stmt = null;

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select NomClase FROM Clases  WHERE ID_Clase = '" + clase + "'");
            res.next();
            return res.getString("NomClase");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getNombreRaza(int raza) {
        Statement stmt = null;

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select NomRaza FROM Razas  WHERE ID_Raza = '" + raza + "'");
            res.next();
            return res.getString("NomRaza");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getIdiomas(String pj) {
        Statement stmt = null;
        String cad = "";

        try {
            stmt = db.getConexion().createStatement();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ResultSet res;
        try {
            res = stmt.executeQuery("Select IdiomaIngles, IdiomaEspañol, IdiomaFrances, IdiomaAleman "
                    + "FROM Cuentas C, Personajes P WHERE NomPj = '" + pj + "' AND C.NomCuenta = P.Cuenta");
            res.next();
            if (res.getBoolean("IdiomaIngles")) {
                cad = cad.concat("[EN]");
            }
            if (res.getBoolean("IdiomaEspañol")) {
                cad = cad.concat("[ES]");
            }
            if (res.getBoolean("IdiomaFrances")) {
                cad = cad.concat("[FR]");
            }
            if (res.getBoolean("IdiomaAleman")) {
                cad = cad.concat("[GER]");
            }

            return cad;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel busqueda(String c_usu, String busqueda, boolean personaje, boolean cuenta, boolean clan, String agonia,
            String fractales, boolean soloclan, boolean guardian, boolean guerrero, boolean elementalista,
            boolean nigromante, boolean guardabosques, boolean ladron, boolean ingeniero,
            boolean hipnotizador, boolean ingles, boolean espanyol, boolean frances, boolean aleman) {
        DefaultTableModel tablemodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        String cl = "";
        String pj = "";
        String cu = "";
        String clases = "";
        String idiomas = "";
        String s_clan = "";
        boolean primero = true;
        boolean[] classB = {guerrero, ingeniero, nigromante, ladron, elementalista, guardabosques, hipnotizador, guardian};
        boolean[] idiom = {ingles, espanyol, frances, aleman};
        if (clan) {
            cl = busqueda;
        } else if (cuenta) {
            cu = busqueda;
        } else {
            pj = busqueda;
        }

        for (int i = 0; i < 8; i++) {
            if (classB[i]) {
                if (primero) {
                    clases += "Cl.ID_Clase = " + (i+1);
                    primero = false;
                } else {
                    clases += " OR Cl.ID_Clase = " + (i+1);
                }
            }
        }
        primero = true;
        for (int i = 0; i < 4; i++) {
            if (idiom[i]) {
                if (primero) {
                    if (i == 0) {
                        idiomas += "C.IdiomaIngles=TRUE";
                    } else if (i == 1) {
                        idiomas += "C.IdiomaEspañol=TRUE";
                    } else if (i == 2) {
                        idiomas += "C.IdiomaFrances=TRUE";
                    } else {
                        idiomas += "C.IdiomaAleman=TRUE";
                    }
                    primero = false;
                } else {
                    if (i == 1) {
                        idiomas += " OR C.IdiomaEspañol=TRUE";
                    } else if (i == 2) {
                        idiomas += " OR C.IdiomaFrances=TRUE";
                    } else {
                        idiomas += " OR C.IdiomaAleman=TRUE";
                    }
                }
            }
        }

        if (!clases.equals("")) {
            clases = "AND (" + clases + ") ";
        }
        if (!idiomas.equals("")) {
            idiomas = "AND (" + idiomas + ") ";
        }
        if (soloclan) {
            s_clan = "AND CC.Clan IN (SELECT CC.Clan FROM Clan_Cuenta CC, Cuentas C WHERE C.NomCuenta=CC.Cuenta AND C.NomCuenta LIKE '%" + c_usu + "%') ";
        }
        if (agonia.equals("")) {
            agonia = "0";
        }
        if (fractales.equals("")) {
            fractales = "0";
        }

        String q = "SELECT P.NomPj, P.Cuenta, Cl.NomClase, C.NivFractales, getAgonia(NomPj) as Agonia, CC.Clan, C.IdiomaIngles,"
                + "C.IdiomaEspañol, C.IdiomaFrances, C.IdiomaAleman "
                + "FROM Personajes P, Cuentas C LEFT JOIN Clan_Cuenta CC ON C.NomCuenta=CC.Cuenta, Clases Cl WHERE C.NomCuenta=P.Cuenta "
                + "AND P.Clase=Cl.ID_Clase AND (CC.Clan LIKE '%" + cl + "%' AND P.NomPj LIKE '%" + pj + "%' AND P.Cuenta LIKE '%" + cu + "%') "
                + "AND getAgonia(NomPj)>=" + agonia + " "
                + "AND C.NivFractales>=" + fractales + " "
                + s_clan + " "
                + clases + " "
                + idiomas;
        String qcount = "SELECT Count(*) as total "
                + "FROM Personajes P, Cuentas C LEFT JOIN Clan_Cuenta CC ON C.NomCuenta=CC.Cuenta, Clases Cl WHERE C.NomCuenta=P.Cuenta "
                + "AND P.Clase=Cl.ID_Clase AND (CC.Clan LIKE '%" + cl + "%' AND P.NomPj LIKE '%" + pj + "%' AND P.Cuenta LIKE '%" + cu + "%') "
                + "AND getAgonia(NomPj)>=" + agonia + " "
                + "AND C.NivFractales>=" + fractales + " "
                + s_clan + " "
                + clases + " "
                + idiomas;
        
        System.out.println(q);

        int registros = 0;
        String[] columNames = {"Personaje", "Cuenta", "Clase", "Niv.Frac", "R.Agonía", "Clan", "Idiomas"};
        Statement stmt = null;
        try {

            stmt = db.getConexion().createStatement();
            ResultSet res = stmt.executeQuery(qcount);
            res.next();
            registros = res.getInt("total");
            System.out.println(registros);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][7];

        try {
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"

            //Recogemos los datos a mostrar de personajes y el nombre de sus clases
            ResultSet res = stmt.executeQuery(q);
            int i = 0;
            while (res.next()) {
                String cad = "";
                if (res.getBoolean("IdiomaIngles")) {
                    cad = cad.concat("[EN]");
                }
                if (res.getBoolean("IdiomaEspañol")) {
                    cad = cad.concat("[ES]");
                }
                if (res.getBoolean("IdiomaFrances")) {
                    cad = cad.concat("[FR]");
                }
                if (res.getBoolean("IdiomaAleman")) {
                    cad = cad.concat("[GER]");
                }

                data[i][0] = res.getString("NomPj");
                data[i][1] = res.getString("Cuenta");
                data[i][2] = res.getString("NomClase");
                data[i][3] = res.getString("NivFractales");
                data[i][4] = res.getString("Agonia");
                data[i][5] = res.getString("Clan");
                data[i][6] = cad;

                if (data[i][4] == null) {
                    data[i][4] = "0";
                }
                if (data[i][4] == null) {
                    data[i][4] = "-";
                }

                i++;

            }
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public ArrayList<String> getClanes () {
        
        ArrayList<String> clanes = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomClan FROM Clanes");
            
            while (res.next()) {
                
                clanes.add(res.getString("NomClan"));
                
            }
            
            return clanes;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }

}
