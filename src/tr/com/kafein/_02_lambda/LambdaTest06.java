package tr.com.kafein._02_lambda;

public class LambdaTest06 {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Logger{
    void logger(String msg);
}

@FunctionalInterface
interface SmsLogger extends Logger{

}

@FunctionalInterface
interface DatabaseLogger extends Logger {

    @Override
    void logger(String msg);

}

@FunctionalInterface
interface MailLogger extends Logger{

    @Override
    void logger(String msg);

    default void send(String from, String to){
        System.out.println("Mail gönderildi");
    }
    static void forward(String from, String to){
        System.out.println("Mail iletildi");
    }
}

@FunctionalInterface
interface FileLogger extends Logger{

    @Override
    void logger(String msg);

    @Override
    String toString();
}
