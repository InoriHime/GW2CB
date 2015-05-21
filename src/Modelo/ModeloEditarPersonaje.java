package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloEditarPersonaje {
    
    Database db = null;
    
    //Constructor de la clase.
    public ModeloEditarPersonaje () {
        
        db = new Database();
        
    }
    
    //Metodo para obtener las razas en un ArrayList.
    public ArrayList<String> getRazas() {
    
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
    
    public ArrayList<String> getClases() {
    
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
    
    public ArrayList<String> getSlotArma() {
    
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
    
    public ArrayList<String> getSlotArmadura() {
    
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
    
    public ArrayList<String> getTipoArma() {
    
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
    
    public ArrayList<String> getRarezas() {
    
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
    
    public ArrayList<String> getModificador() {
    
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
    
}
