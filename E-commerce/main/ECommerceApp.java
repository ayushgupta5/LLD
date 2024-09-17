package main;

import Admin.Admin;
import Cart.Cart;
import Order.Order;
import Payment.Payment;
import Product.Product;
import Review.Review;
import User.User;

public class ECommerceApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com", "kohli@123", "kohliAddress", "kohli123");
        user.register("kohli", "kohli@gmail.com", "kohli@123");
        user.login("kohli@gmail.com", "kohli@123");

        user.updateProfile("Kohli", "Delhi", "KohliPhone");

        Admin admin = new Admin(1, "AdminName", "Admin@gmail.com", "Admin@123", "AdminAddress", "Admin999");
        admin.register("Admin", "Admin@gmail.com", "Admin@123");
        admin.login("Admin@gmail.com", "Admin@123");

        Product product = new Product(1, "MRF", "MRF_Description", 100.00, 1, "SPORTS");
        product.addProduct(product);
        product.updateProduct(1, "MRF", "MRF: Description", 100, 1, "BAT");
        product.getProductDetail(1);
        product.searchProduct("BAT");

        admin.addProduct(product);
        admin.updateProduct(product);
        admin.viewAllOrders();



        Cart cart = new Cart(1, 1, null);
        cart.addItemToCart(product, 3);
        cart.updateItemQuantity(product, 1);
        cart.getTotalAmount();
        cart.getCartItems();

        Order order = new Order(1, 1, 100, "Delhi", "PROCESSING");
        order.createOrder(1, null, "Delhi");
        order.getOrderDetails(1);
        order.updateOrderStatus(1, "DELIVERED");
        order.calculateTotalAmount();


        Payment payment = new Payment(1, 1, "UPI", "PROCESSING", 100.0f);
        payment.processPayment(100.00, "UPI");
        payment.getPaymentStatus(1);


        Review review = new Review(1, 1, 1, 5, "Awesome");
        review.addReview(1, 1, 5, "Awesome");
        review.getReviewsForProduct(1);





        user.logout("");

        product.removeProduct(1);

        cart.removeItemFromCart(product);

        admin.updateOrderStatus(1, "SOLD");

        admin.deleteProduct(1);


    }
}
