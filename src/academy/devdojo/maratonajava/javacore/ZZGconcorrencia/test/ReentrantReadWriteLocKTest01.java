package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite <K, V>{
    private final Map<K, V> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(K key, V value){
        rwl.writeLock().lock();
        try{
            if (rwl.isWriteLocked()){
                System.out.printf("%s obeteve o write lock.%n", Thread.currentThread().getName());
                Thread.sleep(500);
                map.put(key, value);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            rwl.writeLock().unlock();
        }
    }
    public Set<K> allKeys(){
        rwl.readLock().lock();
        try {
            return this.map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLocKTest01 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite<String, String> mapReadWrite = new MapReadWrite<>(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20 ; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (rwl.isWriteLocked()){
                System.out.println("WRITE LOCKED");
            }
            rwl.readLock().lock();
            System.out.println("Peguei o lock buzanga");
            try{
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            } finally {
                rwl.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
