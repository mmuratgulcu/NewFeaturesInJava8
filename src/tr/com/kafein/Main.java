package tr.com.kafein;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Runnable#Lambda");
        runnable.run();

        runnable = () -> {
            System.out.println("Runnable#Lambda line1");
            System.out.println("Runnable#Lambda line2");
        };
    }
}
