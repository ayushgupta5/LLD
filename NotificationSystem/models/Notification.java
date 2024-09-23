package models;

import channel.Channel;

public class Notification {
    private String notificationID;
    private String content;
    private User user;
    private Channel channel;

    public Notification(String notificationID, String content, User user, Channel channel) {
        this.notificationID = notificationID;
        this.content = content;
        this.user = user;
        this.channel = channel;
    }

    public void send() {
        channel.sendNotification(this);
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }
}
