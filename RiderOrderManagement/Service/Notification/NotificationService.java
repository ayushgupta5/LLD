package Service.Notification;

import Model.Notification.Notification;
import Model.Rider.Rider;

public class NotificationService implements INotificationService {
    @Override
    public void sendNotification(Rider rider, Notification notification) {
        System.out.println("Sending the Notification to Rider : " +rider.toString()+ " with this notification: "+ notification.toString());
    }
}
