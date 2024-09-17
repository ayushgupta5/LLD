package User;

public interface IUser {
    void register(String name, String email, String password);
    void login(String email, String password);
    void updateProfile(String name, String address, String phoneNumber);
    void logout(String name);
}
