package Cart;

import Product.Product;

public interface ICart {
    void addItemToCart(Product product, int quantity);
    void removeItemFromCart(Product product);
    void updateItemQuantity(Product product, int quantity);
    void getTotalAmount();
    void getCartItems();
}
