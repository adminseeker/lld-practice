public interface CloudProviderFactory {
    public FileStorage createFileStorage();
    public MessageQueue createMessageQueue();
}
