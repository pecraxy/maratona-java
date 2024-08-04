package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTes03 {
    private String name = "Dj Eu Quero Dinheiro Sem Trabalhar";
    static class Nested {
        private String lastName = "(Não perguntei)";
        void print(){
            System.out.println(new OuterClassesTes03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
