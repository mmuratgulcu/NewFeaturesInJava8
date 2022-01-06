package tr.com.kafein._03_built_int_functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

//        test01();
//        System.out.println("*******************");
//        test02();
//        System.out.println("*******************");
//        test03();
        System.out.println("*******************");
        removeIf();

    }

    public static void test01(){
        Predicate<String> filterLetterH = (String str) -> str.startsWith("a");
        System.out.println(filterLetterH.test("hors"));
    }

    public static void test02(){
        Predicate<String> nullCheck = (String arg) -> arg != null;
        Predicate<String> emptyCheck = (String arg) -> arg.length()>0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);

        System.out.println(nullAndEmptyCheck.test(null));
        System.out.println(nullAndEmptyCheck.test(""));
        System.out.println(nullAndEmptyCheck.test("test"));
    }

    public static void test03(){
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p11 = (String x) -> {
            return x.isEmpty();
        };

        System.out.println(p1.test(""));
        System.out.println(p1.test("not empty"));
    }

    public static void removeIf(){
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");
        greeting.add("test");
        greeting.add("sample");

        greeting.removeIf(str -> str.startsWith("h"));

        System.out.println(greeting);
    }
}
