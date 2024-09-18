package Payment;

public interface IPayment {
    void processPayment(double amount);
    String getPaymentStatus();
    void updatePaymentStatus(String status);
}
