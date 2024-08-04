package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animals = new ArrayList<>();
        printConsulta(cachorros);
        printConsulta(gatos);
        printConsultaAnimal(animals);
    }
    //Type Erasure
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
