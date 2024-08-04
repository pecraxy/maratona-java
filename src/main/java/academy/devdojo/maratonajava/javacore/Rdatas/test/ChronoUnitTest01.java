package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2006, Month.MAY, 25, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthday, now) + " Dias vivo. \\o/");
        System.out.println(ChronoUnit.WEEKS.between(birthday, now) + " Semanas vivo. \\o/");
        System.out.println(ChronoUnit.MONTHS.between(birthday, now) + " Mêses vivo. \\o/");
        System.out.println(ChronoUnit.YEARS.between(birthday, now) + " Anos vivo. \\o/");
    }
}
