package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        now = now.plusDays(2);]
        //trocar o dia do mês, o mês do mês sem trocar o resto
//        now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 13);
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());



    }
}
