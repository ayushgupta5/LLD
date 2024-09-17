package Admin;

import Product.Product;

public interface IAdmin {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productID);
    void viewAllOrders();
    void updateOrderStatus(int orderID, String status);
}
