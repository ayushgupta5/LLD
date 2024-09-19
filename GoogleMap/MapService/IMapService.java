package MapService;

import Location.Location;

public interface IMapService {
    void displayMap();
    void setCenter(Location location);
    void zoomIn();
    void zoomOut();
}
