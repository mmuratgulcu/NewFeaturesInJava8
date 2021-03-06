package tr.com.kafein._04_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedStream {

    public static void main(String[] args) {

        List<String> cats = new ArrayList<>();
        cats.add("Mırmır");
        cats.add("Boncuk");

        Stream<String> stream = cats.stream();
        cats.add("KC");

        stream.forEach(System.out::println);

    }
}
