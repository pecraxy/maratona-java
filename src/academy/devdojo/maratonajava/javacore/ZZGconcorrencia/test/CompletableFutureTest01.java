package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreService;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesSync(storeService);
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

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        storeService.getPricesAsyncFuture("Atacadão Marcelo 1").get()
        storeService.getPricesAsyncFuture("Atacadão Diva Ginaberta 2")
        storeService.getPricesAsyncFuture("Atacadão Jupei Pito 3")
        storeService.getPricesAsyncFuture("Atacadão Marcelo 4")
        long end = System.currentTimeMillis();
        double timePassed = (double) (end - start) /1000;
        System.out.printf("Time passed searchPricesSync %.2f seconds.%n", timePassed);
    }
}
