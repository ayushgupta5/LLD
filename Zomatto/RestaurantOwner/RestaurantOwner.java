package RestaurantOwner;

import Restaurant.Restaurant;
import MenuItem.MenuItem;
import User.User;

public class RestaurantOwner extends User implements IRestaurantOwner {
    private int restaurantID;

    public RestaurantOwner(int userID, String name, String email, String phoneNumber, String address, int restaurantID) {
        super(userID, name, email, phoneNumber, address);
        this.restaurantID = restaurantID;
    }

    @Override
    public void manageRestaurant(Restaurant restaurant) {
        System.out.println("Manage Restaurant by Restaurant Owner: " + restaurant);
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
        System.out.println("Restaurant Owner Adding few More Items: " +menuItem);
    }

    @Override
    public void updateMenuItem(MenuItem menuItem) {
        System.out.println("Restaurant Owner Updating the Items: " +menuItem);
    }
}
