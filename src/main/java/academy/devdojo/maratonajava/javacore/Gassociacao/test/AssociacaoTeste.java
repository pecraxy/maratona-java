package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Sapopemba");
        Local local2 = new Local("Itaquera");

        Aluno aluno01 = new Aluno("Marcelo", 18);
        Aluno aluno02 = new Aluno("Beatrice", 18);
        Aluno aluno03 = new Aluno("Bojack", 18);
        Aluno aluno04 = new Aluno("Crackerjack", 18);
        Aluno[] alunos = {aluno01, aluno02};
        Aluno[] alunos2 = {/*aluno03, aluno04*/};

        Professor professor = new Professor("Jiraya", "Jutsu");

        Seminario seminario01 = new Seminario("Matemática", alunos, local);
        Seminario seminario02 = new Seminario("Português", alunos2, local2);
        Seminario seminarios[] = {seminario01, seminario02};

        professor.setSeminarios(seminarios);

        professor.imprime();

    }
}
