package Main;

import channel.EmailChannel;
import channel.SMSChannel;
import models.Notification;
import models.User;
import services.NotificationManager;

public class NotificationSystemApp {
    public static void main(String[] args) {
        // Create a user
        User user = new User("001", "John Doe", "john.doe@example.com", "1234567890");

        // Create different channels
        EmailChannel emailChannel = new EmailChannel("SMTP config");
        SMSChannel smsChannel = new SMSChannel("SMS Gateway");

        // Create notifications
        Notification emailNotification = new Notification("N001", "Email content", user, emailChannel);
        Notification smsNotification = new Notification("N002", "SMS content", user, smsChannel);

        // Create a notification manager
        NotificationManager notificationManager = new NotificationManager();

        // Send email notification
        notificationManager.scheduleNotification(emailNotification);

        // Send SMS notification
        notificationManager.scheduleNotification(smsNotification);
    }
}
