package Product;

public interface IProduct {
    void addProduct(Product product);
    void updateProduct(int productID, String name, String description, double price, int quantity, String category);
    void removeProduct(int productID);
    void getProductDetail(int productID);
    void searchProduct(String query);
}
