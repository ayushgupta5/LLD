package RestaurantOwner;

import MenuItem.MenuItem;
import Restaurant.Restaurant;

public interface IRestaurantOwner {
    void manageRestaurant(Restaurant restaurant);
    void addMenuItem(MenuItem menuItem);
    void updateMenuItem(MenuItem menuItem);
}
