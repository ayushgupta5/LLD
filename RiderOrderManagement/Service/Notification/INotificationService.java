package Service.Notification;

import Model.Notification.Notification;
import Model.Rider.Rider;

public interface INotificationService {
    void sendNotification(Rider rider, Notification notification);
}
