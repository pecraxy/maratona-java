package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Marcelo Atacados", "Diva Berta", "JupoPito", "Marceludo");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .toList();
    }
}
