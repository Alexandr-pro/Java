package HW_2;


    import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class task_2 {
    public static void main(String arg[]) {
        PrintWriter log;
        FileWriter logFile;
        
        try {
            logFile = new FileWriter("exceptions.log", true);
            log = new PrintWriter((java.io.Writer)logFile);
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        try {
       
        
            throw new Exception();
        } catch (Exception ex) {
       
            log.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
            ex.printStackTrace(log);
            log.flush();
        }
    }
}

