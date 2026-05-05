# Campus Food Order System

Prepared by: Rabia Günen

This is a simple Java project that simulates a campus food ordering system. Students place orders and the system sends notifications (Email, SMS, Push).

In this homework, I improved the initial design by applying design patterns to make the code cleaner and easier to extend.

---

I used the Factory Pattern to create notification objects without using multiple if-else statements in the main service class.  
This makes it easier to add new notification types in the future (for example, WhatsApp or Telegram).

I used the Singleton Pattern for the AppConfig class.  
This class stores shared information such as:
- University name  
- Delivery fee  

Using Singleton ensures that only one configuration object exists and is used everywhere.

---

- Notification.java (interface)
- EmailNotification.java
- SmsNotification.java
- PushNotification.java
- NotificationFactory.java
- CampusFoodOrderService.java
- AppConfig.java

---

1. Open the project in IntelliJ IDEA
2. Run the CampusFoodOrderService class
3. Check the console output
4. ![output](IMG_0166.JPG)
---

The system prints:
- Order information
- Notification messages (Email, SMS, Push)

---

While working on this project, I had some difficulty understanding how design patterns work. At first, I also forgot to make the constructor private in the AppConfig class, but I fixed it later. After finishing the project, I understood how Factory and Singleton patterns make the code more organized.

---

This project shows how Factory and Singleton patterns improve code structure and maintainability. The system is now easier to expand and understand.
