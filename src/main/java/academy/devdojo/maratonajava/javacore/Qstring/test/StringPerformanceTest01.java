package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        //concatString(30_000);
        long fim = System.currentTimeMillis();
        //System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");

        /*Quando se deve utilizar StringBuilder e StringBuffer?
        * Quando se trabalha com um sistema, é feito um mapeamento das regras de negócio que se tem no mundo real
        * Essas regras de negócio do mundo real, é o que define qual tipo de String se deve usar,
        * mas na maioria das vezes, sempre que se trabalhar com String, é preciso Strings
        * Não se coloca StringBuffer e sim String, nome é uma String e não uma StringBuffer ou StringBuilder
        * Quando se trabalha com um desses, adicionando um pouquinhoa amais de complexidade, é muito mais fácil de ler
        * 'String texto = "texto";' do que 'stringBuilder.append("texto);'
        * */

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0, 01, 012, 0123
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
