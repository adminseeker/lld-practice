public class AWSCloudProvider implements CloudProviderFactory {
    
    @Override
    public FileStorage createFileStorage() {
        return new S3FileStorage();
    }

    @Override
    public MessageQueue createMessageQueue() {
        return new SQSMessageQueue();
    }
}
