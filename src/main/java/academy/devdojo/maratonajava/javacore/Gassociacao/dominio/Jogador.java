package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;
    public void print(){
        System.out.println(this.name);
        if (time!= null){
            //Time é objeto, precisa dentro do objeto, retornar o nome
            System.out.println(time.getName());
        }
    }

    public Jogador(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
