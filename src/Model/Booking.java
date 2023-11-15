package Model;

import Controller.Controller;
import static Controller.Controller.statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    public void payBooking(){
        String update = "";
        if(this.status.getStatus().equals("NOTPAID")){
            update = "UPDATE booking SET status = 'PAID' WHERE bookingId = '" + this.bookingId + "';";
            
        } else if(this.status.getStatus().equals("PAID")) {
            update = "UPDATE booking SET status = 'NOTPAID' WHERE bookingId = '" + this.bookingId + "';";
        }
        
        if(!update.equals("")){
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
    
    public void cancelBooking() {
        String update = "";
        System.out.println("hola");
        if(this.status.getStatus().equals("NOTPAID") || this.status.getStatus().equals("PAID")){
            update = "UPDATE booking SET status = 'CANCELLED' WHERE bookingId = '" + this.bookingId + "';";
            
        } else if(this.status.getStatus().equals("CANCELLED")) {
            update = "UPDATE booking SET status = 'NOTPAID' WHERE bookingId = '" + this.bookingId + "';";
            System.out.println("hola");
        }
        
        if(!update.equals("")){
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
    
    public static boolean createBooking(String userEmail, int courtId, String day, String hour) {
        String sql = 
            "INSERT INTO booking (email, courtId, day, hour, status) VALUES (?, ?, ?, ?, 'NOTPAID')";
        try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
            prepareQuery.setString(1, userEmail);
            prepareQuery.setInt(2, courtId);
            prepareQuery.setString(3, day);
            prepareQuery.setString(4, hour);
            int rowsInserted = prepareQuery.executeUpdate(); // Use executeUpdate() for INSERT statements
            if (rowsInserted > 0) {
                System.out.println("INSERT Realizado");
                return true;
            } else {
                System.out.println("INSERT NO Realizado");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public static boolean deleteBooking(int bookingId) {
        String sql = "UPDATE booking SET status = 'BLOCKED' WHERE bookingId = ?";
        try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
            prepareQuery.setInt(1, bookingId);
            int rowsUpdated = prepareQuery.executeUpdate(); // Use executeUpdate() for UPDATE statements
            if (rowsUpdated > 0) {
                System.out.println("Bloqueo Realizado");
                return true;
            } else {
                System.out.println("Bloqueo NO Realizado");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static ArrayList getBookingsById(String id) {

        String sql = "SELECT * FROM booking WHERE bookingId = '" + id + "'";
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
        
    }

    public static ArrayList getBookingsByUser(String email, Boolean onlyFuture, Boolean notCancelled) {
        
        String sql;
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        
        if(onlyFuture) {
            if(notCancelled){
                sql = "SELECT * FROM booking WHERE email = '" + email + "' AND day > '" + date + "' AND status != 'CANCELLED'";
            } else {
                sql = "SELECT * FROM booking WHERE email = '" + email + "' AND day > '" + date + "'";
            }
        }
        else {
            if(notCancelled){
                sql = "SELECT * FROM booking WHERE email = '" + email + "' AND status != 'CANCELLED'";
            } else {
                sql = "SELECT * FROM booking WHERE email = '" + email + "'";
            }
        }
        
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
        
    }
    
    public static ArrayList getBookingsByDay(String day) {

        String sql = "SELECT * FROM booking WHERE day = '" + day + "' AND status != 'CANCELLED'";
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
        
    }
    
    public static ArrayList getBookingsByMonth(String month, String year) {

        String sql = "SELECT * FROM booking WHERE YEAR(day) = '" + year +"' AND MONTH(day) = '" + month + "'";
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
    }
    
    public static ArrayList getBookingsByCourtDate(String date, int courtId) {

        String sql = "SELECT * FROM booking WHERE day = '" + date + "' AND courtId = '" + String.valueOf(courtId) + "' ORDER BY hour ASC";
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
    }
    
    public static ArrayList getBookings(String sql) {
        ArrayList<Booking> bookingsList = new ArrayList<>();
        
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)){
            ResultSet queryResult = prepareQuery.executeQuery();
            
            while(queryResult.next()){
                int id = queryResult.getInt("bookingId");
                String email = queryResult.getString("email");
                int court = queryResult.getInt("courtId");
                String day = queryResult.getString("day");
                
                String strHour = queryResult.getString("hour");
                BookingHour bHour = BookingHour.fromString(strHour);
                
                String strStatus = queryResult.getString("status");
                BookingStatus bStatus = BookingStatus.fromString(strStatus);
                
                Booking newBooking = new Booking(id, email, court, day, bHour, bStatus);
                bookingsList.add(newBooking);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return bookingsList;
        }
    }
}
