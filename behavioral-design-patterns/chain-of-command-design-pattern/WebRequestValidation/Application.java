public class Application {
    public static void main(String[] args) {
        Request request1 = new Request(null, "admin", "");
        Request request2 = new Request("bob", "guest", "");
        Request request3 = new Request("alice", "admin", "");
        Request request4 = new Request("john", "admin", "valid payload");

        
        Handler handlerChain = new AuthHandler();
        handlerChain.setNext(new RoleHandler())
                .setNext(new ValidationHandler());

        // handleRequest(request1, handlerChain);
        // handleRequest(request2, handlerChain);
        // handleRequest(request3, handlerChain);
        handleRequest(request4, handlerChain);

    }

    public static void handleRequest(Request request, Handler handler){
        try {
            handler.handle(request);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
