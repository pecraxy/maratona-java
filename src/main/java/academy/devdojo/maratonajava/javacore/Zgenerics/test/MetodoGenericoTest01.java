package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> listaBarco = criarArrayComUmObjeto(new Barco("canoa braba"));
        System.out.println(listaBarco);
    }
    private static <T /*extends Comparable<? super T>*/> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}

