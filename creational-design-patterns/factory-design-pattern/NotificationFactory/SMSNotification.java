public class SMSNotification extends Notification{
    
    @Override
    public void notify(String text){
        System.out.println("SMS Notification Sent: "+text);
    }
}
