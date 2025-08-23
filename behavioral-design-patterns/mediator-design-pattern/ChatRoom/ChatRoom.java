import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom(){
        users=new ArrayList<>();
    }

    @Override
    public void broadcast(String message, User sender) {
        for(User user : users){
            if(user!=sender) user.receive(message,sender);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendTo(String message,User sender, User receiver) {
        receiver.receive(message,sender);
    }

}
