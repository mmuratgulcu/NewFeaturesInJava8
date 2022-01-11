package tr.com.kafein._01_interfaces.diamond;

public abstract class DatabaseLogger {

    public void debug(String message) {
        System.out.println("DatabaseLogger Debug : " + message);
    }
}
