package Service.Admin;

import Model.Order.Order;
import Model.Rider.Rider;

public interface IAdminService {
    void assignOrderToRider(Order order, Rider rider);
    void viewRiderStatus();
}
