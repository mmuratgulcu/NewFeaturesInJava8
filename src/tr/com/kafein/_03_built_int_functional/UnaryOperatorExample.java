package tr.com.kafein._03_built_int_functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
        System.out.println("Before: " + ell);

        // public static int abs(int a)
        UnaryOperator<Integer> f3 = Math::abs;

        ell.replaceAll(f3);
        System.out.println("After: " + ell);
    }
}
