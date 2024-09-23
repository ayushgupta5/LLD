package Services.Photo;

import Model.Comment;
import Model.Photo;

public interface IPhotoServices {
    void upload(Photo photo);
    void like(Photo photo);
    void comment(Photo photo, Comment comment);
}
