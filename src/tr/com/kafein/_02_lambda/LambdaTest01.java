package tr.com.kafein._02_lambda;

public class LambdaTest01 {
    public static void main(String[] args) {

       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("Runnable#Anonymous run!");
           }
       };
       runnable.run();

        Runnable runnableLambda = () -> System.out.println("Runnable#Lambda");
        runnableLambda.run();
    }
}
