package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);
    }
    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Marcelo Atacados", "DivaBerta", "JupoPito", "Marceludo");
        stores.stream()
                .map(s )
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) / 1000;
        System.out.printf("Time passed searchPricesAsync: %.2fs.%n", timePassed);

    }
}
