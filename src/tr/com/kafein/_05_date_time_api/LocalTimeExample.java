package tr.com.kafein._05_date_time_api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        compareTimes();
    }

    public static void createTimeNow() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        localTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(localTime);
    }

    public static void createTimeOf() {
        LocalTime localTime = LocalTime.of(20, 15);
        System.out.println(localTime);

        localTime = LocalTime.of(20, 15, 30);
        System.out.println(localTime);

        localTime = LocalTime.of(20, 15, 30, 243);
        System.out.println(localTime);
    }

    public static void parseOfStringToTime() {

        LocalTime parse = LocalTime.parse("10:15:30");
        System.out.println(parse);

        LocalTime isoTime = LocalTime.parse("10:15:30",
                DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(isoTime);

        LocalTime localTime = LocalTime.parse("22:45:30",
                DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(localTime);


        LocalTime localTime3 = LocalTime.parse("10:45:30 PM",
                DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println(localTime3);
    }

    public static void parseOfTimeToString() {
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        String time = localTime.format(timeFormatter);
        System.out.println(time);

        DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        time = localTime.format(timeFormatter1);
        System.out.println(time);

        DateTimeFormatter timeFormatter3 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        time = localTime.format(timeFormatter3);
        System.out.println(time);

    }

    public static void plusMethod() {
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time : " + localTime);

        System.out.println("Addition of Hours : " + localTime.plusHours(2));
        System.out.println("Addition of Minutes : " + localTime.plusMinutes(30));
        System.out.println("Addition of Seconds : " + localTime.plusSeconds(20));
        System.out.println("Addition of Nanos : " + localTime.plusNanos(60000));
    }

    public static void minusMethod() {
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time : " + localTime);

        System.out.println("Subtraction of Hours : " + localTime.minusHours(2));
        System.out.println("Subtraction of Minutes : " + localTime.minusMinutes(30));
        System.out.println("Subtraction of Seconds : " + localTime.minusSeconds(20));
        System.out.println("Subtraction of Nanos : " + localTime.minusNanos(60000));
    }

    public static void getMethod() {

        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time : " + localTime);

        int hour = localTime.getHour();
        System.out.println("Hour : " + hour);

        int minute = localTime.getMinute();
        System.out.println("Minute : " + minute);

        int second = localTime.getSecond();
        System.out.println("Second : " + second);

        int nano = localTime.getNano();
        System.out.println("Nano : " + nano);

    }

    public static void compareTimes(){
        LocalTime localTime1 = LocalTime.of(9, 10, 50);
        LocalTime localTime2 = LocalTime.of(9, 10, 50);
        LocalTime localTime3 = LocalTime.of(11, 45, 20);

        // compareTo() example
        if (localTime1.compareTo(localTime2) == 0) {
            System.out.println("Saatler eşit");
        } else {
            System.out.println("Saatler eşit değil");
        }

        // isBefore() example
        if (localTime2.isBefore(localTime3)) {
            System.out.println("localTime2 nesnesi sonra gelir");
        }

        // isAfter() example
        if (localTime3.isAfter(localTime1)) {
            System.out.println("localTime3 nesnesi sonra gelir.");
        }
    }
}
