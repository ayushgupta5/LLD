package User;

public class User implements IUser {
    private int userID;
    private String name;
    private String email;
    private String passwordHashed;
    private String timeZone;

    public User(int userID, String name, String email, String passwordHashed, String timeZone) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.passwordHashed = passwordHashed;
        this.timeZone = timeZone;
    }

    @Override
    public void login() {
        System.out.println("User is Logging In");
    }

    @Override
    public void register() {
        System.out.println("User is Registering");
    }

    @Override
    public void updateProfile() {
        System.out.println("User is updating the Profile");
    }
}
