package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Dj", "Azeitona", "O", "Mais", "Brabo");
//        List<String> collect = words.stream()
//                .map(s -> List.of(s.split("")))
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//        System.out.println(collect);
        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
