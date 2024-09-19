package Meeting;

import User.User;
import java.time.LocalDateTime;

public class Meeting implements IMeeting {
    private int meetingID;
    private User host;
    private String meetingLink;
    private LocalDateTime date;

    public Meeting(int meetingID, User host, String meetingLink, LocalDateTime date) {
        this.meetingID = meetingID;
        this.host = host;
        this.meetingLink = meetingLink;
        this.date = date;
    }

    @Override
    public void scheduleMeeting() {
        System.out.println("Schedule the meeting");
    }

    @Override
    public void startMeeting() {
        System.out.println("Start the meeting");
    }

    @Override
    public void endMeeting() {
        System.out.println("Ending the meeting");
    }
}
