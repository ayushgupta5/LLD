package Model.Order;

public class Order {
    private int orderID;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private String status;

    public Order(int orderID, String customerName, String pickupLocation, String dropLocation, String status) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
