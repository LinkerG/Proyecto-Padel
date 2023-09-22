package Modelo;

import java.util.Calendar;

public class Booking {
    // Attributes
    private int courtId;
    private String userDNI;
    private Calendar day;
    private int hour;
    
    // Constructor
    public Booking(int courtId, String userDNI, Calendar day, int hour) {
        this.courtId = courtId;
        this.userDNI = userDNI;
        this.day = day;
        this.hour = hour;
    }

    //Get / Set
    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public String getUserDNI() {
        return userDNI;
    }

    public void setUserDNI(String userDNI) {
        this.userDNI = userDNI;
    }

    public Calendar getDay() {
        return day;
    }

    public void setDay(Calendar day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
