package tr.com.kafein._00_sunum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperatorExample {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(3, 5, 6);
        Integer reduce = integerStream.reduce(5,(a, b) -> a * b);
        System.out.println(reduce);

    }
}
