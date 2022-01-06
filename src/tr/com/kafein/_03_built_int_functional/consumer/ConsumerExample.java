package tr.com.kafein._03_built_int_functional.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        test01();

    }

    public static void test01(){
        Consumer<String> printString = str -> System.out.println(str);
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());

        printString.accept("JaVa");
        printLowerCase.accept("LOWER CASE");
        printUpperCase.accept("upper case");
    }
}
