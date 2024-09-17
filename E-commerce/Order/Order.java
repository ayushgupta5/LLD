package Order;

import Product.Product;
import java.util.List;

public class Order implements IOrder {
    private int orderID;
    private int userID;
    private List<Product> products;
    private int totalAmount;
    private String ShippingAddress;
    private String orderStatus;

    public Order(int orderID, int userID, int totalAmount, String shippingAddress, String orderStatus) {
        this.orderID = orderID;
        this.userID = userID;
        this.totalAmount = totalAmount;
        ShippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
    }

    @Override
    public void createOrder(int userID, List<Product> products, String shippingAddress) {
        System.out.println("Order is Created for UserID: " + userID);
    }

    @Override
    public void getOrderDetails(int orderID) {
        System.out.println("Getting the order Details for OrderID: " + orderID);
    }

    @Override
    public void updateOrderStatus(int orderID, String status) {
        this.orderID=orderID;
        this.orderStatus=status;
        System.out.println("Update the Order status for OrderID: " + orderID);

    }

    @Override
    public void calculateTotalAmount() {
        System.out.println("Calculating the Total Amount");
    }
}
