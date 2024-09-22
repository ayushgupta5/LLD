package Model;

public class FriendRequest {
    private int friendRequestID;
    private String status;

    public FriendRequest(int friendRequestID, String status) {
        this.friendRequestID = friendRequestID;
        this.status = status;
    }

    public int getFriendRequestID() {
        return friendRequestID;
    }

    public void setFriendRequestID(int friendRequestID) {
        this.friendRequestID = friendRequestID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
