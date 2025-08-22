public class AuthHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        nextHandler=handler;
        return handler;
    }

    @Override
    public void handle(Request request) {
        if(request!=null && request.getUsername()!=null){
            System.out.println("Authentication Passed...");
            if(nextHandler!=null) nextHandler.handle(request);
        }else{
            throw new IllegalArgumentException("Authentication Failed!");
        }
    }
    
}
