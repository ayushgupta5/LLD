package Customer;

import Order.Order;

public interface ICustomer {
    void browseRestaurants();
    void placeOrder(Order order);
    void trackOrder(int orderID);
    void leaveReview(int restaurantId, String review);
}
