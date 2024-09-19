
public class RateLimiter {
    private RateLimitPolicy rateLimitPolicy;

    public RateLimiter(RateLimitPolicy rateLimitPolicy) {
        this.rateLimitPolicy = rateLimitPolicy;
    }

    public boolean isRequestAllowed(String userId) {
        return rateLimitPolicy.isRequestAllowed(userId);
    }
}
