package tr.com.kafein._04_stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperators {

    public static void main(String[] args) {
        reduce();
    }

    public static void count() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long size = integerStream.count();
        System.out.println(size);
    }

    public static void findFirstAndFindAny() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> any = integerStream.findAny();
        System.out.println(any.get().intValue());

        integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> first = integerStream.findFirst();
        System.out.println(first.get().intValue());
    }

    public static void foreach() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);
    }

    public static void minAndMax() {
        Comparator<String> comparator = (String c, String d) -> c.length() - d.length();
        //Comparator<String> comparator2 = Comparator.comparingInt(String::length);
        //String min = Stream.of("Ali","Canan","Muhammet").min((String c, String d) -> c.length() - d.length()).get();

        String min = Stream.of("Ali", "Canan", "Muhammet").min(comparator).get();
        String max = Stream.of("Ali", "Canan", "Muhammet").max(String::compareTo).get();

        System.out.println(min);
        System.out.println(max);
    }

    public static void minAndMax2(){
        Stream<String> animalStream = Stream.of("dog", "monkey", "horse");
        Stream<String> animalStream2 = Stream.of("dog", "monkey", "horse");

        Comparator<String> comparator = (String s1, String s2) -> s1.length() - s2.length();

        Optional<String> minLengthElement = animalStream.min(comparator);

        boolean isPresent = minLengthElement.isPresent();
        System.out.println(isPresent);
        System.out.println(minLengthElement);

        Optional<String> maxLengthElement2 = animalStream2.max(comparator);
        System.out.println(maxLengthElement2);
        System.out.println(maxLengthElement2.get());
    }

    public static void anyMatch() {
        List<String> names = new ArrayList<>();
        names.add("han");
        names.add("Dogan");
        names.add("onur");
        boolean result = names.stream().anyMatch(s -> s.equals("murat"));
        System.out.println(result);
    }

    public static void allMatch() {
        boolean result = IntStream.range(0, 20).allMatch(x -> x < 18);
        System.out.println(result);
    }

    public static void noneMatch() {
        boolean result = IntStream.range(0, 20).noneMatch(x -> x == 5);
        System.out.println(result);
    }

    public static void match(){
        List<String> list = Arrays.asList("monkey", "2", "horse");
        boolean any = list.stream().anyMatch(x -> Character.isLetter(x.charAt(0)));
        boolean none = list.stream().noneMatch(x -> Character.isLetter(x.charAt(0)));
        boolean all = list.stream().allMatch(x -> Character.isLetter(x.charAt(0)));

        System.out.println(any);
        System.out.println(none);
        System.out.println(all);

    }

    public static void reduce() {
        Optional<String> opt1 = Stream.of("w", "o", "l", "f").reduce((String x, String y) -> x + y);
        System.out.println(opt1.get());
        Optional<String> opt2 = Stream.of("w", "o", "l", "f").reduce(String::concat);
        System.out.println(opt2.get());
        String str = Stream.of("w", "o", "l", "f").reduce("#", (String x, String y) -> x + y);
        System.out.println(str);

        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce((a, b) -> a * b).get().intValue());

        stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(2, (a, b) -> a * b).intValue());

    }

}
