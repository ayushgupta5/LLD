package  payments;

public class CreditCardPayment implements IPaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Processiong Credit Card Payment of $ " + amount + " Card Number " + cardNumber);
    }
}
