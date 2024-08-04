package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_678_136_756_254L); //long 100000 desde 1 de janeiro de 1970
        System.out.println(date);
        date.setTime(date.getTime() + 3_600_000L);

        //classe date trabalha com um Long de milisegundos que trabalha desde 1 de janeiro de 1970
        //a maioria dos métodos dessa classe estão obsoletos
    }
}
