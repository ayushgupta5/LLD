package Service.Comment;

import Model.Comment;
import Model.User;

public interface ICommentService {
    void replyToComment(User user, Comment comment, String ReplyCommentContent);
}
