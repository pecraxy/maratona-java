package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Atacadão Marcelo 1"));
        System.out.println(storeService.getPriceSync("Atacadão Diva Ginaberta 2"));
        System.out.println(storeService.getPriceSync("Atacadão Jupei Pito 3"));
        System.out.println(storeService.getPriceSync("Atacadão Marcelo 4"));
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) /1000;
        System.out.printf("Time passed searchPricesSync %.2f seconds.%n", timePassed);
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Atacadão Marcelo 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Atacadão Diva Ginaberta 2");
        Future<Double> pricesAsyncFuture3= storeService.getPricesAsyncFuture("Atacadão Jupei Pito 3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Atacadão Marcelo 4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) / 1000;
        System.out.printf("Time passed searchPricesAsync: %.2fs.%n", timePassed);
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesCompletableFuture("Atacadão Marcelo 1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesCompletableFuture("Atacadão Diva Ginaberta 2");
        CompletableFuture<Double> pricesAsyncFuture3= storeService.getPricesCompletableFuture("Atacadão Jupei Pito 3");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesCompletableFuture("Atacadão Marcelo 4");
        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) / 1000;
        System.out.printf("Time passed searchPricesAsync: %.2fs.%n", timePassed);
    }
}
