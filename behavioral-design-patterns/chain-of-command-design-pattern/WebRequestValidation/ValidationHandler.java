public class ValidationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        nextHandler=handler;
        return nextHandler;
    }

    @Override
    public void handle(Request request) {
        if(request!=null && request.getData()!=null && !request.getData().isEmpty()){
            System.out.println("Data Validation Passed...");
        }else{
            throw new IllegalArgumentException("Data Validation Failed!");
        }
    }
    
}
