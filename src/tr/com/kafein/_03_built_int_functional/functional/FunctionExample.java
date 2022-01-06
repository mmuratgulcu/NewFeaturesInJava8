package tr.com.kafein._03_built_int_functional.functional;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        test04();
    }

    public static void test01(){
        Integer parsedValue;
        Function<String, Integer> length = String::length;
        parsedValue = length.apply("murat");
        System.out.println(parsedValue);
    }
    public static void test02(){
        Integer parsedValue;
        Function<String,Integer> f1 = str -> Integer.parseInt(str);
        Function<String, Integer> f2 = (String str) -> {
            return Integer.parseInt(str);
        };
        Function<String, Integer> f3 = Integer::parseInt;

        parsedValue = f1.apply("100");
        System.out.println(parsedValue);
    }
    public static void test03(){
        Integer parsedValue;
        Function<Integer,Integer> f1 = Math::abs;
        Function<Integer,Integer> f2 = number -> Math.abs(number);
        parsedValue = f2.apply(-3);
        System.out.println(parsedValue);
    }

    public static void test04(){
        // public String toUpperCase()
        Function<String, String> f1 = String::toUpperCase;
        Function<String, String> f2 = x -> x.toUpperCase();
        System.out.println(f1.apply("test"));
        // public char[] toCharArray() {
        Function<String, char[]> f3 = x -> x.toCharArray();
        Function<String, char[]> f4 = String::toCharArray;
        System.out.println(f3.apply("test"));

        //  public int length()
        Function<String, Integer> f5 = String::length;
        System.out.println("test");
    }
}
