package Services.Comment;

import Model.Comment;
import Model.Photo;

public class CommentServices implements ICommentServices {
    @Override
    public void addComment(Photo photo, Comment comment) {
        System.out.println("Comment is Added on Photo : " +photo+ " and Comment: " +comment);
    }
}
