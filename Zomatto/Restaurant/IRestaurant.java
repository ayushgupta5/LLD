package Restaurant;

import MenuItem.MenuItem;

import java.util.List;

public interface IRestaurant {
    List<MenuItem> getMenu();
    void updateMenu(MenuItem menuItem);
}
