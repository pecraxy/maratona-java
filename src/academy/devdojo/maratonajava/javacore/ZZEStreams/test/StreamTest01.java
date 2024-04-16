package academy.devdojo.maratonajava.javacore.ZZEStreams.test;


import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Ordenar LightNovel por titulo
//Retornar 3 Light Novels com preços menores que 4
public class StreamTest01 {
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
                        //Comparator.comparing (atributo a ser comparado)
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(titles);
    }
}
