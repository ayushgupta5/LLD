package main;

import Chat.Chat;
import Meeting.Meeting;
import Participant.Participant;
import Recording.Recording;
import User.User;

import java.time.LocalDateTime;

public class GoogleMeet_App {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        User user = new User(1, "Kohli", "kohli@gmail.com", "Participant");
        user.login();

        user.joinMeeting();


        Meeting meeting = new Meeting(1, user, "link", currentTime);
        meeting.scheduleMeeting();
        meeting.startMeeting();

        Participant participant = new Participant(1, user, meeting);
        participant.disableVideo();
        participant.enableAudio();
        participant.muteAudio();
        participant.unMuteAudio();

        Recording recording = new Recording(1, "filePath", currentTime);
        recording.startRecording();
        recording.stopRecording();
        Chat chat = new Chat(1, "Hey! How are you?", user, currentTime);
        chat.receiveMessage();
        chat.sendMessage();

        meeting.endMeeting();
        user.leaveMeeting();
        user.logOut();
    }
}
