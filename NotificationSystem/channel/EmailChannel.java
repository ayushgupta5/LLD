package channel;

import models.Notification;

public class EmailChannel implements Channel {

    private String smtpConfig;
    public EmailChannel(String smtpConfig) {
        this.smtpConfig = smtpConfig;
    }


    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending Email to " + notification.getUser().getEmail()
                + " with content: " + notification.getContent());
    }
}
