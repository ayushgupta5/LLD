package channel;

import models.Notification;

public class SMSChannel implements Channel {
    private String smsGateWay;

    public SMSChannel(String smsGateWay) {
        this.smsGateWay = smsGateWay;
    }

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending SMS to " + notification.getUser().getPhoneNumber()
                + " with content: " + notification.getContent());
    }
}
