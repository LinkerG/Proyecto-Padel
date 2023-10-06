package Model;

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
    //As admin, creates a new Court
    public void createCourt(String name, boolean isEnabled, Statement connection){
        //TO-DO SQL INSERT INTO pista
    }
    //As client or admin, books a court and changes the state
    public void modifyBook(CourtState state, Court targetCourt, Calendar day, Statement connection){
        //TO-DO actualizar informacion de la pista con CourtState
    }
    //As admin, sets a court as blocked that cannot be booked, if the court has a book programmed at a certain hour, it will change the book state to CANCELED
    public void toggleCourt(Court targetCourt){
        //TO-DO actualiza el estado de la pista (activo/no activo)
        //Si la pista ahora esta inactiva, CANCELA todas las reservas futuras relacionadas y comprueba la disponibilidad espejo de otras pistas, si hay una libre, la asigna automaticamente
    }
    //As admin, registers a new user to the database
    public void registerUser(String name, String surname, boolean admin){
        //TO-DO SQL INSERT INTO user
        //Default ACTIVO
    }
    //As admin, unsubscribes a user from the database (deactivates the user)
    public void toggleUserSubscription(User targetUser){
        //UPDATE USER userDNI !active
        //Si el usuario tiene reservas proximas a su nombre, se cancela
    }
}
