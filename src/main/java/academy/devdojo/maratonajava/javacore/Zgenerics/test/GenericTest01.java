package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        //Type Erasure
        List<String> lista = new ArrayList<>();
        lista.add("Goku");
        lista.add("Oloko Meu");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista, new Consumidor("Goku Brabo"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }
    private static void add (List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
