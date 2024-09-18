package main;

import Customer.Customer;
import DeliveryAgent.DeliveryAgent;
import MenuItem.MenuItem;
import Order.Order;
import Payment.Payment;
import Restaurant.Restaurant;
import RestaurantOwner.RestaurantOwner;

import java.time.LocalDateTime;

public class ZomattoApp {
    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem(1, 1, "Dosa", 50.00);

        Restaurant restaurant = new Restaurant(1, "KFC", "DELHI", 5.00);
        restaurant.getMenu();
        restaurant.updateMenu(menuItem);

        RestaurantOwner restaurantOwner = new RestaurantOwner(1, "RestaurantOwnerName", "RestaurantOwner@gmail.com", "123", "Delhi", 1);
        restaurantOwner.manageRestaurant(restaurant);

        Customer customer = new Customer(1, "Kohli", "Kohli@gmail.com", "18", "Delhi");
        customer.login();
        customer.browseRestaurants();

        LocalDateTime currentTime = LocalDateTime.now();
        Order order = new Order(1, 1, 1, 18.00, "PROCESSING", currentTime);

        order.calculateTotal();
        order.updateStatus("Delivered");




        customer.placeOrder(order);
        customer.trackOrder(order.getOrderID());

        Payment payment = new Payment(1, 1, "UPI", "PROCESSING");
        payment.processPayment(500.00);
        payment.getPaymentStatus();
        payment.updatePaymentStatus("COMPLETED");

        DeliveryAgent deliveryAgent = new DeliveryAgent(1, "FanBoy", "fanBoy@gmail.com", "FanPhone", "Fan_Address");
        deliveryAgent.acceptOrder(order.getOrderID());
        deliveryAgent.updateDeliveryStatus(order.getOrderID(), "PROCESSING");
        deliveryAgent.trackAssignedOrder(order.getOrderID());

        customer.leaveReview(1, "Awesome");
        customer.logOut();
    }
}
