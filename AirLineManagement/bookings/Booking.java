package bookings;

public class Booking implements IBooking {
    private int bookingID;
    private int passengerID;
    private int flightID;
    private String bookingStatus;

    public Booking(int bookingID, int passengerID, int flightID, String bookingStatus) {
        this.bookingID = bookingID;
        this.passengerID = passengerID;
        this.flightID = flightID;
        this.bookingStatus = bookingStatus;
    }

    @Override
    public void createBooking() {
        System.out.println("Booking Has Been Created");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Booking Has Been Cancelled");
    }

    @Override
    public void viewBookingDetails() {
        System.out.println("Viewing Booking Details");
    }
}
