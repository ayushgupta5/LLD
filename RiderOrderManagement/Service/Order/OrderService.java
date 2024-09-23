package Service.Order;

import Model.Rider.Rider;

public class OrderService implements IOrderService {
    @Override
    public void assignRider(Rider rider) {
        System.out.println("Assiging the Rider: " + rider.toString());
    }

    @Override
    public void updateOrderStatus(String status) {
        System.out.println("Updating the Order Status with status: "+status);
    }
}
