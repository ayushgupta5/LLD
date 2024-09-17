package payments;

public class PayPalPayment implements IPaymentStrategy {
    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Processing Paypal amount of "+ amount + " using Paypal Account "+ email);
    }
}
