package Payment;

public class Payment implements IPayment {
    private int paymentID;
    private int orderID;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int paymentID, int orderID, String paymentMethod, String paymentStatus) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Making the Payment of amount: " + amount);
    }

    @Override
    public String getPaymentStatus() {
        System.out.println("Getting the Payment status");
        return this.paymentStatus;
    }

    @Override
    public void updatePaymentStatus(String status) {
        System.out.println("Updating the Payment status");
        this.paymentStatus=status;
    }
}
