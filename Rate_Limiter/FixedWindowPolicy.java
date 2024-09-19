import java.util.HashMap;
import java.util.Map;

public class FixedWindowPolicy implements RateLimitPolicy {
    private int maxRequests;
    private int timeWindowInSeconds;
    private Map<String, RateLimitInfo> userLimits;

    public FixedWindowPolicy(int maxRequests, int timeWindowInSeconds) {
        this.maxRequests = maxRequests;
        this.timeWindowInSeconds = timeWindowInSeconds;
        this.userLimits = new HashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String userID) {
        RateLimitInfo rateLimitInfo = userLimits.getOrDefault(userID, new RateLimitInfo(maxRequests, timeWindowInSeconds));

        if(rateLimitInfo.isLimitExceeded()) {
            return false;
        } else {
            rateLimitInfo.incrementRequestCount();
            userLimits.put(userID, rateLimitInfo);
            return true;
        }
    }
}
