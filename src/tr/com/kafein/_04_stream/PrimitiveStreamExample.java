package tr.com.kafein._04_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    public static void main(String[] args) {

        summaryStatistics();

    }

    public static void primitiveStreamSource() {

        IntStream intStream = IntStream.range(1, 3);
        IntStream rangeClosed = IntStream.rangeClosed(1, 3);
        IntStream iterate = IntStream.iterate(1, i -> i + 2).limit(4);
        IntStream i3 = Arrays.stream(new int[]{1, 2, 3});
        IntStream i4 = new Random().ints().limit(4);

        DoubleStream ds = DoubleStream.of(2.5, 5, 20.4, 6.7);
        ds.forEach(System.out::println);
    }

    public static void mapToInt() {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);

        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5");
        IntStream intStream2 = stringStream.mapToInt(i -> Integer.parseInt(i));

        DoubleStream doubleStream = DoubleStream.of(1.2, 2.3, 4.5);
        IntStream intS = doubleStream.mapToInt(i -> (int) i);
        intStream.forEach(System.out::println);

    }

    public static void mapToLong() {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        LongStream intStream = integerStream.mapToLong(i -> i);

    }

    public static void mapToDouble() {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        DoubleStream intStream = integerStream.mapToDouble(i -> i);

    }

    public static void average() {

        IntStream intStream = IntStream.range(1, 3);
        OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());

    }

    public static void minAndMax() {

        IntStream is = IntStream.of(2, 4, 6, 10, -1, 100, 5, 200, -20, 50, 3);

        System.out.println(is.max().getAsInt());
        System.out.println(is.min().getAsInt());

    }

    public static void summaryStatistics() {

        IntStream is = IntStream.range(1, 10).peek(System.out::print);
        IntSummaryStatistics stat = is.summaryStatistics();
        System.out.println("\n------------");
        System.out.println("Ortalama : " + stat.getAverage());
        System.out.println("Eleman sayısı : " + stat.getCount());
        System.out.println("Maximum değer : " + stat.getMax());
        System.out.println("Minumum değer : " + stat.getMin());
        System.out.println("Toplam : " + stat.getSum());

        System.out.println("------------");

        String content = "There was a young lady name Lima";
        IntSummaryStatistics stat2 = Pattern.compile(" ").splitAsStream(content)
                .peek(arg -> System.out.print(arg + " : "))
                .mapToInt(String::length)
                .peek(System.out::println)
                .summaryStatistics();

        System.out.println("------------");

        System.out.println("Ortalama : " + stat2.getAverage());
        System.out.println("Eleman Sayısı : " + stat2.getCount());
        System.out.println("Maximum Değer : " + stat2.getMax());
        System.out.println("Minumum Değer : " + stat2.getMin());
        System.out.println("Toplam : " + stat2.getSum());

    }
}
