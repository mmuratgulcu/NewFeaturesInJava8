package tr.com.kafein._05_date_time_api;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        durationOfMethods();
    }

    public static void durationBetweenMethod(){
        LocalTime localTime = LocalTime.of(19,10,55);
        LocalTime currentTime = LocalTime.now();

        Duration duration = Duration.between(localTime,currentTime);
        Duration duration2 = Duration.between(currentTime,localTime);

        System.out.println(duration);
        System.out.println(duration2);
    }

    public static void durationOfMethods(){
        Duration duration = Duration.ofDays(1);
        Duration duration1 = Duration.ofMinutes(20);
        Duration duration2 = Duration.ofSeconds(22);

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.plus(duration1));
    }
}
