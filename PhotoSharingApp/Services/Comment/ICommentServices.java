package Services.Comment;

import Model.Comment;
import Model.Photo;

public interface ICommentServices {
    void addComment(Photo photo, Comment comment);
}
