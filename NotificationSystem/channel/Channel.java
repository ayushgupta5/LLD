package channel;

import models.Notification;

public interface Channel {
    void sendNotification(Notification notification);
}
