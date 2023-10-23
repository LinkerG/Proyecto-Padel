/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public enum BookingStatus {
	NOTPAID("NOTPAID"),
	PAID("PAID"),
	BLOCKED("BLOCKED"),
	CANCELLED("CANCELLED");
        
        private final String name;

	private BookingStatus(String name) {
            this.name = name;
	}

        public String getStatus() {
            return name;
        }
        
        public static BookingStatus fromString(String statusString) {
    	for (BookingStatus status : BookingStatus.values()) {
        	if (status.name().equalsIgnoreCase(statusString)) {
                    return status;
        	}
    	}
    	throw new IllegalArgumentException("Invalid status string: " + statusString);
	}

}
