package Cart;

import Product.Product;
import java.util.HashMap;
import java.util.Map;

public class Cart implements ICart {
    private int cartID;
    private int userID;
    private Map<Product, Integer> cartItems;

    public Cart(int cartID, int userID, Map<Product, Integer> cartItems) {
        this.cartID = cartID;
        this.userID = userID;
        if (cartItems == null) {
            this.cartItems = new HashMap<>();
        } else {
            this.cartItems = cartItems;
        }
    }

    @Override
    public void addItemToCart(Product product, int quantity) {
        cartItems.put(product, quantity);
    }

    @Override
    public void removeItemFromCart(Product product) {
        cartItems.remove(product);
    }

    @Override
    public void updateItemQuantity(Product product, int quantity) {
        cartItems.put(product, quantity);
    }

    @Override
    public void getTotalAmount() {
        System.out.println("Getting the total Amount for that Particular Cart");
    }

    @Override
    public void getCartItems() {
        System.out.println("Getting the Items for that Particular Cart");
    }
}
