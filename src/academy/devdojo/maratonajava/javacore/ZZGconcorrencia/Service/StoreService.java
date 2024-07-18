package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.Service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public double getPriceSync(String storeName){
        System.out.printf("Gettin prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Gettin prices sync for store %s%n", storeName);
        ex.submit(this::priceGenerator);
    }
    private double priceGenerator(){
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        this.delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
