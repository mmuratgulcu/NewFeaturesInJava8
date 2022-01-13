package tr.com.kafein._00_sunum;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimtiveExample {
    public static void main(String[] args) {

        String content = "There was a young lady nama Lima";

        IntSummaryStatistics intSummaryStatistics = Pattern.compile(" ").splitAsStream(content)
                .peek(arg -> System.out.print(arg + " : "))
                .mapToInt(String::length)
                .peek(System.out::println)
                .summaryStatistics();

        System.out.println("---------------------------");

        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());


    }
}
