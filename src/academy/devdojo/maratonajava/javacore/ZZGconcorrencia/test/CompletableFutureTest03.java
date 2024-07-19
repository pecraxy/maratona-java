package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);
    }
    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Marcelo Atacados", "DivaBerta", "JupoPito", "Marceludo");
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .toList();
        List<Double> price = collect.stream()
                .map(CompletableFuture::join)
                .toList();
        System.out.println(price);
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) / 1000;
        executor.shutdown();
        System.out.printf("Time passed searchPricesAsync: %.2fs.%n", timePassed);

    }
}
