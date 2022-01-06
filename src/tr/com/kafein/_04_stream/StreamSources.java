package tr.com.kafein._04_stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamSources {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(5);
    }

    public static void wrapperStreamSource() {

        Stream<String> empty = Stream.empty();
        Stream<String> s1 = Stream.of("data1", "data2", "data3", "data4");

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> s2 = list.stream();

        Stream<Double> s4 = Stream.generate(Math::random).limit(5);
        Stream<Integer> s5 = Stream.iterate(1, n -> n + 2).limit(5);
        Stream<Integer> s3 = Arrays.stream(new Integer[]{1, 2, 3});
        Stream<String> s6 = Pattern.compile(" ").splitAsStream("Java 8 stream test");

    }




}
