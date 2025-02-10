package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void menu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> findAll();
            case 3 -> delete();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName(){
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        System.out.println("----------- Find by name -----------");
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("ID [%d] | %s%n", p.getId(), p.getName()));
        System.out.println("----------- Find by name -----------\n");
    }

    private static void findAll(){
        System.out.println("----------- Find all -----------");
        ProducerRepository.findAll()
                .forEach(p -> System.out.printf("ID [%d] | %s%n", p.getId(), p.getName()));
        System.out.println("----------- Find all -----------\n");
    }

    private static void delete(){
        findAll();
        System.out.println("Type the id of the producer you want to delete:");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String op = SCANNER.nextLine();
        if(op.equalsIgnoreCase("N")) return;
        ProducerRepository.delete(id);
    }
}
