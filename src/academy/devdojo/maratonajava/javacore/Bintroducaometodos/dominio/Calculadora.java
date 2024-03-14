package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //Public = Método de acesso
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(22-4);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2){

        if (num2 == 0){
            System.out.println("É impossível dividir um número por 0.");
            return 0;
        }

        return num1/num2;
    }

    public double divideDoisNumeros02 (double num1, double num2){

        if (num2 != 0){
            return num1/num2;
        }
        System.out.println("É impossível dividir um número por 0.");
        return 0;
    }

    public void imprimeDivisaoDoisNumeros (double num1, double num2){

        if(num2 == 0){
            System.out.println("Não existe divisão por 0.");
            return;
//            Tipo um "break", ele retorna para o arquivo que está executando o método.
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros: ");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
//    VarArgs: Sintaxe usada pra deixar as coisas mais simples
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }


}
