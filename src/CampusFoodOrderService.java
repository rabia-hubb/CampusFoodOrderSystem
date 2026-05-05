public class CampusFoodOrderService {

    public void placeOrder(String studentName, String foodName, String notificationType) {

        System.out.println("Order created for: " + studentName);
        System.out.println("Food: " + foodName);
        AppConfig config = AppConfig.getInstance();
        System.out.println("Delivery fee: " + config.getDeliveryFee() + " TL");
        System.out.println("University: " + config.getUniversityName());
        Notification notification = NotificationFactory.createNotification(notificationType);

        if (notification != null) {
            notification.send(studentName, foodName);
        } else {
            System.out.println("Unknown notification type.");
        }
    }

    public static void main(String[] args) {

        CampusFoodOrderService service = new CampusFoodOrderService();

        service.placeOrder("Baran", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Rabia", "Vegetarian Pizza", "SMS");
        service.placeOrder("Sanslı", "Coffee", "PUSH");
    }
}