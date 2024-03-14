package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {

        /*
        *<b>
        *Inicializações padrões
        * </b>
        * */

        //bye, short, int, long, float e double = 0
        //char = "\u0000"
        //boolean = false
        //tipos reference (string, array) = null


        String nomes[] = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kirito";
        nomes[2] = "Luffy";
        nomes[3] = "Luffy2";


        for (int i = 0; i < nomes.length/*nome . (tamanho do array), ou seja, seria I < 4*/; i++) {
            System.out.println(nomes[i]);
        }
    }
}
