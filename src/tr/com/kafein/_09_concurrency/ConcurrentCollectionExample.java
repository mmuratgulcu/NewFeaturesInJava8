package tr.com.kafein._09_concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionExample {
    public static void main(String[] args) {

    }
}

class BadZooManager{

    public Map<String,Object> foodData = new HashMap<>();

    public synchronized void put(String key,String value){
        foodData.put(key,value);
    }

    public synchronized Object get(String key){
        return foodData.get(key);
    }
}

class ZooManager{

    public Map<String,Object> foodData = new ConcurrentHashMap<>();

    public void put(String key,String value){
        foodData.put(key,value);
    }

    public Object get(String key){
        return foodData.get(key);
    }
}