package Delivery;

public interface IDelivery {
    void updateDeliveryStatus(String status);
    void trackDelivery(int orderID);
}
