package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
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
        AnimeRepository.findByName(name)
                .forEach(a -> System.out.printf("ID [%03d] | %s | %s%n", a.getId(), a.getName(), a.getProducer().getName()));
        System.out.println("----------- Find by name -----------\n");
    }


    private static void findAll(){
        System.out.println("----------- Find all -----------");
        AnimeRepository.findAll()
                .forEach(a -> System.out.printf("ID [%03d] | %s | %s%n", a.getId(), a.getName(), a.getProducer().getName()));
        System.out.println("----------- Find all -----------\n");
    }

    private static void delete(){
        findAll();
        System.out.print("Type the id of the anime you want to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String op = SCANNER.nextLine();
        if(op.equalsIgnoreCase("N")) return;
        AnimeRepository.delete(id);
    }
    private static void save(){
        System.out.print("Type the name of the new anime: ");
        String name = SCANNER.nextLine();
        System.out.print("Type how many episodes does this anime has: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        ProducerService.findAll();
        System.out.print("Type the id of the producer: ");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime newProducer = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(newProducer);
    }

    private static Optional<Anime> findById(Integer id){
        return AnimeRepository.findById(id);
    }

    private static void update(){
        findAll();
        System.out.println("Type the id of the object you want to update?");
        Optional<Anime> animeOptional = findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found, try again.");
            return;
        }
        Anime anime = animeOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        System.out.println("Type new number of episodes or enter the same (" + anime.getEpisodes() + ")");
        int episodes = SCANNER.nextInt();
        Anime animeToUpdate = Anime.builder()
                .id(anime.getId())
                .name(name.isEmpty() ? anime.getName() : name)
                .episodes(episodes)
                .build();
        AnimeRepository.update(animeToUpdate);
    }
}
