package tr.com.kafein._03_built_int_functional.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimitivePredicateExample {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        IntPredicate intpredicate = (int i) -> i % 2 == 0;
        System.out.println(intpredicate.test(4));

        IntStream.range(1, 10).filter(intpredicate).forEach(System.out::println);
    }
}
