# Notification System

This project is a simple **Notification System** designed using **SOLID principles** and the **Strategy Design Pattern**. The system allows sending notifications via multiple channels such as email and SMS. It can be easily extended to add new notification channels like push notifications.

## Features

- Send notifications via different channels (Email, SMS).
- Extensible system: Easily add new channels without modifying existing code.
- Follows **SOLID principles** ensuring good software design practices:
    - **Single Responsibility Principle (SRP)**
    - **Open/Closed Principle (OCP)**
    - **Liskov Substitution Principle (LSP)**
    - **Interface Segregation Principle (ISP)**
    - **Dependency Inversion Principle (DIP)**

## Design

The system uses the **Strategy Pattern** to allow different strategies (email, SMS) for sending notifications. The core of the system is based on the following components:

- `Notification`: Represents a notification that can be sent via a specific channel.
- `Channel` (interface): Defines the contract for sending notifications.
- `EmailChannel` & `SMSChannel`: Implement the `Channel` interface to send notifications via email or SMS, respectively.
- `NotificationManager`: Manages the scheduling and sending of notifications.

### Class Diagram

```plaintext
+----------------------------------------+
|              Channel                   |
|----------------------------------------|
| <<Interface>>                          |
| + sendNotification(notification:       |
|   Notification): void                  |
+----------------------------------------+
                  ^
                  |
  +--------------------------------------+ 
  |                                      |
+--------------------+         +--------------------+
|    EmailChannel    |         |    SMSChannel      |
+--------------------+         +--------------------+
| - smtpConfig: String|         | - smsGateway: String|
+--------------------+         +--------------------+
| + sendNotification(notification:  | + sendNotification(notification:  |
|   Notification): void             |   Notification): void             |
+--------------------+         +--------------------+

+--------------------------------------+
|            Notification              |
+--------------------------------------+
| - notificationId: String             |
| - content: String                    |
| - user: User                         |
| - channel: Channel                   |
+--------------------------------------+
| + send(): void                       |
+--------------------------------------+

+--------------------------------------+
|               User                   |
+--------------------------------------+
| - userId: String                     |
| - name: String                       |
| - email: String                      |
| - phoneNumber: String                |
+--------------------------------------+
| + getEmail(): String                 |
| + getPhoneNumber(): String           |
+--------------------------------------+

+--------------------------------------+
|       NotificationManager            |
+--------------------------------------+
| + scheduleNotification(notification: |
|   Notification): void                |
| + retryFailedNotifications(): void   |
+--------------------------------------+
