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
    
}
