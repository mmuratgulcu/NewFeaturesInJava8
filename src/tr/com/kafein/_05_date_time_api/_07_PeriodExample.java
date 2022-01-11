package tr.com.kafein._05_date_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class _07_PeriodExample {
    public static void main(String[] args) {

        Period of = Period.of(2020, 2, 3);
        System.out.println(of);

    }

    public static void periodBetweenExample(){
        LocalDate birthOfDate = LocalDate.of(1994, Month.NOVEMBER,21);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthOfDate,currentDate);
        System.out.println("Period : " + period);

        System.out.println("Day : " + period.getDays());
        System.out.println("Month : " + period.getMonths());
        System.out.println("Year : " + period.getYears());

        period = Period.between(currentDate,birthOfDate);
        System.out.println("Period : " + period);

        System.out.println("Day : " + period.getDays());
        System.out.println("Month : " + period.getMonths());
        System.out.println("Year : " + period.getYears());
    }

    public static void periodOfMethods(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Period period = Period.ofDays(10);

        System.out.println(period.getDays() +" gün eklendi : " + localDate.plus(period));
    }
}
