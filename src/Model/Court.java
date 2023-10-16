package Model;

import static Controller.Controller.statement;
import View.AdminView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    // Methods
    public static ArrayList getCourts(boolean available) {
        // FUNCTION returns all courts in DB as object Court in a list
        
        String consultaSQL;
        if(available) {
            consultaSQL = "SELECT * FROM court WHERE isAvailable = 1";
        } else {
            consultaSQL = "SELECT * FROM court";
        }
        
        ArrayList<Court> courtList = new ArrayList<>();
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){ 
                int id = queryResult.getInt("courtId");
                String name = queryResult.getString("notes");
                boolean isActive = queryResult.getInt("isAvailable") == 1 ? true : false;
                Court newCourt = new Court(id, name, isActive);
                courtList.add(newCourt);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return courtList;
        }
    }
    
    public static void getSelectedCourt(Court court) {
        AdminView.CourtInfoIDLabel.setText("Court " + court.getID());
        AdminView.CourtInfoNotes.setText(court.getNotes());
        if(court.isIsActive()) {
            AdminView.CourtInfoState.setSelectedItem(0);
        } else {
            AdminView.CourtInfoState.setSelectedItem(1);
        }
    }
    
    public static void createCourt(String notes, int isAvailable) {
        // Use a PreparedStatement to safely insert data into the database
    	String sql = "INSERT INTO court (notes, isAvailable) VALUES (? , ?)";
    	try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
        	prepareQuery.setString(1, notes);
        	prepareQuery.setInt(2, isAvailable);

        	// Execute the query
        	int rowsInserted = prepareQuery.executeUpdate();

        	if (rowsInserted > 0) {
            	// Successfully inserted
                    System.out.print("Fila insertada");
        	} else {
            	// Error in database
                    System.out.print("Fila NO insertada");
        	}
    	} catch (Exception e) {
        	e.printStackTrace(); // Print the exception for debugging
    	}
    }
    
    public static void updateCourt(int state, String notes, String court) {
        
        // Dividimos la cadena en función de un espacio en blanco
        String[] parts = court.split(" ");
        int number = 0;
        // La primera parte es "Court" y la segunda parte es el número
        if (parts.length == 2 && parts[0].equals("Court")) {
            // Convertimos la segunda parte a un valor int
            number = Integer.parseInt(parts[1]);
        } else {
            System.out.println("El formato de la cadena no es válido.");
        }
        
        state = (state == 1) ? 1 : 0;

        String sql = "UPDATE court SET notes = ?, isAvailable = ? WHERE courtId = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, notes);
                    prepareQuery.setInt(2, state);
                    prepareQuery.setInt(3, number);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
    }
}