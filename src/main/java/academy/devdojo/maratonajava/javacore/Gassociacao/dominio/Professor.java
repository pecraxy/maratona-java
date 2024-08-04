package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    // speciality
    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null || this.seminarios.length == 0) return;
        System.out.println("            == Seminários Cadastrados ==");
        for (Seminario seminario : seminarios) {
            int i = 0;
            System.out.println("-----------------------------------------------------------");
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereço());
            System.out.println("Quantidade de Alunos: " + seminario.getAlunos().length);
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("        ## Alunos ##");

            for (Aluno aluno: seminario.getAlunos()) {
                i++;
                System.out.println(i+ "º Aluno: " + "'"+ aluno.getNome() + "' com '" + aluno.getIdade() +"' anos.");
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
