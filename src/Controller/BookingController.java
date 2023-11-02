package Controller;
import Model.Booking;
import java.util.ArrayList;

public class BookingController {
    
    public static ArrayList<Booking> getBookings(String action, String date){
       if(action.equals("month")){
           ArrayList<Booking> bookingList = Booking.getBookingsByMonth(date);
           return bookingList;
       } else if(action.equals("day")) {
           ArrayList<Booking> bookingList = Booking.getBookingsByDay(date);
           return bookingList;
       } else{
           return null;
       }     
    }
    
    public static boolean deleteBooking(int bookingId){
        return Booking.deleteBooking(bookingId);
    }
    
    public static boolean createBooking(String email, int courtId, String day, String hour){
        return Booking.createBooking(email, courtId, day, hour);
    }
    
}
