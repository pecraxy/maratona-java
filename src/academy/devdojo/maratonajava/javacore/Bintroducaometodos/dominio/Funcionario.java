package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimeDados() {
        int i = 0;
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário " + this.nome + ": " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double num : salarios) {
            i++;
            System.out.println(i + "º Salário R$:" + num);
        }
        mediaSalario();
    }

    private void mediaSalario() {
        if (this.salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            media += salario;
        }
        media /= this.salarios.length;
        System.out.println("A média de salário do funcionário " + this.nome + " é de R$" + this.media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
