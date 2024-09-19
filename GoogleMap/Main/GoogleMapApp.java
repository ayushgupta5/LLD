package Main;

import Location.Location;
import MapService.MapService;
import RouteService.RouteService;
import Marker.Marker;
import TrafficService.TrafficService;
import MapLayer.MapLayer;

public class GoogleMapApp {
    public static void main(String[] args) {
        // Create some locations
        Location location1 = new Location(37.7749, -122.4194, "San Francisco");
        Location location2 = new Location(34.0522, -118.2437, "Los Angeles");

        // MapService usage
        MapService mapService = new MapService();
        mapService.setCenter(location1);
        mapService.displayMap();
        mapService.zoomIn();
        mapService.zoomOut();

        // RouteService usage
        RouteService routeService = new RouteService();
        routeService.calculateRoute(location1, location2);

        // Marker usage
        Marker marker = new Marker(location1, "Restaurant");
        marker.addMarker(location1);
        marker.removeMarker();

        // TrafficService usage
        TrafficService trafficService = new TrafficService();
        trafficService.displayTraffic();
        trafficService.getTrafficInfo();

        // MapLayer usage
        MapLayer satelliteLayer = new MapLayer("Satellite");
        satelliteLayer.enableLayer();
        satelliteLayer.disableLayer();
    }
}
