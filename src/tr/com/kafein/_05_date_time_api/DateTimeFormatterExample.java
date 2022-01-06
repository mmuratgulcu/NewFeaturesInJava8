package tr.com.kafein._05_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
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

        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2020,Month.JANUARY,1,6,0),
                ZoneId.of("Asia/Singapore"));

        System.out.println("Depature: " + departure.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a")));

        //Singapurda saat 6'iken Auckland'ta ki saati bulup üzerine 10 saat ekliyor.
        ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10);

        System.out.println("Arrival:" + arrival.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a")));

        System.out.println(departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10));
    }
}
