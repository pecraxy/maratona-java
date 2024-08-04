package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        System.out.println("Dentro da função");
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("\nDentro da CalculadoraTest04");
        System.out.println(a);
        System.out.println(b);
        /*Quando se passa valores dos tipos primitivo pra um método, não se passa referência do objeto em memória e sim
         * Faz uma cópia da variável
         */

    }
}
