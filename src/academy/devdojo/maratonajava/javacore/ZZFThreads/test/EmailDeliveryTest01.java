package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

import academy.devdojo.maratonajava.javacore.ZZFThreads.Service.EmailDeliveryService;
import academy.devdojo.maratonajava.javacore.ZZFThreads.dominio.Members;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jose = new Thread(new EmailDeliveryService(members), "José");
        Thread marcelo = new Thread(new EmailDeliveryService(members), "Marcelo");
        jose.start();
        marcelo.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
