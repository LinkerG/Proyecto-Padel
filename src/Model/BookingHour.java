/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public enum BookingHour {
        // Modify the bookable hours here
	H0800("08:00"),
	H0930("09:30"),
	H1100("11:00"),
	H1230("12:30"),
	H1500("15:00"),
	H1630("16:30"),
	H1800("18:00"),
	H1930("19:30"),
	H2100("21:00");

	private final String timeString;

	private BookingHour(String timeString) {
            this.timeString = timeString;
	}

	public String getTimeString() {
            return timeString;
	}

	public static BookingHour fromString(String timeString) {
            for (BookingHour hour : BookingHour.values()) {
                    if (hour.timeString.equals(timeString)) {
                    return hour;
                    }
            }
    	throw new IllegalArgumentException("Invalid time string: " + timeString);
	}
}

