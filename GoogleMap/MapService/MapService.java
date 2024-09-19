package MapService;

import Location.Location;

public class MapService implements IMapService {
    private Location location;
    private int zoomLevel;

    public MapService() {
        this.zoomLevel = 1;
    }

    @Override
    public void displayMap() {
        System.out.println("Displaying the Map to the User");
    }

    @Override
    public void setCenter(Location location) {
        this.location = location;
        System.out.println("Setting the Centre");
    }

    @Override
    public void zoomIn() {
        System.out.println("Zoom In");
    }

    @Override
    public void zoomOut() {
        System.out.println("Zoom Out");
    }
}
