public class Application {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("sms");
        notification.notify("Hello World!");

        notification = NotificationFactory.createNotification("email");
        notification.notify("Hello World!");

        notification = NotificationFactory.createNotification("push");
        notification.notify("Hello World!");
    }
}
