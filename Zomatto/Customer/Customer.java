package Customer;

import User.User;
import Order.Order;

public class Customer extends User implements ICustomer  {

    public Customer(int userID, String name, String email, String phoneNumber, String address) {
        super(userID, name, email, phoneNumber, address);
    }

    @Override
    public void browseRestaurants() {
        System.out.println("Customer is browsing the Restaurants");
    }

    @Override
    public void placeOrder(Order order) {
        System.out.println("Customer is Placing the Order: " + order);
    }

    @Override
    public void trackOrder(int orderID) {
        System.out.println("Customer is Tracking the Order with order ID: " + orderID);
    }

    @Override
    public void leaveReview(int restaurantId, String review) {
        System.out.println("Customer is putting the review with RestaurantID: " + restaurantId + " with Review : " + review);
    }
}
