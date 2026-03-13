public class NotificationFactory {
    
    public static Notification createNotification(String type){
        if(type==null) throw new IllegalArgumentException("Type cannot be null");;
        if(type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if(type.equalsIgnoreCase("Push")) return new PushNotification();
        if(type.equalsIgnoreCase("email")) return new EmailNotification();
        throw new IllegalArgumentException("Invalid Type!");
    }
}
