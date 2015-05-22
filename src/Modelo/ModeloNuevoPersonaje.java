package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ModeloNuevoPersonaje {
    
    Database db = null;
    
    //Constructor de la clase.
    public ModeloNuevoPersonaje () {
        
        db = new Database();
        
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
    
    public boolean crearPersonaje(String nom, String nomCuenta, int r, int c, int[][] arm, int[][] ad, boolean[] narm, boolean[] earm, boolean[] nad, boolean[] ead) {
        
        String q;
        
        try {
            
            PreparedStatement pstm;
            
            q = "INSET INTO Personajes (NomPj, Cuenta, Raza, Clase) VALUES (" + nom + ", " + nomCuenta + ", " + r + ", " + c + ")";
            pstm = db.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            
            for(int i = 0; i < 6; i++) {
            
                if (earm[i] == true) {
                
                    q = "DELETE FROM Pj_Armas WHERE NomPj = '" + nom + "' AND SlotArma = '" + (i + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                } else if (narm[i] == true) {
                
                    q = "DELETE FROM Pj_Armas WHERE NomPj = '" + nom + "' AND SlotArma = '" + (i + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    
                    q = "INSERT INTO Pj_Armas (NomPj, SlotArma, TipoArma, Modificador, Rareza, InfSimple1, InfSimple2) VALUES ('" + nom + "', " + arm[i][0] + ", " + arm[i][1] + ", " + arm[i][2] + ", " + arm[i][3] + ", " + arm[i][4] + ", " + arm[i][5] + ")";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                }
            
            }
        
        
            for(int j = 0; j < 13; j++) {
            
                if (ead[j] == true) {
                
                    q = "DELETE FROM Pj_Armaduras WHERE NomPj = '" + nom + "' AND SlotArmadura = '" + (j + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                } else if (nad[j] == true) {
                
                    q = "DELETE FROM Pj_Armaduras WHERE NomPj = '" + nom + "' AND SlotArmadura = '" + (j + 1) + "'";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    
                    q = "INSERT INTO Pj_Armaduras (NomPj, SlotArmadura, Modificador, Rareza, InfSimple, InfAgonia) VALUES ('" + nom + "', " + ad[j][0] + ", " + ad[j][1] + ", " + ad[j][2] + ", " + ad[j][3] + ", " + ad[j][4] + "";
                    pstm = db.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                
                }
            
            }
            
            JOptionPane.showMessageDialog(null, "Personaje creado con éxito.");
            
            return true;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return false;
        
    }
    
}
