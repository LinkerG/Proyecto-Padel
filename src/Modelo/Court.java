package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.*;

public class Court {
    // Attributes
    private int ID;
    private String name;
    private String status;
    
    // Constructor
    public Court(int ID, String name, String status) {
        this.ID = ID;
        this.name = name;
        this.status = status;
    }
    
    // Get / Set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // Methods
    public void changeStatus(String status) {
        // llamar a la BD y update status = String status where court id = int id
        
    }
}
