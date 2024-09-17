package Admin;

import Product.Product;
import User.User;

public class Admin extends User implements IAdmin {

    public Admin(int userID, String name, String email, String password, String address, String phoneNumber) {
        super(userID, name, email, password, address, phoneNumber);
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Added the Product from Admin: " + product);
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Updating the product from Admin: " + product);
    }

    @Override
    public void deleteProduct(int productID)  {
        System.out.println("Delete the Product from Admin with productID: " + productID);
    }

    @Override
    public void viewAllOrders() {
        System.out.println("Viewing all Orders by Admin");
    }

    @Override
    public void updateOrderStatus(int orderID, String status) {
        System.out.println("Updating the Order Status or OrderID: " + orderID + " with status: " + status);
    }

}
