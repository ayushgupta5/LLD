package Delivery;

public class Delivery implements IDelivery {
    private int deliveryID;
    private int orderID;
    private int deliveryAgentID;
    private String status;

    public Delivery(int deliveryID, int orderID, int deliveryAgentID, String status) {
        this.deliveryID = deliveryID;
        this.orderID = orderID;
        this.deliveryAgentID = deliveryAgentID;
        this.status = status;
    }

    @Override
    public void updateDeliveryStatus(String status) {
        System.out.println("Updating the delivery status");
        this.status = status;
    }

    @Override
    public void trackDelivery(int orderID) {
        System.out.println("Tracking the Delivery with OrderID: " + orderID);
    }
}

