package tr.com.kafein._00_sunum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedSystem {
    public static void main(String[] args) {

        List<String> cats = new ArrayList<>();

        cats.add("Mırmır");
        cats.add("Boncuk");

        Stream<String> stream = cats.stream();
        stream.forEach(System.out::println);

        cats.add("mavis");


    }
}
