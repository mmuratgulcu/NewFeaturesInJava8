package tr.com.kafein._05_date_time_api;

import java.time.*;
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
        ZonedDateTime istanbul = ZonedDateTime.of(LocalDate.now(),LocalTime.now(),ZoneId.of("Asia/Istanbul"));
        System.out.println(istanbul);

        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(paris);

        //İstanbulda belirtilen tarih ve saatte iken pariste tarih ve saat kaçtır onu hesaplar.
        System.out.println(istanbul.withZoneSameInstant(ZoneId.of("Europe/Paris")));

    }

}
