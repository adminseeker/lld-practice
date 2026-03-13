public class AzureMessageQueue implements MessageQueue{
    @Override
    public void produce(String msg) {
        System.out.println("Message Produced by Azure Message Queue: "+msg);        
    }

    @Override
    public void consume(String msg) {
        System.out.println("Message Consumed from Azure Message Queue: "+msg);  
    }

}