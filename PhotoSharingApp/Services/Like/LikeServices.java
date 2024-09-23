package Services.Like;

import Model.Like;
import Model.Photo;

public class LikeServices implements ILikeServices {
    @Override
    public void likePhoto(Photo photo, Like like) {
        System.out.println("User is Liking the Photo: " +photo+ " Like: "+like);
    }
}
