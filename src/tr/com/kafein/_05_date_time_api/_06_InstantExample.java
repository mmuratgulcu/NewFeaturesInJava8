package tr.com.kafein._05_date_time_api;

import java.time.*;

public class _06_InstantExample {
    public static void main(String[] args) {



    }

    public static void createInstantNow(){
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    public static void toEpochMilli(){
        Instant instant = Instant.now();
        long milliSecond = instant.toEpochMilli();
        System.out.println(milliSecond);
    }

    public static void convertMillisToDate(){
        long currentTimeMillis = Instant.now().toEpochMilli();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        LocalDate localDate = Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime localTime = Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).toLocalTime();

        System.out.println("currentDate : " + localDate);
        System.out.println("currentTime : " + localTime);
    }

    public static void convertDateTimeToMillis(){
        long currentMillis =
                LocalDateTime.now()
                        .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("current Millis : " + currentMillis);
        System.out.println("current Date : " +  Instant.ofEpochMilli(currentMillis).atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println("current Time : " +  Instant.ofEpochMilli(currentMillis).atZone(ZoneId.systemDefault()).toLocalTime());
    }
}
