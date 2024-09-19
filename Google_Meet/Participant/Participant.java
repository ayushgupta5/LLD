package Participant;

import Meeting.Meeting;
import User.User;

public class Participant implements IParticipant {
    private int participantID;
    private User user;
    private Meeting meeting;

    public Participant(int participantID, User user, Meeting meeting) {
        this.participantID = participantID;
        this.user = user;
        this.meeting = meeting;
    }

    @Override
    public void muteAudio() {
        System.out.println("Participant is Muted the Audio");
    }

    @Override
    public void unMuteAudio() {
        System.out.println("Participant is unMuted the Audio");
    }

    @Override
    public void enableAudio() {
        System.out.println("Participant is Enabling the Audio");
    }

    @Override
    public void disableVideo() {
        System.out.println("Participants is Disabling the Video");
    }
}
