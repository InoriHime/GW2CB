package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ModeloEditarPersonaje {
    
    Database db = null;
    
    //Constructor de la clase.
    public ModeloEditarPersonaje () {
        
        db = new Database();
        
    }
    
    public int getRaza(String npj) {
        
        int raza = 0;
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt = db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT Raza FROM Personajes WHERE NomPj = '" + npj + "'");
            
            while (res.next()) {
                
                raza = res.getInt("Raza");
                
            }
            
            return raza;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return 0;
        
    }
    
    public ArrayList<String> getNombreRazas() {
    
        ArrayList<String> razas = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomRaza FROM Razas");
            
            while (res.next()) {
                
                razas.add(res.getString("NomRaza"));
                
            }
            
            return razas;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public int getClase(String npj) {
        
        int clase = 0;
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt = db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT Clase FROM Personajes WHERE NomPj = '" + npj + "'");
            
            while (res.next()) {
                
                clase = res.getInt("Clase");
                
            }
            
            return clase;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return 0;
        
    }
    
    public ArrayList<String> getNombreClases() {
    
        ArrayList<String> clases = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomClase FROM Clases");
            
            while (res.next()) {
                
                clases.add(res.getString("NomClase"));
                
            }
            
            return clases;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public int[][] getArmas(String npj) {
        
        int[][] armas = new int[6][6];
        int tmp = 0;
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt = db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT SlotArma, TipoArma, Modificador, Rareza, InfSimple1, InfSimple2 FROM Pj_Armas WHERE NomPj = '" + npj + "' ORDER BY SlotArma ASC");
            
            while (res.next()) {
                
                tmp = res.getInt("SlotArma") - 1;
                
                armas[tmp][0] = tmp + 1;
                armas[tmp][1] = res.getInt("TipoArma");
                armas[tmp][2] = res.getInt("Modificador");
                armas[tmp][3] = res.getInt("Rareza");
                armas[tmp][4] = res.getInt("InfSimple1");
                armas[tmp][5] = res.getInt("InfSimple2");
                
            }
            
            return armas;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return null;
        
    }
    
    public ArrayList<String> getNombreSlotArma() {
    
        ArrayList<String> slotArma = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomSArma FROM Slots_Armas");
            
            while (res.next()) {
                
                slotArma.add(res.getString("NomSArma"));
                
            }
            
            return slotArma;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public int[][] getArmaduras(String npj) {
        
        int[][] armaduras = new int[13][5];
        int tmp = 0;
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt = db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT SlotArmadura, Modificador, Rareza, InfSimple, InfAgonia FROM Pj_Armaduras WHERE NomPj = '" + npj + "' ORDER BY SlotArmadura ASC");
            
            while (res.next()) {
                
                tmp = res.getInt("SlotArmadura") - 1;
                
                armaduras[tmp][0] = tmp + 1;
                armaduras[tmp][1] = res.getInt("Modificador");
                armaduras[tmp][2] = res.getInt("Rareza");
                armaduras[tmp][3] = res.getInt("InfSimple");
                armaduras[tmp][4] = res.getInt("InfAgonia");
                
            }
            
            return armaduras;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return null;
        
    }
    
    public ArrayList<String> getNombreSlotArmadura() {
    
        ArrayList<String> slotArmadura = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomSArmadura FROM Slots_Armaduras");
            
            while (res.next()) {
                
                slotArmadura.add(res.getString("NomSArmadura"));
                
            }
            
            return slotArmadura;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public ArrayList<String> getNombreTipoArma() {
    
        ArrayList<String> tipoArma = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomTip FROM Tipos_Arma");
            
            while (res.next()) {
                
                tipoArma.add(res.getString("NomTip"));
                
            }
            
            return tipoArma;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public ArrayList<String> getNombreRarezas() {
    
        ArrayList<String> rarezas = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomRareza FROM Rarezas");
            
            while (res.next()) {
                
                rarezas.add(res.getString("NomRareza"));
                
            }
            
            return rarezas;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public ArrayList<String> getNombreModificador() {
    
        ArrayList<String> modificadores = new ArrayList<>();
        Statement stmt = null;
        ResultSet res;
        
        try {
            
            stmt= db.getConexion().createStatement();
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        try {
            
            res = stmt.executeQuery("SELECT NomMod FROM Modificadores");
            
            while (res.next()) {
                
                modificadores.add(res.getString("NomMod"));
                
            }
            
            return modificadores;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
  
        return null;
        
    }
    
    public boolean modificarPersonaje(String antiguoNom,String nuevoNom, int r, int c, int[][] arm, int[][] ad, boolean[] narm, boolean[] earm, boolean[] nad, boolean[] ead) {
        
        String q;
        
        try {
            
            PreparedStatement pstm;
            
            q = "UPDATE Personajes SET NomPj = '" + nuevoNom + "', Raza = " + r + ", Clase = " + c + " WHERE NomPj = '" + antiguoNom + "'";
            pstm = db.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            
            for(int i = 0; i < 6; i++) {
            
                if (earm[i] == true) {
                
                    q = "DELETE FROM Pj_Armas WHERE NomPj = '" + nuevoNom + "' AND SlotArma = '" + (i + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                } else if (narm[i] == true) {
                
                    q = "DELETE FROM Pj_Armas WHERE NomPj = '" + nuevoNom + "' AND SlotArma = '" + (i + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    
                    q = "INSERT INTO Pj_Armas (NomPj, SlotArma, TipoArma, Modificador, Rareza, InfSimple1, InfSimple2) VALUES ('" + nuevoNom + "', " + arm[i][0] + ", " + arm[i][1] + ", " + arm[i][2] + ", " + arm[i][3] + ", " + arm[i][4] + ", " + arm[i][5] + ")";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                }
            
            }
        
        
            for(int j = 0; j < 13; j++) {
            
                if (ead[j] == true) {
                
                    q = "DELETE FROM Pj_Armaduras WHERE NomPj = '" + nuevoNom + "' AND SlotArmadura = '" + (j + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                } else if (nad[j] == true) {
                
                    q = "DELETE FROM Pj_Armaduras WHERE NomPj = '" + nuevoNom + "' AND SlotArmadura = '" + (j + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    
                    q = "INSERT INTO Pj_Armaduras (NomPj, SlotArmadura, Modificador, Rareza, InfSimple, InfAgonia) VALUES ('" + nuevoNom + "', " + ad[j][0] + ", " + ad[j][1] + ", " + ad[j][2] + ", " + ad[j][3] + ", " + ad[j][4] + "";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                }
            
            }
            
            JOptionPane.showMessageDialog(null, "Personaje modificado con éxito.");
            
            return true;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return false;
        
    }
    
}
