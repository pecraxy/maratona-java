package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println();
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        //Locale("fr", "CA");
        //primeiro java procura messages_fr_CA.properties
        //depois tenta um arquivo só com a língua messages_fr.properties
        //depois tenta achar um arquivo baseado na língua original messages_en_US.rpoperties
        //depois tenta um arquivo só com a língua messages_en.properties
        //depois tenta o base messages.properties
        //e se não tiver o base, ele lança uma exceção
        //esse méotdo se chama fallback
        System.out.println(bundle.getString("hi"));
    }
}
