package tr.com.kafein._00_sunum;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {


        Stream<String> animals = Stream.of("li", "tig", "hors", "birde", "cataaaa");
        TreeSet<String> collect = animals.collect(Collectors.toCollection(TreeSet::new));


    }


}
