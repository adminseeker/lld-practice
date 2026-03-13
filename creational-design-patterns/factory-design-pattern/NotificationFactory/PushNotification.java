public class PushNotification extends Notification{
    
    @Override
    public void notify(String text){
        System.out.println("Push Notification Sent: "+text);
    }
}
