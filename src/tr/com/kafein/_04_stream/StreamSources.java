package tr.com.kafein._04_stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamSources {
    public static void main(String[] args) {

    }

    public static void wrapperStreamSource() {

        Stream<String> empty = Stream.empty();
        Stream<String> streamOf = Stream.of("data1", "data2", "data3", "data4");
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        Stream<Double> streamGenerate = Stream.generate(Math::random).limit(5);
        Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 2).limit(5);
        Stream<Integer> arraysStream = Arrays.stream(new Integer[]{1, 2, 3});
        Stream<String> splitAsStream = Pattern.compile(" ").splitAsStream("Java 8 stream test");

    }
}
