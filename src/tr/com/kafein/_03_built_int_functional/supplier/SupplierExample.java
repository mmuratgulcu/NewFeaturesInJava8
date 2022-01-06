package tr.com.kafein._03_built_int_functional.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier = () -> random.nextInt();
        Integer integer = supplier.get();

        System.out.println(integer);

        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        String time = currentDateTime.get();

        System.out.println(time);
    }
}
