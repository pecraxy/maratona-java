package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovel("Legendary Mechanic", 8.99),
                    new LightNovel("Beginning After The End", 4),
                    new LightNovel("Shadow Slave", 3.75),
                    new LightNovel("Trash's Count of the Family", 9.55),
                    new LightNovel("Solo Leveling", 2.55)
            )
    );
    public static void main(String[] args) {
        //Retorna um Wrapper de Double, sendo que na classe LightNovel, o tipo é primitivo.
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(rs -> System.out.println("Soma total: R$" + String.format("%.2f", rs).replace('.', ',')));

        System.out.println("----------");

        //Método com tipo primitivo
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println("Soma total: R$" + String.format("%.2f", sum).replace('.', ','));
    }
}
