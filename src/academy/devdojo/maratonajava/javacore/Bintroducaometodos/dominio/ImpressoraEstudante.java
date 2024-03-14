package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("------------------------------------");

        System.out.println("Nome = " + estudante.name);
        System.out.println("Idade = " + estudante.age);
        System.out.println("Sexo = " + estudante.sex);

        estudante.name = "Hemberon Fakeneimington";
    }
}
