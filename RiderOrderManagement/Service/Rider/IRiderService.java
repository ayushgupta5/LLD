package Service.Rider;

import Model.Order.Order;

public interface IRiderService {
    void assignOrder(Order order);
    void updateStatus(String status);
}
