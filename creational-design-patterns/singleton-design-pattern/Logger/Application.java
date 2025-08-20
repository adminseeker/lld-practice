public class Application {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        logger1.log("message 1");
        logger1.log("message 2");
    }
}