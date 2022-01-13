package tr.com.kafein._05_date_time_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeDateExample {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static void main(String[] args) {
        String dateStr = "2018-06-22T10:00:00";

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("begin : " + Thread.currentThread().getName());
                parseDate(dateStr);
            }
        };

        for(int i = 0; i < 100; i++) {

            executorService.submit(task);
        }

        executorService.shutdown();
    }

    private static void parseDate(String dateStr) {
        try {
            //Date date = simpleDateFormat.parse(dateStr);
            LocalDateTime date = LocalDateTime.parse(dateStr,dateTimeFormatter);
            System.out.println("Successfully Parsed Date " + date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
