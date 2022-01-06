package tr.com.kafein._04_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedStream {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        stream.forEach(System.out::println);
        cats.add("KC");




    }
}
