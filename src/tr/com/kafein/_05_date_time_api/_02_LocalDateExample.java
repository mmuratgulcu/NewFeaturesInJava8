package tr.com.kafein._05_date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class _02_LocalDateExample {
    public static void main(String[] args) {

        getMethod();

    }

    public static void createDateNow() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Local Date : " + localDate);
        localDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Asia/Kolkata Date : " + localDate);
    }

    public static void createDateOf() {
        LocalDate localDate = LocalDate.of(2020, 4, 20);
        System.out.println("Custom Date : " + localDate);
        localDate = LocalDate.of(2020, Month.APRIL, 20);
        System.out.println("Custom Date : " + localDate);
    }

    public static void epochOfDay() {
        LocalDate localDate = LocalDate.ofEpochDay(1);
        System.out.println(localDate);
    }

    public static void parseOfStringToDate() {
        LocalDate localDate = LocalDate.parse("2021-03-22");
        System.out.println(localDate);

        localDate = LocalDate.parse("2021-10-21", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);

        localDate = LocalDate.parse("2021/10/21", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate);

        localDate = LocalDate.parse("Jun 10, 2020", DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        System.out.println(localDate);

        localDate = LocalDate.parse("12-Feb-2021", DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(localDate);

        localDate = LocalDate.parse("12-01-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(localDate);
    }

    public static void parseOfDateToString() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date : " + localDate);

        String date = localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        date = localDate.format(dateTimeFormatter);
        System.out.println(date);

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        date = localDate.format(dateTimeFormatter);
        System.out.println(date);

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date = localDate.format(dateTimeFormatter);
        System.out.println(date);
    }

    public static void plusMethod() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Bugünün tarihi : " + localDate);

        localDate = localDate.plusDays(2);
        System.out.println("2 gün eklendi : " + localDate);

        localDate = localDate.plusWeeks(2);
        System.out.println("2 hafta eklendi : " + localDate);

        localDate = localDate.plusMonths(1);
        System.out.println("1 ay eklendi : " + localDate);

        localDate = localDate.plusYears(2);
        System.out.println("2 yıl eklendi : " + localDate);

        localDate = LocalDate.now().plusDays(2).plusWeeks(2).plusMonths(1).plusYears(2);
        System.out.println("Sonuc : " + localDate);
    }

    public static void minusMethod() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Bugünün tarihi : " + localDate);

        // Sistem tarihine 2 gün çıkartır.
        localDate = localDate.minusDays(2);
        System.out.println("2 gün çıkarıldı : " + localDate);

        // Sistem tarihine 2 hafta çıkartır.
        localDate = localDate.minusWeeks(2);
        System.out.println("2 hafta çıkarıldı : " + localDate);

        // Sistem tarihine 1 ay çıkartır.
        localDate = localDate.minusMonths(1);
        System.out.println("1 ay çıkarıldı : " + localDate);

        // Sistem tarihine 2 yıl çıkartır.
        localDate = localDate.minusYears(2);
        System.out.println("2 yıl çıkarıldı : " + localDate);

        // Ayrı ayrı kullanılabileceği gibi birleşik bir şekilde de kullanılabilir.
        localDate = localDate.minusDays(2).minusWeeks(2).minusMonths(1).minusYears(2);
        System.out.println("Sonuc : " + localDate);
    }

    public static void ofYearDay() {
        // 2020'nin 150. gününün denk geldiği tarih bilgisini dönmektedir.
        LocalDate localDate = LocalDate.ofYearDay(2022, 150);
        System.out.println(localDate);
    }

    public static void isLeapYear() {
        LocalDate localDate1 = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2021, Month.JANUARY, 1);

        if (localDate1.isLeapYear()) {
            System.out.println(localDate1.getYear() + " artık yıldır.");
        } else {
            System.out.println(localDate1.getYear() + " artık yıl değildir.");
        }

        if (localDate2.isLeapYear()) {
            System.out.println(localDate2.getYear() + " artık yıldır.");
        } else {
            System.out.println(localDate2.getYear() + " artık yıl değildir.");
        }
    }

    public static void compareDates() {
        LocalDate tarih1 = LocalDate.of(2017, Month.MAY, 14);
        LocalDate tarih2 = LocalDate.of(2016, Month.MAY, 15);

        if (tarih1.isEqual(tarih2)) {
            System.out.println("Tarihler eşittir.");
        } else {
            System.out.println("Tarihler eşit değildir.");
        }

        if (tarih1.isAfter(tarih2)) {
            System.out.println("Tarih1 tarih2'den sonra gelmektedir.");
        }

        if (tarih2.isBefore(tarih1)) {
            System.out.println("Tarih2 tarih1'den önce gelmektedir.");
        }
    }

    public static void getMethod() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Bugünün tarihi : " + localDate);

        DayOfWeek week = localDate.getDayOfWeek();
        int dayOfWeek = localDate.getDayOfWeek().getValue();
        System.out.println("Bugün haftanın " + dayOfWeek + ". günü " + week + "'dir.");
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));

        Month month = localDate.getMonth();
        int monthValue = localDate.getMonthValue();
        int getDayOfMonth = localDate.getDayOfMonth();
        int lenghtOfMonth = localDate.lengthOfMonth();

        System.out.println("Senenin " + monthValue + ". ayı olan " + month + "'ın " + getDayOfMonth + ". günündeyiz. Bu ay toplam " +
                lenghtOfMonth + " gündür.");

        int year = localDate.getYear();
        int dayOfYear = localDate.getDayOfYear();
        int lengthOfYear = localDate.lengthOfYear();
        System.out.println(year + " yılının " + dayOfYear + ". günüdür. Bu yıl toplam " + lengthOfYear + " gündür.");
        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));
    }
}

