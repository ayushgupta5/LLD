package Payment;

public interface IPayment {
    void processPayment(double amount, String paymentMethod);
    String getPaymentStatus(int orderID);
}
