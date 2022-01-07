package tr.com.kafein._04_stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {


    }

    public static void joining() {
        System.out.println(Stream.of("w", "o", "l", "f").collect(Collectors.joining()));
        System.out.println(Stream.of("w", "o", "l", "f").collect(Collectors.joining("-")));

        Stream<String> s1 = Stream.of("lions", "tigers", "bears");
        Stream<String> s2 = Stream.of("lions", "tigers", "bears");

        String joined = s1.collect(Collectors.joining());
        System.out.println(joined);

        String joined2 = s2.collect(Collectors.joining(","));
        System.out.println(joined2);
    }

    public static void groupBy() {
        Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Map<Integer, List<String>> maps = s1.collect(Collectors.groupingBy(String::length));
        System.out.println(maps);

        Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Map<Integer, Set<String>> map2 = s2.collect(Collectors.groupingBy(String::length , Collectors.toSet()));
        System.out.println(map2);
    }

    public static void partitioningBy() {
        Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Map<Boolean, List<String>> maps = s1.collect(Collectors.partitioningBy(x -> x.length() < 3));
        System.out.println(maps);

        Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat");
        Map<Boolean, List<String>> maps2 = s2.collect(Collectors.partitioningBy(args -> args.startsWith("cat")));
        System.out.println(maps2);
    }

    public static void toList() {
        Stream<String> c1 = Stream.of("horse", "dog", "bird", "monkey", "cat","bird");
        List<String> l1 = c1.collect(Collectors.toList());
        l1.forEach(System.out::println);
    }

    public static void toSet() {
        Set<String> l2 = Stream.of("horse", "dog", "bird", "monkey", "cat","cat").collect(Collectors.toSet());
        l2.forEach(System.out::println);
    }

    public static void toMap() {
        Map<Integer, String> nameLength = Stream.of("Can", "Canan").collect(Collectors.toMap( String::length, name -> name));
        Map<String, Integer> nameLength2 = Stream.of("Can", "Canan").collect(Collectors.toMap(Function.identity(), name -> name.length()));

        nameLength.forEach((length, name) -> System.out.println(length + " " + name));
        nameLength2.forEach((name, length)-> System.out.println(name + " " + length));
    }

    public static void toCollection() {

        TreeSet<String> l1 = Stream.of("horse", "dog", "bird", "monkey", "cat").collect(Collectors.toCollection(() -> new TreeSet<>()));
        l1.forEach(System.out::print);

        System.out.println();

        TreeSet<String> l2 = Stream.of("horse", "dog", "bird", "monkey", "cat","cat").collect(Collectors.toCollection(TreeSet::new));
        l2.forEach(System.out::print);

        System.out.println();

        List<String> l3 = Stream.of("horse", "dog", "bird", "monkey", "cat","cat").collect(Collectors.toCollection( () -> new ArrayList<>()));
        l3.forEach(System.out::print);
    }

    public static void averagingIntAndDouble(){
        Stream<String> animalStream = Stream.of("dog", "monkey", "horse", "bird", "cat");
        Double result = animalStream.collect(Collectors.averagingInt(String::length));
        System.out.println(result);

        List<Double> list = Arrays.asList(1.2, 2.2, 3.2, 4.2, 5.2, 6.2, 7.2, 8.2);
        Double d =list.stream().collect(Collectors.averagingDouble(x->x));
        System.out.println(d);
    }

    public static void sum(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int total = list.stream().collect(Collectors.summingInt(x -> x));

        System.out.println(total);

    }

}
