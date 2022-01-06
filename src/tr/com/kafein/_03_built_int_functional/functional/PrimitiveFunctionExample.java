package tr.com.kafein._03_built_int_functional.functional;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunctionExample {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        Function<Integer,Integer> f1 = number -> Math.abs(number);
        Function<Integer, Integer> f2 = Math::abs;
        IntFunction<Integer> f3 = Math::abs;

        System.out.println(f1.apply(-20));
        System.out.println(f2.apply(-20));
        System.out.println(f3.apply(-20));

    }
}
