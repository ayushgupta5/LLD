package Location;

public class Location implements ILocation {
    private double latitude;
    private double longitude;
    private String name;


    public Location(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    @Override
    public String getCoordinates() {
        return "(" + latitude + ", " + longitude + ")";
    }
}
