package tr.com.kafein._03_built_int_functional.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
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

        DoublePredicate doublePredicate = (double i) -> i > 5.3;
        System.out.println(doublePredicate.test(2.4));

        LongPredicate longPredicate = l -> {

            System.out.println("PI Kontrol");
            return l > Math.PI ? true : false;
        };
        System.out.println(longPredicate.test(4L));
    }
}
