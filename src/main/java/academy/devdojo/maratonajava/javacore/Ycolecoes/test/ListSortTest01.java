package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack On Titan");
        mangas.add("Bersek");
        mangas.add("Jujutsu Kaisen");
        mangas.add("Pokemon");
        mangas.add("Naruto");
        Collections.sort(mangas);
        Double[] money = {100.21, 23.98, 21.21, 98.10};
        List<Double> dinheiros = Arrays.asList(money);
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        for(String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
    }
}

