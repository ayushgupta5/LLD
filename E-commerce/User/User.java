package User;

public class User implements IUser {
    private int userID;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;

    public User(int userID, String name, String email, String password, String address, String phoneNumber) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void register(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        System.out.println("User is Registered successfully with Name: "+ name);
    }

    @Override
    public void login(String email, String password) {
        if(this.email == email && this.password == password) {
            System.out.println("User is Login successfully with Name: "+ name);
        }
        else {
            System.out.println("User is providing wrong password with Name: "+ name);
        }
    }

    @Override
    public void updateProfile(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

        System.out.println("User Profile Updated with Name: "+ name);
    }

    @Override
    public void logout(String name) {
        this.name=name;
        System.out.println("User is successfully Logged Out with Name: "+ name);
    }
}
