public class RateLimitInfo {
    private int maxRequest;
    private int requestCount;
    private long windowStartTime;
    private int timeWindowInSeconds;

    public RateLimitInfo(int maxRequest, int timeWindowInSeconds) {
        this.maxRequest = maxRequest;
        this.requestCount = 0;
        this.windowStartTime = System.currentTimeMillis();
        this.timeWindowInSeconds = timeWindowInSeconds;
    }
    private boolean isWidowExpired() {
        long currentTime=System.currentTimeMillis();
        return (currentTime - windowStartTime)/1000 > timeWindowInSeconds;
    }

    public void resetWindow() {
        this.windowStartTime = System.currentTimeMillis();
        this.requestCount=0;
    }

    public void incrementRequestCount() {
        if(isWidowExpired()) {
            resetWindow();
        }
        requestCount++;
    }
    public boolean isLimitExceeded() {
        if(isWidowExpired()) {
            resetWindow();
        }
        return requestCount >= maxRequest;
    }
}
