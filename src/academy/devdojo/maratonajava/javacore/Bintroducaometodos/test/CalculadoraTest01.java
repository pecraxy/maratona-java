package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma\n");
        calculadora.somaDoisNumeros();
        System.out.println("\nSubtração");
        calculadora.subtraiDoisNumeros();
        System.out.println("\nMultiplicação");
        calculadora.multiplicaDoisNumeros(10, 20);
        System.out.println("CalculadoraTest01 finalizado.");
    }
}
