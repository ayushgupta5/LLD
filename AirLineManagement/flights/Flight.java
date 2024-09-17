package flights;

import java.time.LocalDateTime;

public class Flight {
    private int flightID;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String status;

    public Flight(int flightID, String origin, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, String status) {
        this.flightID = flightID;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getFlightDetails() {
        return "Flight " + flightID + " From " + origin + " to " + destination + " Departs At " + departureTime + " and arrives at " + arrivalTime;
    }
}
