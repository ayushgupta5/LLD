package Model;

import java.time.LocalDateTime;

public class Post {
    private int postID;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public Post(int postID, String content, LocalDateTime createdAt, String author) {
        this.postID = postID;
        this.content = content;
        this.createdAt = createdAt;
        this.author = author;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
