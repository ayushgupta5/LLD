package Order;

import Product.Product;

import java.util.List;

public interface IOrder {
    void createOrder(int userID, List<Product> products, String shippingAddress);
    void getOrderDetails(int oderID);
    void updateOrderStatus(int orderID, String status);
    void calculateTotalAmount();

}
