package tr.com.kafein._05_date_time_api;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(5,15);
        LocalTime localTime1 = LocalTime.of(8,17);

        System.out.println(ChronoUnit.HOURS.between(localTime,localTime1));

        System.out.println(ChronoUnit.SECONDS.getDuration());
        System.out.println(ChronoUnit.DAYS.getDuration());
        System.out.println(ChronoUnit.HALF_DAYS.getDuration());
        System.out.println(ChronoUnit.MONTHS.getDuration());
    }
}
