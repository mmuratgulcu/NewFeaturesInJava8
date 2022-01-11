package tr.com.kafein._05_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;
import java.util.Set;

public class _01_ZoneExample {
    public static void main(String[] args) {

        createZoneAndGetRules();

    }

    public static void getDefaultZone(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("System zone information : " + zoneId);
    }

    public static void getAllZone(){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }

    public static void createZoneAndGetRules(){
        ZoneId zoneId = ZoneId.of("Europe/Monaco");
        System.out.println("Custom Zone Information : " + zoneId);
        ZoneRules rules = zoneId.getRules();
        System.out.println(zoneId + " Rules : " + rules);
    }

}
