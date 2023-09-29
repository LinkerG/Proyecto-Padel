package Model;

import java.util.ArrayList;
import java.util.Calendar;

public class Court {
    // Attributes
    private int ID;
    private String name;
    private boolean isActive;
    
    // Constructor
    public Court(int ID, String name, boolean isActive) {
        this.ID = ID;
        this.name = name;
        this.isActive = isActive;
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

    
    
    // Methods
    public void changeStatus(String status) {
        // llamar a la BD y update status = String status where court id = int id
        
    }
}
