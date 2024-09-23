package Main;

import Model.Admin.Admin;
import Model.Notification.Notification;
import Model.Order.Order;
import Model.Rider.Rider;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Notification.INotificationService;
import Service.Notification.NotificationService;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Rider.IRiderService;
import Service.Rider.RiderService;

public class RiderOrderManagementApp {
    public static void main(String[] args) {
        Rider rider = new Rider(1, "RiderName", "Started", "Delhi");
        Order order = new Order(1, "Kohli", "Delhi", "LKO", "Processing");
        Admin admin = new Admin(1, "AdminName");
        Notification notification = new Notification(1, "Awesome");

        IOrderService orderService = new OrderService();
        orderService.assignRider(rider);
        orderService.updateOrderStatus("Delivered");

        IRiderService riderService = new RiderService();
        riderService.assignOrder(order);
        riderService.updateStatus("Completed");

        IAdminService adminService = new AdminService();
        adminService.assignOrderToRider(order, rider);
        adminService.viewRiderStatus();

        INotificationService notificationService = new NotificationService();
        notificationService.sendNotification(rider, notification);
    }
}
