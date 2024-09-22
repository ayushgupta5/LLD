package Model;

import java.time.LocalDateTime;

public class Message {
    private int messageID;
    private String content;
    private LocalDateTime sentAt;

    public Message(int messageID, String content, LocalDateTime sentAt) {
        this.messageID = messageID;
        this.content = content;
        this.sentAt = sentAt;
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
