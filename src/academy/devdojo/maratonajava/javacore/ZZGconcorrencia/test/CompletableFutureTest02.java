package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }
    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Marcelo Atacados", "DivaBerta", "JupoPito", "Marceludo");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesCompletableFuture)
                .toList();
        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .toList();
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) / 1000;
        System.out.println(prices);
        System.out.printf("Time passed searchPricesAsync: %.2fs.%n", timePassed);

    }
}
