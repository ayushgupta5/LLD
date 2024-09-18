package User;

public class User implements IUser {
    private int userID;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public User(int userID, String name, String email, String phoneNumber, String address) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public void login() {
        System.out.println("User is Logging in");
    }

    @Override
    public void logOut() {
        System.out.println("User is Logging Out");
    }
}
