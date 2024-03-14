package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        //Ignora a pisção 0 1 2 e começa a partir da posição 3, depois ele acha na posição 4 e ocupa 4 5 6
//        String text = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Texto:  " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
