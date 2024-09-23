package Model;

public class Like {
    private int likeID;
    private int userID;
    private int photoID;

    public Like(int likeID, int userID, int photoID) {
        this.likeID = likeID;
        this.userID = userID;
        this.photoID = photoID;
    }

    public int getLikeID() {
        return likeID;
    }

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
