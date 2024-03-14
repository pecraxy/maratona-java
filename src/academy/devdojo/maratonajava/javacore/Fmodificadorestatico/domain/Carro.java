package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Carro(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.limitSpeed = limitSpeed;
    }

    public void print(){
        System.out.println("----------------------");
        System.out.println("Nome: "+this.name);
        System.out.println("Velocidade máxima: "+this.maxSpeed);
        System.out.println("Velocidade limíte: "+Carro.limitSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void setLimitSpeed(double limitSpeed){
        //Pode ser executado sem uma instância existente como um método estático
        //Métodos não-estáticos não podem ser executados sem uma instância, ou seja, um espaço alocado em memória
        Carro.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed(){
        return Carro.limitSpeed;
    }
}
