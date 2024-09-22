package Service.User;

import Model.User;

public interface IUserService {
    void addFriend(User user1, User user2);
    void postStatus(User user);
    void sendMessage(User user1, User user2);
    void login(User user);
    void logOut(User user);
}
