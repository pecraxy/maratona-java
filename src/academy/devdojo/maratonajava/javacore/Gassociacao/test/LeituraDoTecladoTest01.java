package academy.devdojo.maratonajava.javacore.Gassociacao.test;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = in.nextLine();
        System.out.print("Digite sua idade: ");
        int age = in.nextInt();
        System.out.print("Digite M ou F para seu sexo: ");
        char sex = in.next().charAt(0);
        System.out.println("Nome: "+ name);
        System.out.println("Idade: "+ age);
        System.out.println("Sexo: "+ sex);
    }
}
