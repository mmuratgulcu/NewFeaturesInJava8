package tr.com.kafein._09_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {

        atomicIntegerTest01();

    }

    public static void atomicIntegerTest01() {
        // c++
        // 1. si -> c'nin değerini oku.
        // 2. si -> c'nin değerini bir arttır.
        // 3. sü -> c'nin güncel değerini yaz.

        // Yukarıdaki işlem üç adımdan oluştuğundan atomic değildir.
        // Örneğin bir thread 2. adıma gelip durabiliyordu, ve başka bir thread gelebiliyordu.
        // AtomicInteger içinde ise bu durum çözülmektedir.

        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(10);
        atomicInteger.getAndIncrement(); // c++
        atomicInteger.incrementAndGet(); // ++c

        System.out.println(atomicInteger);
    }
}


