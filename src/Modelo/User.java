package Modelo;

public class User {
    //Attributes
    private String name;
    private String surname;
    private String DNI;
    private boolean isActive;
    private boolean isAdmin;
    
    //Constructor
    User(String name, String surname, String DNI, boolean isActive, boolean isAdmin){
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.isActive = isActive;
        this.isAdmin = isAdmin;
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

    public boolean isIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    //Methods
    //As admin, creates a new Court
    public void createCourt(){
        
    }
    //As client or admin, books a court and changes it state to block other bookings
    public void bookCourt(){
        
    }
    //As admin, sets a booked court as payed, this blocks court state in a certain hour that cannot be changed anymore
    public void payCourt(){
        
    }
    //As client or admin, cancels a booked court and sets that certain hour free
    public void cancelCourt(){
        
    }
    //As admin, sets a court as blocked that cannot be booked, if the court has a book programmed that certain hour, it will dissapear
    public void blockCourt(Court targetCourt){
        
    }
    //As admin, registers a new user to the database
    public void registerUser(){
        
    }
    //As admin, unsubscribes a user from the database (deactivates the user)
    public void unsubscribeUser(){
        
    }
}
