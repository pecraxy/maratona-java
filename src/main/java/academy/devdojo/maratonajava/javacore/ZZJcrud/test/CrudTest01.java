package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.AnimeService;
import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        while(true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            switch (op){
                case 1-> {
                    while(true){
                        producerMenu();
                        op = Integer.parseInt(SCANNER.nextLine());
                        if (op == 9) break;
                        ProducerService.menu(op);
                    }
                }
                case 2-> {
                    while(true){
                        animeMenu();
                        op = Integer.parseInt(SCANNER.nextLine());
                        if (op == 9) break;
                        AnimeService.menu(op);
                    }
                }
            }

        }
    }


    private static void menu(){
        System.out.println("------------- MENU BOLADÃO -------------");
        System.out.println("1. Producer Menu");
        System.out.println("2. Anime Menu");
        System.out.println("0. EXIT");
        System.out.println("------------- ---- ------- -------------");
    }
    private static void producerMenu(){
        System.out.println("------------- PRODUCER BOLADÃO -------------");
        System.out.println("1. Find by name");
        System.out.println("2. Find All");
        System.out.println("3. Delete producer");
        System.out.println("4. Save producer");
        System.out.println("5. Update producer");
        System.out.println("9. Go back");
        System.out.println("------------- ---- ------- -------------");
    }

    private static void animeMenu(){
        System.out.println("------------- CRUD BOLADÃO -------------");
        System.out.println("1. Find anime by name");
        System.out.println("2. Find All");
        System.out.println("3. Delete anime");
        System.out.println("4. Save anime");
        System.out.println("5. Update anime");
        System.out.println("9. Go back");
        System.out.println("------------- ---- ------- -------------");
    }


}
