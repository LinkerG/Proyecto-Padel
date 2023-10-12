package Model;

import Controller.*;
import java.sql.*;
import java.util.Calendar;

public class User {
    //Attributes
    private String email = "";
    private String name = "";
    private String surnames = "";
    private String dni = "";
    private boolean isActive = true;
    private boolean admin = false;
    
    //Constructor
    public User(String email, String name, String surname, String dni, boolean isActive, boolean admin){
        this.email = email;
        this.name = name;
        this.surnames = surname;
        this.dni = dni;
        this.isActive = isActive;
        this.admin = admin;
    }
    
    public User() {}
    
    //Setters & Getters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }
    public void setSurnames(String surname) {
        this.surnames = surname;
    }

    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    
    //Methods
    public void updateUserIsActive(User user) {
        String update = user.isActive ? "UPDATE USER SET isActive = 0 WHERE DNI = '" + user.dni + "';" : "UPDATE USER SET isActive = 1 WHERE DNI = '" + user.dni + "';";
        try(PreparedStatement prepareQuery = Controller.statement.getConnection().prepareStatement(update)){
            // Execute the query
        	int rowsInserted = prepareQuery.executeUpdate();

        	if (rowsInserted > 0) {
            	// Successfully inserted
                    System.out.print("updated");
        	} else {
            	// Error in database
                    System.out.print("not updated");
        	}
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
