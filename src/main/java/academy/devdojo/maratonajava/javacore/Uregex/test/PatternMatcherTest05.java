package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /* --Principais Meta Caractéres--
         \d = todos os dígitos.
         \D = TUdo que não for dígito (Letras, caractéres especias)
         \s = Espaços em branco
         \S = Todos os caractéres excluindo os brancos
         \w = a-ZA-Z, dígitos (0 - 9), _ (underscore)
         \W = Contrário do \w, trás tudo que não for incluso no \w (caractéres especiais, espaços em branco)
         [] range = Encontrar tudo que tiver dentro dos colchetes
         ? Zero ou uma ocorrêncai
         * zero ou mais
         + uma ou mais ocorrências
         {n, m} de n até m
         () de agrupamento
         | o(v|o)o //dá um match de oco ou ovo
         $ fim da linha
         . 1.3 = 123, 133, 1@3, 1A3, 1(x)3
        */

                            //ou \d
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail.com";
        System.out.println("#@!zoro@mail.br".matches(texto));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789123456789123465789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " = " + matcher.group() + "\n");
        }
    }
}
