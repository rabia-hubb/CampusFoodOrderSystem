public class PushNotification implements Notification {
    @Override
    public void send(String studentName, String foodName) {
        System.out.println("Sending push notification...");
        System.out.println("New notification: Your " + foodName +
                " order is being prepared.");
    }
}