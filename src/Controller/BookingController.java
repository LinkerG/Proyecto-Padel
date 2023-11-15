package Controller;
import Model.Booking;
import Model.User;
import java.util.ArrayList;

public class BookingController {
    
    public static ArrayList<Booking> getBookings(String action, String date){
       if(action.equals("month")){
           String[] parts= date.split("/");
           String year = parts[0];
           String month = parts[1];
           ArrayList<Booking> bookingList = Booking.getBookingsByMonth(month, year);
           return bookingList;
       } else if(action.equals("day")) {
           ArrayList<Booking> bookingList = Booking.getBookingsByDay(date);
           return bookingList;
       } else{
           return null;
       }     
    }
    
    public static ArrayList<Booking> getBookings(String date, int courtId){
        return Booking.getBookingsByCourtDate(date, courtId);
    }
    
    public static ArrayList<Booking> getBookings(User user, Boolean onlyFuture, Boolean notCancelled){
        return Booking.getBookingsByUser(user.getEmail(), onlyFuture, notCancelled);
    }
    
    public static boolean deleteBooking(int bookingId){
        return Booking.deleteBooking(bookingId);
    }
    
    public static boolean createBooking(String email, int courtId, String day, String hour){
        return Booking.createBooking(email, courtId, day, hour);
    }
    
    public static void payBooking(Booking booking) {
        booking.payBooking();
    }
    
    public static void cancelBooking(Booking booking) {
        booking.cancelBooking();
    }
    
    public static boolean blockCourt(int courtId, String startDay, String startHour, String endDay, String endHour){
        return (Booking.blockCourt(courtId, startDay, startHour, endDay, endHour));
    }
    
    public static ArrayList<Booking> getBookingsByIntervalDate(int courtId, String startDay, String startHour, String endDay, String endHour){
        return Booking.getBookingsByIntervalDate(courtId, startDay, startHour, endDay, endHour);
    }
    
}
