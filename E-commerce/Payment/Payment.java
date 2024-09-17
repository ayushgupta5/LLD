package Payment;

public class Payment implements IPayment {
    private int paymentID;
    private int orderID;
    private String paymentMethod;
    private String paymentStatus;
    private float amount;

    public Payment(int paymentID, int orderID, String paymentMethod, String paymentStatus, float amount) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    @Override
    public void processPayment(double amount, String paymentMethod) {
        System.out.println("Process the Payment with amount: " + amount + " with Payment Method: " + paymentMethod);
    }

    @Override
    public String getPaymentStatus(int orderID) {
        System.out.println("Getting the Payment Status for OrderID: " + orderID);
        return this.paymentStatus;
    }
}
