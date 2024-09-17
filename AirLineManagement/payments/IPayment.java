package payments;

public interface IPayment {
    void processPayment(float amount);
    void refundPayment();
}
