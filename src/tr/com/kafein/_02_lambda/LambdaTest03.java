package tr.com.kafein._02_lambda;

public class LambdaTest03 {
    public static void main(String[] args) {

        Message lambda1 = (String message) -> System.out.println(message);
        Message lambda2 = (message) -> System.out.println(message);
        Message lambda3 = message -> System.out.println(message);

        Message lamMessage =  System.out::println;

    }
}

@FunctionalInterface
interface Message {
    void printMessage(String message);
}
