package Main;

import Model.Comment;
import Model.Like;
import Model.Photo;
import Model.User;
import Services.Comment.CommentServices;
import Services.Comment.ICommentServices;
import Services.Like.ILikeServices;
import Services.Like.LikeServices;
import Services.Photo.IPhotoServices;
import Services.Photo.PhotoServices;
import Services.User.IUserServices;
import Services.User.UserServices;
import Enum.PrivacyEnum;

import java.time.LocalDateTime;

public class PhotoSharingApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "Kohli@gmail.com", "pass", "kohliPicture", "KohliBio");
        User user2 = new User(2, "Rohit", "Rohit@gmail.com", "pass", "RohitPicture", "RohitBio");
        IUserServices userServices = new UserServices();
        userServices.register(user1);
        userServices.login(user1);

        userServices.register(user2);
        userServices.login(user2);

        userServices.followUser(user1, user2);


        LocalDateTime currentTime = LocalDateTime.now();
        Photo photo = new Photo(1, "Trip", "Url", PrivacyEnum.PUBLIC, currentTime);
        userServices.uploadPhoto(photo);
        userServices.viewPhoto(user1, photo);
        userServices.likePhoto(user1, photo);

        userServices.viewPhoto(user2, photo);
        userServices.likePhoto(user1, photo);

        IPhotoServices photoServices = new PhotoServices();
        photoServices.upload(photo);
        photoServices.like(photo);

        Comment comment = new Comment(1, 1, 1, "Awesome");

        photoServices.comment(photo, comment);

        ICommentServices commentServices = new CommentServices();
        commentServices.addComment(photo, comment);

        Like like = new Like(1, 1, 1);
        ILikeServices likeServices = new LikeServices();
        likeServices.likePhoto(photo, like);

    }
}
