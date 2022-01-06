package tr.com.kafein._01_interfaces.diamond;

public interface MailLogger{

    void mailInfo(String message);

    default void debug(String message) {
        System.out.println("MailLogger Debug : " + message);
    }
}
