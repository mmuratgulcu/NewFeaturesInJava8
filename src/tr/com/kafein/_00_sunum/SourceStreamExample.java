package tr.com.kafein._00_sunum;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SourceStreamExample {
    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<String> data = Stream.of("data", "data1", "data2");

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();

        Stream<Double> limit = Stream.generate(Math::random).limit(4);
        Stream<Integer> limit1 = Stream.iterate(1, n -> n + 2).limit(6);

        Stream<Integer> stream1 = Arrays.stream(new Integer[]{1, 2, 3});

        Stream<String> splitAsStream = Pattern.compile(" ").splitAsStream("Java 8 stream test");

        splitAsStream.forEach(System.out::println);

    }
}
