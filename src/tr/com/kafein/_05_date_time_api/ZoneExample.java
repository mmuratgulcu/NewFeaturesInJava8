package tr.com.kafein._05_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneExample {
    public static void main(String[] args) {

        withZoneSameInstant();

    }

    public static void createZoneIdOf(){
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
        System.out.println(zoneId.getRules());
    }

    public static void getDefaultZoneId(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }

    public static void getAllZoneId(){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);
    }

    public static void createZonedDateTimeNow(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        LocalDate localDate = zonedDateTime.toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = zonedDateTime.toLocalTime();
        System.out.println(localTime);

        ZoneId zoneId = zonedDateTime.getZone();
        System.out.println(zoneId);

        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println(localDateTime);
    }

    public static void createZonedDateTimeOf(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime);

        zonedDateTime = ZonedDateTime.of(localDateTime.toLocalDate(),localDateTime.toLocalTime(),zoneId);
        System.out.println(zonedDateTime);

    }

    public static void withZoneSameInstant(){
        System.out.println(ZonedDateTime.now().toLocalTime());
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Singapore")).toLocalTime());

        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2021,Month.JANUARY,9,10,15),
                ZoneId.of("Asia/Istanbul"));

        System.out.println("Depature: " + departure.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a")));

        ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of("Asia/Singapore")).plusHours(5);

        System.out.println("Arrival:" + arrival.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a")));

    }

}
