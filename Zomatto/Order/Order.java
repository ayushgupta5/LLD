package Order;


import MenuItem.MenuItem;

import java.time.LocalDateTime;
import java.util.List;

public class Order implements IOrder {
    private int orderID;
    private int customerID;
    private int restaurantID;
    private List<MenuItem> menuItems;
    private double totalPrice;
    private String status;
    private LocalDateTime placedAt;

    public int getOrderID() {
        return orderID;
    }

    public Order(int orderID, int customerID, int restaurantID, double totalPrice, String status, LocalDateTime placedAt) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.restaurantID = restaurantID;
        this.totalPrice = totalPrice;
        this.status = status;
        this.placedAt = placedAt;
    }

    @Override
    public void calculateTotal() {
        System.out.println("Calculating the Total Price in Order Class");
    }

    @Override
    public void updateStatus(String status) {
        this.status = status;
        System.out.println("Updating the Order Status in Order Class");
    }
}
