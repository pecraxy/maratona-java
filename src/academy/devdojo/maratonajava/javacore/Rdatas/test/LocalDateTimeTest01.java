package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2023-05-25");
        LocalTime localTime = LocalTime.parse("01:43:00");
        System.out.println(localDateTime);
        System.out.println(localTime);
        System.out.println(localDate);
        LocalDateTime lcdt1 = localDate.atTime(localTime);
        LocalDateTime lcdt2 = localTime.atDate(localDate);
        System.out.println(lcdt1);
        System.out.println(lcdt2);
    }
}
