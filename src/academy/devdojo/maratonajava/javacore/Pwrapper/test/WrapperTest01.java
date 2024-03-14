package academy.devdojo.maratonajava.javacore.Pwrapper.test;

import java.lang.reflect.Array;

public class WrapperTest01 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, char, boolean

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //Autoboxing
        Long longW = 10L;
        Float floatW = 1F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //Java se encarrega de transformar um tipo primitivo em um tipo Wrapper
        int i = intW; //Unboxing

        Integer intW2 = Integer.parseInt("0");
//      boolean verdadeiro = Boolean.parseBoolean("TruE");
//      System.out.println(verdadeiro);
        System.out.println(Character.isDigit(charW));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('o'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.toLowerCase('!'));
        System.out.println();
    }
}
