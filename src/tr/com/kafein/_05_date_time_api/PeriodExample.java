package tr.com.kafein._05_date_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        periodOfMethods();
    }

    public static void periodBetweenExample(){
        LocalDate birthOfDate = LocalDate.of(1994, Month.NOVEMBER,21);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthOfDate,currentDate);
        System.out.println(period);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }

    public static void periodOfMethods(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Period period = Period.ofDays(10);
        System.out.println(period.getDays() +" gün eklendi : " + localDate.plus(period));
    }
}
