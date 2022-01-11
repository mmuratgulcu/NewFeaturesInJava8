package tr.com.kafein._05_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class _10_DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(localDate);
        System.out.println(localDate.format(dateTimeFormatter));
        System.out.println(localDate.format(dateTimeFormatter2));

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
        DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(localTime);
        System.out.println(localTime.format(timeFormatter));
        System.out.println(localTime.format(timeFormatter2));


    }
}
