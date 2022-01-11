package tr.com.kafein._01_interfaces.diamond;

public class LogManager extends DatabaseLogger implements FileLogger,MailLogger{

    @Override
    public void fileInfo(String message) {
        System.out.println("LogManager file info");
    }

    @Override
    public void mailInfo(String message) {
        System.out.println("LogManager mail info");
    }

    public static void main(String[] args) {
        LogManager logManager = new LogManager();
        logManager.debug("Diamond Problem");
        logManager.fileInfo("Diamond Problem");
        logManager.mailInfo("Diamond Problem");
    }
    
}
