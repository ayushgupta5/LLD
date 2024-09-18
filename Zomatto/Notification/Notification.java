package Notification;

public class Notification implements INotification {
    private int notificationID;
    private int userID;
    private String message;

    public Notification(int notificationID, int userID, String message) {
        this.notificationID = notificationID;
        this.userID = userID;
        this.message = message;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending the Notification with this message " + message);
    }
}
