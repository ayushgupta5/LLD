package Main;

import Model.Comment;
import Model.Post;
import Model.User;
import Service.Comment.CommentService;
import Service.Comment.ICommentService;
import Service.FriendRequest.FriendRequestService;
import Service.FriendRequest.IFriendRequestService;
import Service.Post.IPostService;
import Service.Post.PostService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class FaceBookApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "Kohli@gmail.com", "kohli@123");
        User user2 = new User(1, "Kohli", "Kohli@gmail.com", "kohli@123");
        IUserService userService = new UserService();
        userService.login(user1);
        userService.login(user2);
        userService.addFriend(user1, user2);
        userService.postStatus(user1);
        userService.sendMessage(user1, user2);
        userService.sendMessage(user2, user1);


        LocalDateTime currentTime = LocalDateTime.now();
        Post post = new Post(1, "Cricket", currentTime, "Kohli");
        Comment comment = new Comment(1, "Well Played Rishabh", currentTime);

        IPostService postService = new PostService();
        postService.likePost(user1, post);
        postService.commentPost(user1, post, comment);

        ICommentService commentService = new CommentService();
        commentService.replyToComment(user1, comment, "Good Performance");

        IFriendRequestService friendRequestService = new FriendRequestService();
        friendRequestService.acceptRequest(user1, user2);
        friendRequestService.rejectRequest(user1, user2);


        userService.logOut(user1);
        userService.logOut(user2);
    }
}
