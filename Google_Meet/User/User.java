package User;

public class User implements IUser {
    private int userID;
    private String name;
    private String email;
    private String role;


    public User(int userID, String name, String email, String role) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    @Override
    public void login() {
        System.out.println("User is Logging In");
    }

    @Override
    public void logOut() {
        System.out.println("User is Logging out");
    }

    @Override
    public void joinMeeting() {
        System.out.println("User is Joining the meeting");
    }

    @Override
    public void leaveMeeting() {
        System.out.println("User is Leaving the meeting");
    }
}
