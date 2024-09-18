package Invite;

public class Invite implements IInvite {
    private int inviteID;
    private String invitedUserEmail;
    private int eventID;

    public Invite(int inviteID, String invitedUserEmail, int eventID) {
        this.inviteID = inviteID;
        this.invitedUserEmail = invitedUserEmail;
        this.eventID = eventID;
    }

    @Override
    public void sendInvite() {
        System.out.println("Sending the Invite");
    }
}
