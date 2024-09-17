package passengers;

public class Passenger implements IPassenger {
    private int passengerID;
    private String name;
    private String email;
    private String phone;

    public Passenger(int passengerID, String name, String email, String phone) {
        this.passengerID = passengerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public void bookFlight() {
        System.out.println("Booking the Flight");
    }

    @Override
    public void viewBookings() {
        System.out.println("View the Flight Bookings");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Cancel The Booking");
    }

    @Override
    public void checkFlightStatus() {
        System.out.println("Check the Flight Status");
    }
}
