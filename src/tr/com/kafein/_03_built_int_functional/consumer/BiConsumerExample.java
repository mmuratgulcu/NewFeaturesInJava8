package tr.com.kafein._03_built_int_functional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<List<Integer>, Integer> bic1 = (List<Integer> list, Integer i) -> list.add(i);
        BiConsumer<List<Integer>, Integer> listAddElement = List::add;

        List<Integer> aList = new ArrayList<>();
        listAddElement.accept(aList, 10);
        System.out.println(aList);
    }
}
