public class Investor {
    private String name;
    private Notification notification;

    public Investor(String name,Notification notification){
        this.name=name; 
        this.notification=notification;
    }

    public String getName() {
        return name;
    }

    public Notification getNotification() {
        return notification;
    }
}
