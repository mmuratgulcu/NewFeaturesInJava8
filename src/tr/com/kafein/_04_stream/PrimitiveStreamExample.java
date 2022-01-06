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

        DoubleStream doubleStream = DoubleStream.of(1.2,2.3,4.5);
        IntStream intS = doubleStream.mapToInt(i -> (int) i);
        intStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("1","2","3","4","5");
        //IntStream intStream1 = stringStream.mapToInt(Integer::parseInt);
        IntStream intStream2 = stringStream.mapToInt(i -> Integer.parseInt(i));

    }

    public static void mapToLong() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        LongStream intStream = integerStream.mapToLong(i -> i);
    }

    public static void mapToDouble() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        DoubleStream intStream = integerStream.mapToDouble(i -> i);
    }

    public static void average(){
        IntStream intStream = IntStream.range(1, 3);
        OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());
    }

    public static void summaryStatistics() {
        IntStream is = IntStream.range(1, 10).peek(System.out::println).limit(5);
        IntSummaryStatistics stat = is.summaryStatistics();
        System.out.println("------------");
        System.out.println("Ortalama : " + stat.getAverage());
        System.out.println("Eleman sayısı : " + stat.getCount());
        System.out.println("Maximum değer : " + stat.getMax());
        System.out.println("Minumum değer : " + stat.getMin());
        System.out.println("Toplam : " + stat.getSum());

        System.out.println("------------");
        String limeck = "There was a young lady name asd";
        IntSummaryStatistics stat2 = Pattern.compile(" ").splitAsStream(limeck)
                .peek(System.out::println)
                .mapToInt(String::length)
                .peek(System.out::println)
                .summaryStatistics();

        System.out.println(stat.getAverage());
        System.out.println(stat.getCount());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getSum());

    }

    public static void minAndMax(){
        IntStream is = IntStream.of(2, 4, 6, 10, -1, 100, 5, 200, -20, 50, 3);

        System.out.println(is.max().getAsInt());
        System.out.println(is.min().getAsInt());
    }

}
