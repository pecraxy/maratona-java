package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Willian Marcelo");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());

        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Suane nailliW");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;
        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }
        @Override
        public void run() {
            System.out.printf("%s is preparing to remove a value in queue. %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}