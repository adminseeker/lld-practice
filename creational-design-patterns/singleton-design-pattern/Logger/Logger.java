import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private Logger(){};

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance=new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = "[" + LocalDateTime.now().format(formatter) + "]";
        System.out.println(timestamp + " "+ message);
    }
}