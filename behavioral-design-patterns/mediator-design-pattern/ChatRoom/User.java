public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator){
        this.name=name;
        this.chatMediator=chatMediator;
    }

    public String getName(){
        return name;
    }

    public void sendAll(String message){
        System.out.println(this.getName()+" Brodcasting to all: "+message);
        chatMediator.broadcast(message,this);
    }

    public void sendTo(String message,User user){
        System.out.println(this.getName()+" sending to "+user.getName()+": "+message);
        chatMediator.sendTo(message,this,user);
    }

    public void receive(String message, User sender){
        System.out.println(this.getName()+" received from "+sender.getName()+": "+message);
    }
}
