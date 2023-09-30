package Model;

import java.util.ArrayList;
import java.util.Calendar;

public class Court {
    // Attributes
    private int ID;
    private String notes;
    private boolean isActive;
    
    // Constructor
    public Court(int ID, String notes, boolean isActive) {
        this.ID = ID;
        this.notes = notes;
        this.isActive = isActive;
    }
    
    // Get / Set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
    
    // Methods
    public void changeStatus(String status) {
        // llamar a la BD y update status = String status where court id = int id
        
    }
}
