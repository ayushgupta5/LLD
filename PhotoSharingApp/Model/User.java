package Model;

public class User {
    private int userID;
    private String userName;
    private String email;
    private String passwordHashed;
    private String profilePic;
    private String bio;

    public User(int userID, String userName, String email, String passwordHashed, String profilePic, String bio) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.passwordHashed = passwordHashed;
        this.profilePic = profilePic;
        this.bio = bio;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
