package tr.com.kafein._01_interfaces.diamond;

public class LogManager implements FileLogger,MailLogger{

    @Override
    public void fileInfo(String message) {

    }

    @Override
    public void mailInfo(String message) {

    }

    @Override
    public void debug(String message) {
        FileLogger.super.debug(message);
        MailLogger.super.debug(message);
    }

    public static void main(String[] args) {
        LogManager logManager = new LogManager();
        logManager.debug("Diamond Problem");
    }
    
}
