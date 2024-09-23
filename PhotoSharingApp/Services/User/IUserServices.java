package Services.User;

import Model.Photo;
import Model.User;

public interface IUserServices {
    void register(User user);
    void login(User user);
    void followUser(User user1, User user2);
    void uploadPhoto(Photo photo);
    void viewPhoto(User user, Photo photo);
    void likePhoto(User user, Photo photo);
}
