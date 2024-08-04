package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /* --Principais Meta Caractéres--
         \d = todos os dígitos.
         \D = TUdo que não for dígito (Letras, caractéres especias)
         \s = Espaços em branco
         \S = Todos os caractéres excluindo os brancos
         \w = a-ZA-Z, dígitos (0 - 9), _ (underscore)
         \W = Contrário do \w, trás tudo que não for incluso no \w (caractéres especiais, espaços em branco)
         [] range = Encontrar tudo que tiver dentro dos colchetes
        */
//        String regex = "[abcABC]";
        //Ignora a pisção 0 1 2 e começa a partir da posição 3, depois ele acha na posição 4 e ocupa 4 5 6
//        String text = "abaaba";
                            //ou \d
        String regex = "0[xX][0-9a-fA-F]";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Texto:  " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHexaDecimal = 0x59F86A;
    }
}
