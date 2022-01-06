package tr.com.kafein._03_built_int_functional.supplier;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class PrimitiveSupplierExample {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        Supplier<Integer> s1 = PrimitiveSupplierExample::getMyNumber;

        Random random = new Random();

        Supplier<Integer> s2 = random::nextInt;

        IntSupplier is1 = random::nextInt;

        IntSupplier is2 = PrimitiveSupplierExample::getMyNumber;


        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(is1.getAsInt());
        System.out.println(is2.getAsInt());
    }

    public static int getMyNumber() {
        return 100;
    }
}
