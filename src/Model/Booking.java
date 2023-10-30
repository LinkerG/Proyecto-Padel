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

    
    public static void deleteBooking(int bookingId) {
        String sql = "UPDATE booking SET status='CANCELLED' WHERE bookingId = ?";
        try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
            prepareQuery.setInt(1, bookingId);
            ResultSet result = prepareQuery.executeQuery();
            if(result.rowInserted()) {
                System.out.println("DELETE Realizado");
            } else {
                System.out.println("DELETE NO Realizado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList getBookingsByDay(String day) {

        String sql = "SELECT * FROM booking WHERE day = '" + day + "'";
        ArrayList<Booking> bookingsList = getBookings(sql);
        return bookingsList;
        
    }
    
    public static ArrayList getBookingsByMonth(String month) {

        String sql = "SELECT * FROM booking WHERE MONTH(day) = '" + month + "'";
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
