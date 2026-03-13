public class SQSMessageQueue implements MessageQueue{
    @Override
    public void produce(String msg) {
        System.out.println("Message Produced by AWS SQS: "+msg);        
    }

    @Override
    public void consume(String msg) {
        System.out.println("Message Consumed from AWS SQS: "+msg);  
    }

}