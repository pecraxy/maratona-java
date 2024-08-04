package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDateTime timeNow = LocalDateTime.now();
        //Zulu time (horário neutro do mundo)
        System.out.println(now);
        System.out.println(timeNow);
        //Long
        System.out.println(now.getEpochSecond());
        //Inteiro, representa o segundo do segundo (1 segundo equivale a 1 bilhão de nano segundos)
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
