package academy.devdojo.maratonajava.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Olokinho Meu");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1); //Optional["Olokinho Meu"]
        System.out.println(o2); //Optional.empty
        System.out.println(o3); //Optional.empty
        System.out.println(o1.get()); /* Pegar o valor */
        System.out.println("----------");

        Optional<String> nameOptional = findName("Willian");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name){
        List<String> nameList = List.of("Xubilei", "Willian", "Xabisclaudo");
        int i = nameList.indexOf(name);
        if (i != -1){
            return Optional.of(nameList.get(i));
        }
        return Optional.empty();
    }
}
