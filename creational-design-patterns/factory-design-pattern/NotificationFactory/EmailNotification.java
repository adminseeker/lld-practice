public class EmailNotification extends Notification{
    
    @Override
    public void notify(String text){
        System.out.println("Email Notification Sent: "+text);
    }
}
