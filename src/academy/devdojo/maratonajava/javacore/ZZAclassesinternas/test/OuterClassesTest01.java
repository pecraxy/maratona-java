package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Luffy o+ brabo";
    class Inner{
        public void printOuterClassAttributes(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttributes();
        System.out.println("----");
        new OuterClassesTest01().new Inner().printOuterClassAttributes();
    }
}
