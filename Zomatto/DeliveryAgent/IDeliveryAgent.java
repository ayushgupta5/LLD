package DeliveryAgent;

public interface IDeliveryAgent {
    void acceptOrder(int orderID);
    void updateDeliveryStatus(int orderID, String status);
    void trackAssignedOrder(int orderId);
}
