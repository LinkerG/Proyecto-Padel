package Model;

import java.sql.*;
import java.util.Calendar;

public class User {
    //Attributes
    private String name;
    private String surname;
    private String DNI;
    private boolean active;
    private boolean admin;
    
    //Constructor
    User(String name, String surname, String DNI, boolean active, boolean admin){
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.active = active;
        this.admin = admin;
    }
    
    //Setters & Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
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
    public void registerUser(String name, String surname, String DNI, boolean admin){
        //TO-DO SQL INSERT INTO user
        //Default ACTIVO
    }
    //As admin, unsubscribes a user from the database (deactivates the user)
    public void toggleUserSubscription(User targetUser){
        //UPDATE USER userDNI !active
        //Si el usuario tiene reservas proximas a su nombre, se cancela
    }
}
