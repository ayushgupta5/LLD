package TrafficService;

public class TrafficService implements ITrafficService {

    @Override
    public void displayTraffic() {
        System.out.println("Displaying the Traffic on the Map");
    }

    @Override
    public void getTrafficInfo() {
        System.out.println("Retrieves current traffic data");
    }
}
