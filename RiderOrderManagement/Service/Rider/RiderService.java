package Service.Rider;

import Model.Order.Order;

public class RiderService implements IRiderService {

    @Override
    public void assignOrder(Order order) {
        System.out.println("Assigning the Order: " +order.toString());
    }

    @Override
    public void updateStatus(String status) {
        System.out.println("Update the Rider status with status: " +status);
    }
}
