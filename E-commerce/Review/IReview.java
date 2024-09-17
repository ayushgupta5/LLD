package Review;

public interface IReview {
    void addReview(int productID, int userID, int rating, String comment);
    void getReviewsForProduct(int productID);
}
