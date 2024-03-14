package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estátitico de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public Funcionario(String nome, String cpf){
        //Sobrecarga de construtores
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu" + this.nome + " recebi o salário de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
