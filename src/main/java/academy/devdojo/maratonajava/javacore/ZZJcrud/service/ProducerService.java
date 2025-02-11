package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void menu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> findAll();
            case 3 -> delete();
            case 4 -> save();
            case 5 -> update();
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
        System.out.println("Are you sure? Y/N");
        String op = SCANNER.nextLine();
        if(op.equalsIgnoreCase("N")) return;
        ProducerRepository.delete(id);
    }
    private static void save(){
        System.out.print("Type the name of the new producer: ");
        Producer newProducer = Producer.builder()
                .name(SCANNER.nextLine())
                .build();
        ProducerRepository.save(newProducer);
    }

    private static Optional<Producer> findById(Integer id){
        return ProducerRepository.findById(id);
    }

    private static void update(){
        findAll();
        System.out.println("Type the id of the object you want to update?");
        Optional<Producer> producerOptional = findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found, try again.");
            return;
        }
        Producer producer = producerOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        Producer producerToUpdate = Producer.builder()
                .id(producer.getId())
                .name(name.isEmpty() ? producer.getName() : name)
                .build();
        ProducerRepository.update(producerToUpdate);
    }
}
