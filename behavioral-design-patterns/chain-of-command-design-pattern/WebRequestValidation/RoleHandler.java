public class RoleHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        nextHandler=handler;
        return nextHandler;
    }

    @Override
    public void handle(Request request) {
        if(request!=null && request.getRole()!=null && request.getRole().equals("admin")){
            System.out.println("Admin Authorization Passed...");
            if(nextHandler!=null) nextHandler.handle(request);
        }else{
            throw new IllegalArgumentException("Authorization Failed!");
        }
    }
    
}
