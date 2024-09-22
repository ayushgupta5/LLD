package Model;

import java.time.LocalDateTime;

public class Comment {
    private int commentID;
    private String content;
    private LocalDateTime createdAt;

    public Comment(int commentID, String content, LocalDateTime createdAt) {
        this.commentID = commentID;
        this.content = content;
        this.createdAt = createdAt;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
