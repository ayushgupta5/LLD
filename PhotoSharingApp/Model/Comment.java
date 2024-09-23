package Model;

public class Comment {
    private int commentID;
    private int userID;
    private int photoID;
    private String comment;

    public Comment(int commentID, int userID, int photoID, String comment) {
        this.commentID = commentID;
        this.userID = userID;
        this.photoID = photoID;
        this.comment = comment;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
