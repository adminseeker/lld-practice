public class AzureCloudProvider implements CloudProviderFactory {
    
    @Override
    public FileStorage createFileStorage() {
        return new AzureBlobStorage();
    }

    @Override
    public MessageQueue createMessageQueue() {
        return new AzureMessageQueue();
    }
}
