package Model;

import Enum.PrivacyEnum;

import java.time.LocalDateTime;

public class Photo {
    private int photoID;
    private String caption;
    private String photoUrl;
    private PrivacyEnum privacyEnum;
    private LocalDateTime uploadTime;

    public Photo(int photoID, String caption, String photoUrl, PrivacyEnum privacyEnum, LocalDateTime uploadTime) {
        this.photoID = photoID;
        this.caption = caption;
        this.photoUrl = photoUrl;
        this.privacyEnum = privacyEnum;
        this.uploadTime = uploadTime;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public PrivacyEnum getPrivacyEnum() {
        return privacyEnum;
    }

    public void setPrivacyEnum(PrivacyEnum privacyEnum) {
        this.privacyEnum = privacyEnum;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }
}
