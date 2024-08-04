package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- O grande software de previsão do futuro ---");
        System.out.println("Digite sua pergunta e eu responderei sim ou não.");
        String question = in.nextLine();
        if (question.charAt(0) == ' '){
            System.out.println("Definitivamente.");
        } else{
            System.out.println("Nem ferrando.");
        }
    }
}
