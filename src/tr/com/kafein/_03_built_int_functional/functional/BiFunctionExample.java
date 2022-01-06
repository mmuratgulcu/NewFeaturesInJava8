package tr.com.kafein._03_built_int_functional.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        BiFunction<String, String, String> concat = (String x, String y) -> x.concat(y);
        // R apply(T t, U u);

        System.out.println(concat.apply("key1", " key2"));

        // public String concat(String str)
        BiFunction<String, String, String> concat2 = String::concat;
    }

    public static void test02() {
        // public static int compare(double d1, double d2)
        BiFunction<Double, Double, Integer> bif1 = Double::compare;
        //
        // public int compareTo(Double anotherDouble)

        BiFunction<Double, Double, Integer> bif2 = Double::compareTo;
    }

    public static void test03() {        //Hata verecektir. Çünkü toUpperCase parametre almamaktadır.
        //Fakat function ile yapılabilir.
        //BiFunction<String, String, String> bifTest = String::toUpperCase;


    }
}
