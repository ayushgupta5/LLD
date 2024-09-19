public class Main {
    public static void main(String[] args) {
        // Create a rate limiter with a fixed window policy allowing 5 requests per 60 seconds
        RateLimitPolicy fixedWindowPolicy = new FixedWindowPolicy(5, 60);
        RateLimiter rateLimiter = new RateLimiter(fixedWindowPolicy);

        String userId = "user_123";

        // Simulate 10 requests
        for (int i = 0; i < 10; i++) {
            if (rateLimiter.isRequestAllowed(userId)) {
                System.out.println("Request " + (i + 1) + ": Allowed");
            } else {
                System.out.println("Request " + (i + 1) + ": Denied (Rate limit exceeded)");
            }

            // Simulate time delay (optional) to show window expiration in real scenarios
            try {
                Thread.sleep(1000);  // 1 second delay between requests
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}