package tr.com.kafein._09_concurrency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> synchronizedList = Collections.synchronizedList(list);



    }
}
