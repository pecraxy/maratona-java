package academy.devdojo.maratonajava.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Olokinho Meu");
        Optional<String> o2 = Optional.of(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1); //Optional["Olokinho Meu"]
        System.out.println(o2); //Optional.empty
        System.out.println(o3); //Optional.empty
        Optional<String> name = Optional.ofNullable(findName("Willian"));
        System.out.println(name.get());
    }
    private static String findName(String name){
        List<String> nameList = List.of("Xubilei", "Willian", "Xabisclaudo");
        int i = nameList.indexOf(name);
        if (i > 0){
            return nameList.get(i);
        }
        return null;
    }
}
