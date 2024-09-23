package Services.User;

import Model.Photo;
import Model.User;

public class UserServices implements IUserServices {
    @Override
    public void register(User user) {
        System.out.println("User is Registering: " + user);
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In: " +user);
    }

    @Override
    public void followUser(User user1, User user2) {
        System.out.println("User : " +user1+ " is Following the User : " + user2);
    }

    @Override
    public void uploadPhoto(Photo photo) {
        System.out.println("User is Uploading the Photo: " + photo);
    }

    @Override
    public void viewPhoto(User user, Photo photo) {
        System.out.println("User : " + user + " is Viewing the Photo : " + photo);
    }

    @Override
    public void likePhoto(User user, Photo photo) {
        System.out.println("User : " +user+ " is Liking the Photo: " + photo);
    }
}
