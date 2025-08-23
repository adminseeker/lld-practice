public interface ChatMediator {
    public void addUser(User user);
    public void broadcast(String message, User sender);
    public void sendTo(String message, User sender, User receiver);
}
