package tr.com.kafein._03_built_int_functional.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        test02();

    }

    public static void test01(){

        //BiPredicate<List<Integer>, Integer> bip = (List<Integer> list, Integer i) -> list.contains(i);

        BiPredicate<List<Integer>, Integer> listContains = List::contains;

        List<Integer> aList = Arrays.asList(10, 20, 30);
        System.out.println("Listede Bulundu : " + listContains.test(aList, 20));
    }

    public static void test02(){

        //BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (String x , String y) -> x.startsWith(y);

        System.out.println(b2.test("hello", "h"));
        System.out.println(b2.test("java", "ja"));
    }
}
