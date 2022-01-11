package tr.com.kafein._05_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class _04_LocalDateTimeExample {
    public static void main(String[] args) {


    }

    public static void createDateTimeNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(localDateTime);
    }

    public static void createDateTimeOf (){

        LocalDateTime localDateTime = LocalDateTime.of(2021,Month.MAY,22,23,21);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.of(2021, Month.JANUARY,1,12,21,32);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.of(2021, Month.JANUARY,1,12,21,32,2123);
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
    }

    public static void maxAndMinDateTime(){
        LocalDateTime localDateTime = LocalDateTime.MAX;
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.MIN;
        System.out.println(localDateTime);
    }

    public static void parseMethod(){
        LocalDateTime localDateTime = LocalDateTime.parse("2021-12-15T13:43:02.154");
        System.out.println(localDateTime);
    }

    public static void formatMethod(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String format = localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:A"));
        System.out.println(format);
    }

    public static void toLocaleDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }

    public static void toLocaleTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }

    public static void getMethod(){

        LocalDateTime localDateTime = LocalDateTime.now();

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("Haftanın " + dayOfWeek.getValue() + ".günü " + dayOfWeek+ "'dir");

        Month month = localDateTime.getMonth();
        System.out.println("Senenin " + month.getValue() + ".ayı " + month+ "'dir");

        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("Ayın "+dayOfMonth+ ". günü");
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));

        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("Senenin " + dayOfYear + ".günü");

        int hour = localDateTime.getHour();
        System.out.println("Saat : " + hour);

        int minute = localDateTime.getMinute();
        System.out.println("Dakika : " + minute);

        int second = localDateTime.getSecond();
        System.out.println("Saniye : " + second);

        int nano = localDateTime.getNano();
        System.out.println("Milisaniye : " + nano);

    }
}
