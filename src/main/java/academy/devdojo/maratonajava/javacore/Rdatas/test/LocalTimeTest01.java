package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY));
        //Exemplo do dia "começo do dia e final do dia" para relatórios
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
