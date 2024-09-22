package Service.Post;

import Model.Comment;
import Model.Post;
import Model.User;

public interface IPostService {
    void likePost(User user, Post post);
    void commentPost(User user, Post post, Comment comment);
}
