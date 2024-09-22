package Service.User;

import Model.User;

public class UserService implements IUserService {
    @Override
    public void addFriend(User user1, User user2) {
        System.out.println("Sends a friend request to another user.");
    }

    @Override
    public void postStatus(User user) {
        System.out.println("Allows the user to post a status.");
    }

    @Override
    public void sendMessage(User user1, User user2) {
        System.out.println("Sends a direct message to another user.");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In");
    }

    @Override
    public void logOut(User user) {
        System.out.println("User is Logging Off");
    }
}
