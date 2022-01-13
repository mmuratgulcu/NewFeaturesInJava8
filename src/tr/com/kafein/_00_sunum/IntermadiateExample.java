package tr.com.kafein._00_sunum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermadiateExample {
    public static void main(String[] args) {

        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
        Stream<List<String>> animals = Stream.of(one, two);
        animals.flatMap(x -> x.stream()).forEach(System.out::println);


        List<Integer[]> list = Arrays.asList(new Integer[]{1, 2, 3, 4}, new Integer[]{5, 6, 7, 8, 9});
        list.stream().flatMap(array -> Arrays.stream(array)).forEach(System.out::println);

    }


}
