public class Application {
    public static void main(String[] args) {
        
        //AWS
        CloudProviderFactory cloudProvider = new AWSCloudProvider();
        FileStorage fileStorage = cloudProvider.createFileStorage();
        fileStorage.upload("test.txt");
        fileStorage.download("test.txt");
        MessageQueue messageQueue = cloudProvider.createMessageQueue();
        messageQueue.produce("Hello World!");
        messageQueue.consume("Hello World!");

        //Azure
        cloudProvider = new AzureCloudProvider();
        fileStorage = cloudProvider.createFileStorage();
        fileStorage.upload("test.txt");
        fileStorage.download("test.txt");
        messageQueue = cloudProvider.createMessageQueue();
        messageQueue.produce("Hello World!");
        messageQueue.consume("Hello World!");

    }
}
