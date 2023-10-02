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

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
