package Reminder;

import java.time.LocalDateTime;

public class Reminder implements IReminder {
    private int reminderID;
    private LocalDateTime reminderTime;
    private int eventID;

    public Reminder(int reminderID, LocalDateTime reminderTime, int eventID) {
        this.reminderID = reminderID;
        this.reminderTime = reminderTime;
        this.eventID = eventID;
    }

    @Override
    public void sendReminder() {
        System.out.println("Sending the Reminder");
    }

}
