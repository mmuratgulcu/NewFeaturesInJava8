package tr.com.kafein._10_executor_cyclebarrier;

import java.time.LocalTime;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        threadPoolExample();
    }

    public static void singleThreadExecuteWithExecutorService() {
        //Executors sınıfı üzerinden single thread olusturuldu.
        ExecutorService service = Executors.newSingleThreadExecutor();

        System.out.println("begin : " + Thread.currentThread().getName());

        service.execute(() -> {
            System.out.println("Sample Runnable");
            System.out.println("Thread Execute 1: " + Thread.currentThread().getName());
        });

        service.execute(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing Record" + i);
            }
            System.out.println("Thread Execute 2: " + Thread.currentThread().getName());
        });

        System.out.println("end : " + Thread.currentThread().getName());

        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
        service.shutdown(); // shoutdown olduktan sonra service üzerinde başka thread çalıştıramayız.
    }

    public static void singleThreadSubmitWithExecutorService() throws InterruptedException {
        //Thread oluşturduk.
        ExecutorService service = Executors.newSingleThreadExecutor();
        //Basit bir task verdik

        Future<?> future = service.submit(() -> {
            System.out.println("ExecutorService#submit");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        //Threadi durdurduk.
        service.shutdown(); // executor üzerinde bir task var ise onu bitirmesini bekler.
        //service.shutDownNow(); // executor üzerinde bir taskın olup olmadığna bakmaksızın stop eder.
        service.awaitTermination(5, TimeUnit.SECONDS); // executor'ın 5 sn sonra kapanmasını sağlar.
        //
        System.out.println("isDone : " + future.isDone());
        System.out.println("isShutdown : " + service.isShutdown());
        System.out.println("isTerminated : " + service.isTerminated());
    }

    public static void differenceBetweenRunnableAndCallable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable runnable = () -> {
            System.out.println("Runnable!");
        };

        Callable<Integer> callable = () -> {
            System.out.println("Callable!");
            return 1;
        };

        Future<?> runnableFuture = executorService.submit(runnable);
        Future<?> callableFuture = executorService.submit(callable);

        System.out.println(runnableFuture.get());
        System.out.println(callableFuture.get());

    }

    public static void callableExample() throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println(service.getClass());

        Future<Integer> future = service.submit(() -> 20 + 30);

        try {
            System.out.println(future.get());
            System.out.println(future.isDone());
            System.out.println(future.isCancelled());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (service != null)
                service.shutdown();
        }

        System.out.println(service.isShutdown());
        Thread.sleep(1000);
        System.out.println(service.isTerminated());

    }

    public static void callableExampleTask() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> future = service.submit(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + i;
            }
            return sum;
        });

        Future<Integer> future2 = service.submit(() -> {
            int sum = 0;
            for (int i = 10; i < 20; i++) {
                sum = sum + i;
            }
            return sum;
        });

        service.shutdown();

        if (service.isTerminated()){
            System.out.println("All task finished");
        }else {
            System.out.println("No all finished yet");
        }

        System.out.println(future.get());
        System.out.println(future2.get());
    }

    public static void scheduledExample() throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable runnable = ()-> System.out.println("task1 message!");
        Callable<String> callable = ()->{
            System.out.println("task2 message!");
            return "content";
        };

        ScheduledFuture<?> scheduledRunnableFuture = service.schedule(runnable,3,TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledCallableFuture = service.schedule(callable,2,TimeUnit.SECONDS);

        System.out.println(scheduledRunnableFuture.get());
        System.out.println(scheduledCallableFuture.get());

        service.shutdown();

    }

    public static void scheduledAtFixedExample(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(()-> System.out.println(LocalTime.now()),3,5,TimeUnit.SECONDS);
    }

    public static void scheduledWithDelayExample(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(()-> System.out.println(LocalTime.now()),3,5,TimeUnit.SECONDS);
    }

    public static void threadPoolExample() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);

        Callable<String> task1 = () -> {
            System.out.println("task1 message");
            printNumbers();
            return "content1";
        };
        Callable<String> task2 = () -> {
            System.out.println("task2 message");
            printNumbers();
            return "content2";
        };
        Callable<String> task3 = () -> {
            System.out.println("task3 message");
            printNumbers();
            return "content3";
        };
        Callable<String> task4 = () -> {
            System.out.println("task4 message");
            printNumbers();
            return "content4";
        };

        Future<String> future = service.submit(task1);
        Future<String> future2 = service.submit(task2);
        Future<String> future3 = service.submit(task3);
        Future<String> future4 = service.submit(task4);

        Thread.sleep(500);
        if(future.isDone() && future2.isDone() && future3.isDone() && future4.isDone()){
            System.out.println("shutdown..");
            service.shutdown();
        }
    }

    public static void printNumbers(){
        for (int i = 0; i < 2; i++) {
            System.out.println("i: "+ i + " , "+ Thread.currentThread().getName());
        }
    }
}

