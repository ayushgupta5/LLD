package Service.Post;

import Model.Comment;
import Model.Post;
import Model.User;

public class PostService implements IPostService {
    @Override
    public void likePost(User user, Post post) {
        System.out.println("Allows users to like a post.");
    }

    @Override
    public void commentPost(User user, Post post, Comment comment) {
        System.out.println("Allows users to comment on the post.");
    }
}
