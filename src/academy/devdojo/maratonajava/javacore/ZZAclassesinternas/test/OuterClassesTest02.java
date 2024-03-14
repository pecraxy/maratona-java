package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Ubuntu";
    void print(final String param){
        final String lastName = "Linux Distribution";
        class LocalClass {
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("param");
    }
}
