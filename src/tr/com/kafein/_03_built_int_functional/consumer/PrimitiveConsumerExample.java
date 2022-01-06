package tr.com.kafein._03_built_int_functional.consumer;

import java.util.function.IntConsumer;

public class PrimitiveConsumerExample {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        IntConsumer ic = System.out::println;
        ic.accept(123);
    }
}
