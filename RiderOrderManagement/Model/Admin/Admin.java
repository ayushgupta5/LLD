package Model.Admin;

public class Admin {
    private int adminID;
    private String name;

    public Admin(int adminID, String name) {
        this.adminID = adminID;
        this.name = name;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                '}';
    }
}
