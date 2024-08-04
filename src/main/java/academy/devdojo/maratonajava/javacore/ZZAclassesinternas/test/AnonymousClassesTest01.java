package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("I keep on walking, they try but can't stop me. No blocking my way, i was born for this shit");
    }

}
//class Dog extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Dog Viewer (The Legendary Mechanic)");
//    }
//}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Dog Viewer xablau in the shadow o ouriço é um filho da puta");
            }
        };
        animal.walk();
    }
}
