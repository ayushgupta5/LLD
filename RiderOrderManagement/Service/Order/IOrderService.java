package Service.Order;

import Model.Rider.Rider;

public interface IOrderService {
    void assignRider(Rider rider);
    void updateOrderStatus(String status);
}
