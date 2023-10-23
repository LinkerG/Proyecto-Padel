/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Controller.Controller.statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Booking {
    private int bookingId;
    private String userEmail;
    private int courtId;
    private String day;
    private BookingHour hour;
    private BookingStatus status;

    public Booking(int bookingId, String userEmail, int courtId, String day, BookingHour hour, BookingStatus status) {
        this.bookingId = bookingId;
        this.userEmail = userEmail;
        this.courtId = courtId;
        this.day = day;
        this.hour = hour;
        this.status = status;
    }
    
    // Getters & Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public BookingHour getHour() {
        return hour;
    }

    public void setHour(BookingHour hour) {
        this.hour = hour;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
    
    
    // Methods
    public static ArrayList getBookingsByDay(Date day) {
        
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String strDay = formatter.format(day);

        String sql = "SELECT * FROM booking WHERE day = ?";
        
        ArrayList<Booking> bookingsList = new ArrayList<>();
        
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)){
            
            prepareQuery.setString(1, strDay);
            ResultSet queryResult = prepareQuery.executeQuery();
            
            while(queryResult.next()){
                int id = queryResult.getInt("bookingId");
                String email = queryResult.getString("userEmail");
                int court = queryResult.getInt("courtId");
                
                String strHour = queryResult.getString("hour");
                BookingHour bHour = BookingHour.fromString(strHour);
                
                String strStatus = queryResult.getString("status");
                BookingStatus bStatus = BookingStatus.fromString(strStatus);
                
                Booking newBooking = new Booking(id, email, court, strDay, bHour, bStatus);
                bookingsList.add(newBooking);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return bookingsList;
        }
    }
}
