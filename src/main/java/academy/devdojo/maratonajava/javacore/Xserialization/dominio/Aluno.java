package academy.devdojo.maratonajava.javacore.Xserialization.dominio;

import java.io.*;

public class Aluno implements Serializable {

    private static final long serialVersionUID = -7696526341294059685L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;
    private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya brabíssimo";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    //uma sobrescrita sem ser sobrescrita, o java se encarrega de escrever
//    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ",\n nome='" + nome + '\'' +
                ",\n password='" + password + '\'' +
                ",\n nomeEscola='" + NOME_ESCOLA + '\'' +
                ",\n turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
