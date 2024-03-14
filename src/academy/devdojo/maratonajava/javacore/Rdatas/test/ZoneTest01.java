package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime tokyoTime = now.atZone(tokyoZone);
        System.out.println(tokyoTime);

        Instant nowInstant = Instant.now();
        System.out.println(now);
        ZonedDateTime zonedDateTokyo = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTokyo);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTim1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTim1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        //Trás o horário que está em manaus agora
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        System.out.println(JapaneseDate.from(LocalDate.now()));

        //Meiji Era
        System.out.println(JapaneseDate.from(LocalDate.of(1900, 2 ,1)));
    }
}
