package Restaurant;

import MenuItem.MenuItem;
import java.util.List;

public class Restaurant implements IRestaurant {
    private int restaurantID;
    private String name;
    private String location;
    private double rating;
    private List<MenuItem> menu;

    public Restaurant(int restaurantID, String name, String location, double rating) {
        this.restaurantID = restaurantID;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public List<MenuItem> getMenu() {
        System.out.println("Getting the Menu");
        return this.menu;
    }

    @Override
    public void updateMenu(MenuItem menuItem) {
        System.out.println("Updating the MenuItem: " + menuItem);
    }
}
