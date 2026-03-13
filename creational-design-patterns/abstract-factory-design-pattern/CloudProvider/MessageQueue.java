public interface MessageQueue {
    public void produce(String msg);    
    public void consume(String msg);    
}
