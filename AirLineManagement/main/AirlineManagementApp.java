package main;

import bookings.Booking;
import flights.Flight;
import passengers.Passenger;
import payments.IPaymentStrategy;
import payments.PayPalPayment;
import payments.Payment;
import staffs.Staff;
import java.time.LocalDateTime;



public class AirlineManagementApp {
    public static void main(String[] args) {
        Flight flight = new Flight(101, "SHG", "BLR", LocalDateTime.now(), LocalDateTime.now().plusHours(6), "Scheduled");
        System.out.println(flight.getFlightDetails());

        Passenger passenger = new Passenger(1, "Ayush", "ayush@gmail.com", "12345");
        passenger.bookFlight();

        Booking booking = new Booking(1, 1, 101, "Confirmed");
        booking.createBooking();

        IPaymentStrategy payPalPayment = new PayPalPayment("ayush@gmail.com");
        Payment payment = new Payment(1, 1, 500.0f, "PENDING", payPalPayment);
        payment.setPaymentStrategy(payPalPayment);

        payment.processPayment(500.0f);

        Staff staff = new Staff(1, "Ayush", "Pilot", "101");
        staff.assignFlight();

        payment.refundPayment();
    }
}
