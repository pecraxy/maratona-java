package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "     Luffy       ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        /**int[] num = {1, 2, 3};
         num.length //Diferença de um length de um Array, para um Length de uma String, é que o do Array é um atributo
         //E o length da String é um método, mas ambos retornam o tamanho*/

        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2)); //O indíce que quiser começar, e o indice que quer terminar
        //Mas o indíce de término tem uma particularidade, ele sempre imprime -1, exemplo,
        //No caso acima ao invés de imprimir até o indíce 2 (012), ele imprime até o indíce 1 (01)
        System.out.println(numeros.substring(3)); // retorna 345

        System.out.println(nome.trim()); //Remove os valores em branco que se tem no começo e no fim da string


    }
}
