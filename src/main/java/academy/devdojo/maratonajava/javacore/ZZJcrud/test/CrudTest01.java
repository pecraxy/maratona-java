package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        while(true){
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menu(op);
        }
    }

    private static void producerMenu(){
        System.out.println("------------- CRUD BOLADÃO -------------");
        System.out.println("1. Find by name");
        System.out.println("2. Find All");
        System.out.println("3. Delete producer");
        System.out.println("4. Save producer");
        System.out.println("5. Update producer");
        System.out.println("0. Exit");
        System.out.println("------------- ---- ------- -------------");
    }


}
