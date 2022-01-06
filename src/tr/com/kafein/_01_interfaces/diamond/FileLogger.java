package tr.com.kafein._01_interfaces.diamond;

public interface FileLogger {

    void fileInfo(String message);

    default void debug(String message) {
        System.out.println("FileLogger Debug : " + message);
    }
}
