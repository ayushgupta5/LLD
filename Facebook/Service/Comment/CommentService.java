package Service.Comment;
import Model.Comment;
import Model.User;
public class CommentService implements ICommentService{
    @Override
    public void replyToComment(User user, Comment comment, String ReplyCommentContent) {
        System.out.println("Allows a user to reply to a comment.");
    }
}
