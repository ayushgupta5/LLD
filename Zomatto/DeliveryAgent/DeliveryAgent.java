package DeliveryAgent;

import User.User;

public class DeliveryAgent extends User implements IDeliveryAgent {

    public DeliveryAgent(int userID, String name, String email, String phoneNumber, String address) {
        super(userID, name, email, phoneNumber, address);
    }


    @Override
    public void acceptOrder(int orderID) {
        System.out.println("Delivery Agent has Accepted the order with orderID : " + orderID);
    }

    @Override
    public void updateDeliveryStatus(int orderID, String status) {
        System.out.println("Updating the Delivery Status with OrderID: " + orderID + " With Status: " + status);
    }

    @Override
    public void trackAssignedOrder(int orderId) {
        System.out.println("Tracking Assigned Order By Delivery Agent with OrderID: " + orderId);
    }
}
