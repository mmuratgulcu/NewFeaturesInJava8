package tr.com.kafein._04_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperators {

    public static void main(String[] args) {

    }

    public static void limit() {
        // Stream.of(1, 2, 3, 4, 5).limit(3).forEach(System.out::println).forEach(System.out::println);
    }

    public static void generate() {
        //infinite loop
        //Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
        Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
    }

    public static void iterate(){
        Stream<Integer> s = Stream.iterate(10, n -> n + 3);
        s.skip(3).limit(5).forEach(System.out::println);
    }

    public static void filter() {
        Predicate<String> p1 = (String str) -> str.startsWith("m");
        Stream<String> s1 = Stream.of("ahmet", "ali", "mehmet", "ayse", "murat");
        //s1.filter(p1).forEach(System.out::println);
        s1.filter(str -> str.startsWith("m")).forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 == 0).forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5).filter(x -> isEven(x)).forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5).filter(IntermediateOperators::isEven).forEach(System.out::println);
    }

    public static boolean isEven(int i) {
        return (i % 2) == 0;
    }

    public static void distinct() {
        Stream.of("a", "a", "b", "c", "c").distinct().forEach(System.out::println);
    }

    public static void map() {
        Stream.of(1, 2, 3, 4).map(i -> i * 2).forEach(System.out::println);

        //DoubleUnaryOperator duo = Math::sqrt;
        //double sumValue = DoubleStream.of(1.0 , 4 , 9.0).map(duo).peek(System.out::println).sum();
        double sumValue = DoubleStream.of(1.0 , 4 , 9.0).map(Math::sqrt).peek(System.out::println).sum();
        System.out.println(sumValue);
    }

    public static void peek() {
        IntStream.rangeClosed(0, 2).peek(x -> System.out.println("Data -> " + x)).
                map(x -> x + 1).forEach(x -> System.out.println("Güncel Data -> " + x));

    }

    public static void skip() {
        Stream.of("a", "a", "b", "c", "c").skip(2).forEach(System.out::println);
    }

    public static void sorted() {
        Stream.of("c", "T", "d", "B", "a", "z", "A").sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
        Stream.of("c", "T", "d", "B", "a", "z", "A").sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }

    public static void flatMap() {
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(one, two);
        animals.flatMap(x -> x.stream()).forEach(System.out::println);

        List<Integer[]> listArray = Arrays.asList(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6});
        listArray.stream().flatMap(array -> Arrays.stream(array)).forEach(System.out::println);

    }
}
