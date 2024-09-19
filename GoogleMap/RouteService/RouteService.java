package RouteService;

import Location.Location;

public class RouteService implements IRouteService {

    @Override
    public void calculateRoute(Location start, Location end) {
        System.out.println("Calculating the Route from " +start+ " to " + end);
    }
}
