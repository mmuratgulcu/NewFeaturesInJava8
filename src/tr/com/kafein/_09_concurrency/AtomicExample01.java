package tr.com.kafein._09_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample01 {

    public static Integer integer = new Integer(0);
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    static class Increment extends Thread{
        @Override
        public void run() {
            integer++;
            atomicInteger.incrementAndGet();
        }
    }

    static class Decrement extends Thread{
        @Override
        public void run() {
            integer--;
            atomicInteger.decrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] incrementerThread = new Increment[1000];
        Thread[] decrementerThread = new Decrement[1000];

        for (int i = 0; i < 1000; i++) {
            incrementerThread[i] = new Increment();
            decrementerThread[i] = new Decrement();
            incrementerThread[i].start();
            decrementerThread[i].start();
        }

        // Bir thread join() metodunu çağırır ise o an çalışan thread join() metodunu çağıran threadin bitmesini bekler.
        // Join’i çağıran thread işini bitirdikten sonra bekleyen thread çalışmaya devam eder.
        for (int i = 0; i < 1000; i++) {
            incrementerThread[i].join();
            decrementerThread[i].join();
        }

        System.out.println("Integer value : " + integer);
        System.out.println("AtomicInteger value : " + atomicInteger.get());
    }

    //Aynı anda arttırma ve eksiltme işlemi yapıyoruz.
    //Normal integer'da işlem kesintiye uğrayıp yanlış sonuç verme ihtimali vardır. (race condition)
    //Atomic ise kararlı yapıdadır. Her zaman doğru sonucu çıkarmaktadır.
}
