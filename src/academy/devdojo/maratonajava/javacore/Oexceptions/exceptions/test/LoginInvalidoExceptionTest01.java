package academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Márcio";
        String senhaDB = "marselo";
        System.out.println("Usuário");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha");
        String senhaDigitado = sc.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            //Lembrando que toda exeção do tipo CHECKED deve a assinatura do método
            throw new LoginInvalidoException("Login ou senha inválida");
        }
        System.out.println("Usuário logado com sucesso.");
    }
}
