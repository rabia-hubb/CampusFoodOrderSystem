public class EmailNotification implements Notification {
        @Override
        public void send(String studentName, String foodName) {
            System.out.println("Sending email notification...");
            System.out.println("Dear: " + studentName +
                    ", your order for " + foodName +
                    " has been received.");
        }
    }

