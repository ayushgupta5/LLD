package Services.Photo;

import Model.Comment;
import Model.Photo;

public class PhotoServices implements IPhotoServices {
    @Override
    public void upload(Photo photo) {
        System.out.println("User is Uploading the Photos");
    }

    @Override
    public void like(Photo photo) {
        System.out.println("User is liking the Photos");
    }

    @Override
    public void comment(Photo photo, Comment comment) {
        System.out.println("User is Commenting the Photos");
    }
}
