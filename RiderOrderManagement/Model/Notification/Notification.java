package Model.Notification;

public class Notification {
    private int notificationID;
    private String message;

    public Notification(int notificationID, String message) {
        this.notificationID = notificationID;
        this.message = message;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationID=" + notificationID +
                ", message='" + message + '\'' +
                '}';
    }
}
