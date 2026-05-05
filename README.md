# Campus Food Order System

## Project Description
This is a simple Java project that simulates a campus food ordering system. Students place orders and the system sends notifications (Email, SMS, Push).

In this homework, I improved the initial design by applying design patterns to make the code cleaner and easier to extend.

---

## Design Patterns Used

### Factory Pattern
I used the Factory Pattern to create notification objects without using multiple if-else statements in the main service class.  
This makes it easier to add new notification types in the future (for example, WhatsApp or Telegram).

### Singleton Pattern
I used the Singleton Pattern for the AppConfig class.  
This class stores shared information such as:
- University name  
- Delivery fee  

Using Singleton ensures that only one configuration object exists and is used everywhere.

---

## Project Structure
- Notification.java (interface)
- EmailNotification.java
- SmsNotification.java
- PushNotification.java
- NotificationFactory.java
- CampusFoodOrderService.java
- AppConfig.java

---

## How to Run
1. Open the project in IntelliJ IDEA
2. Run the CampusFoodOrderService class
3. Check the console output

---

## Example Output
The system prints:
- Order information
- Notification messages (Email, SMS, Push)

---

## Personal Note
While working on this project, I first struggled to understand how to separate object creation from the main logic. After implementing the Factory Pattern, I realized the code became much more organized. The Singleton Pattern also helped me manage shared data more clearly.

---

## Conclusion
This project shows how Factory and Singleton patterns improve code structure and maintainability. The system is now easier to expand and understand.
