package main;

import Calender.Calender;
import Event.Event;
import Invite.Invite;
import Reminder.Reminder;
import User.User;

import java.time.LocalDateTime;

public class GoogleCalenderApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com", "Kohli@123", "IST");
        user.register();
        user.login();
        user.updateProfile();

        Calender calender = new Calender(1, "CRICKET", 1);
        calender.createCalender();
        calender.shareCalender();

        Event event = new Event(1, "CRICKET", "CRICKET_DISCUSSION", "Delhi", true);
        event.createEvent();
        event.editEvent();

        Reminder reminder = new Reminder(1, LocalDateTime.now(), event.getEventID());

        reminder.sendReminder();

        Invite invite = new Invite(1, "kohli@gmail.com", 1);
        invite.sendInvite();

        calender.deleteCalender();
        event.deleteEvent();
    }
}
