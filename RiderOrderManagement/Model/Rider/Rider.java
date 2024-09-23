package Model.Rider;

public class Rider {
    private int riderID;
    private String name;
    private String status;
    private String currentLocation;

    public Rider(int riderID, String name, String status, String currentLocation) {
        this.riderID = riderID;
        this.name = name;
        this.status = status;
        this.currentLocation = currentLocation;
    }

    public int getRiderID() {
        return riderID;
    }

    public void setRiderID(int riderID) {
        this.riderID = riderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "riderID=" + riderID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                '}';
    }
}
