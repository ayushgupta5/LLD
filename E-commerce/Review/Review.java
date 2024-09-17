package Review;

public class Review implements IReview {
    private int reviewID;
    private int userID;
    private int productID;
    private int rating;
    private String comment;

    public Review(int reviewID, int userID, int productID, int rating, String comment) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.productID = productID;
        this.rating = rating;
        this.comment = comment;
    }

    @Override
    public void addReview(int productID, int userID, int rating, String comment) {
        this.productID=productID;
        this.userID=userID;
        this.rating=rating;
        this.comment=comment;
    }

    @Override
    public void getReviewsForProduct(int productID) {
        System.out.println("Getting the Reviews for the productID: " + productID);
    }
}
