package Service.Admin;

import Model.Order.Order;
import Model.Rider.Rider;

public class AdminService implements IAdminService {
    @Override
    public void assignOrderToRider(Order order, Rider rider) {
        System.out.println("Assigning Order: "+order.toString() + " to Rider: " +rider.toString());
    }

    @Override
    public void viewRiderStatus() {
        System.out.println("View Rider Status");
    }
}
