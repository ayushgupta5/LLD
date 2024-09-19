package Marker;

import Location.Location;

public class Marker implements IMarker {
    Location location;

    public Marker(Location location, String restaurant) {
        this.location = location;
    }

    @Override
    public void addMarker(Location location) {
        System.out.println("Adding the Marker on the Map");
    }

    @Override
    public void removeMarker() {
        System.out.println("Remove the Marker");
    }

}
