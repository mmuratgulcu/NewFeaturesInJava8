package tr.com.kafein._02_lambda;

public class LambdaTest04 {
    public static void main(String[] args) {

        Calculator calculator = (int number1, int number2) -> number1+ number2;

        Calculator calculator2 = (number1, number2) -> {
            System.out.println("Toplama İşlemi");
            return number1+ number2;
        };

        Calculator calculator3 = Integer::sum;
        Calculator calculator4 = (int number1, int number2) -> Integer.sum(number1,number2);

        int total;
        total = calculator3.operation(5,6);
        System.out.println(total);
    }
}

@FunctionalInterface
interface Calculator {
    int operation(int number1, int number2);
}

