package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreServiceWithDiscount;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountSync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Marcelo Atacados", "Diva Berta", "JupoPito", "Marceludo");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        double finalTime = (double)(end - start)/1000;
        System.out.printf("Time passed to searchPricesWithDiscountSync %.2f seconds %n", finalTime);
    }
    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Marcelo Atacados", "Diva Berta", "JupoPito", "Marceludo");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        List<CompletableFuture<String>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .toList();

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        double finalTime = (double)(end - start)/1000;
        System.out.printf("Time passed to searchPricesWithDiscount %.2f seconds %n", finalTime);

    }
}
