package tr.com.kafein._09_concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionExample01 {
    public static void main(String[] args) {
        concurrentHashMap();
    }

    public static void arrayList(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        for (String s : list) {
            System.out.println(s);
            list.add("four");
        }
    }

    public static void concurrentArrayList(){

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        for (String s : list) {
            System.out.println(s);
            list.add("four");
        }

        System.out.println(list);
    }

    public static void hashMap(){
        Map<String, Object> fooData = new HashMap<>();
        fooData.put("penguin",1);
        fooData.put("flamingo",2);

        for (String s : fooData.keySet()) {
            System.out.println(s + " - " +  fooData.get(s));
            fooData.remove(s);
        }
    }

    public static void concurrentHashMap(){
        Map<String, Object> fooData = new ConcurrentHashMap<>();
        fooData.put("penguin",1);
        fooData.put("flamingo",2);

        for (String s : fooData.keySet()) {
            System.out.println(s + " - " +  fooData.get(s));
            fooData.remove(s);
        }

        System.out.println(fooData);
    }

}
