package MenuItem;

public class MenuItem implements IMenuItem {
    private int menuItemID;
    private int restaurantID;
    private String name;
    private double price;

    public MenuItem(int menuItemID, int restaurantID, String name, double price) {
        this.menuItemID = menuItemID;
        this.restaurantID = restaurantID;
        this.name = name;
        this.price = price;
    }
}
