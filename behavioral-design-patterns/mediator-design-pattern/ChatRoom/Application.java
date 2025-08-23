public class Application {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("user1", chatRoom);
        User user2 = new User("user2", chatRoom);
        User user3 = new User("user3", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendAll("Hello All!");

        user2.sendTo("Hey!",user1);
        user1.sendTo("Sup?",user2);

    }
}
