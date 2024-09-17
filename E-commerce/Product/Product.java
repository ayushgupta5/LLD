package Product;

public class Product implements IProduct {
    private int productID;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;

    public Product(int productID, String name, String description, double price, int quantity, String category) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Adding the product :" + product);
    }

    @Override
    public void updateProduct(int productID, String name, String description, double price, int quantity, String category) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    @Override
    public void removeProduct(int productID) {
        System.out.println("Product is Removed with ProductID: " + productID);
    }

    @Override
    public void getProductDetail(int productID) {
        System.out.println("Viewing the Product Detail with productID: " + productID);
    }

    @Override
    public void searchProduct(String query) {
        System.out.println("Searching for the product with the given Query: " + query);
    }
}
