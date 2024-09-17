package payments;

import payments.IPayment;
import payments.IPaymentStrategy;

public class Payment implements IPayment {
    private int paymentID;
    private int bookingID;
    private float amount;
    private String paymentStatus;
    private IPaymentStrategy paymentStrategy;

    public Payment(int paymentID, int bookingID, float amount, String paymentStatus, IPaymentStrategy paymentStrategy) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void processPayment(float amount) {
        paymentStrategy.pay(amount);
        this.paymentStatus="Completed";
        System.out.println("Payment Complted Successfully");
    }

    @Override
    public void refundPayment() {
        this.paymentStatus = "Refunded";
        System.out.println("Payment Has Been Refunded");
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
