package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterTest01 {

    static class ObterProximoDiaUtil implements TemporalAdjuster{
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOffWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int addDays = 1;
            switch (dayOffWeek){
                case THURSDAY: addDays = 4; break;
                case FRIDAY: addDays = 3; break;
                case SATURDAY: addDays = 2; break;
            }

            return temporal.plus(addDays, ChronoUnit.DAYS);
        }
    }


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--");

        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("--");
        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }


}
