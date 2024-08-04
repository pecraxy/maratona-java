package academy.devdojo.maratonajava.introducao;
import java.util.*;

public class Aula01 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um valor");
        int valor1 = in.nextInt();
        System.out.println("Insira outro valor");
        int valor2 = in.nextInt();
        int valor3 = valor1+valor2;
        System.out.println("A soma dos valores é: " + valor3);
    }
}
