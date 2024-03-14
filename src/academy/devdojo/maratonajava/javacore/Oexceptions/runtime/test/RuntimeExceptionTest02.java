package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1, 5);

        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b divisor, não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0.");
        }
        return a / b;
    }
}
