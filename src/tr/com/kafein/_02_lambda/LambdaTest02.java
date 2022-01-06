package tr.com.kafein._02_lambda;

public class LambdaTest02 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable#Anonymous line1");
                System.out.println("Runnable#Anonymous line2");
            }
        };
        runnable.run();

        Runnable runnableLambda = () -> {
            System.out.println("Runnable#Lambda line1");
            System.out.println("Runnable#Lambda line2");
        };
        runnableLambda.run();
    }
}
