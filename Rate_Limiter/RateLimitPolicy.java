public interface RateLimitPolicy {
    boolean isRequestAllowed(String userID);
}
