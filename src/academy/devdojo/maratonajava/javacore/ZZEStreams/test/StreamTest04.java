package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Marcelo", "Mirasol", "Só quer mamão, só quer mel");
        List<String> developers = List.of("Zé do 157", "Sandreco Caneco", "Acha que é fácil fabricar papel?");
        List<String> students = List.of("Agatha Christie", "Eduardo Taddeo", "Gustavo Lima");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
