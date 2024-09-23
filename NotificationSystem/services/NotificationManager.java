package services;

import models.Notification;

public class NotificationManager {

    // Method to send notification
    public void scheduleNotification(Notification notification) {
        // Here we could add scheduling logic, but for now, we will send the notification immediately
        notification.send();
    }

    // Retry mechanism can be implemented here if a notification fails
    public void retryFailedNotifications() {
        System.out.println("Retrying failed notifications...");
    }
}
