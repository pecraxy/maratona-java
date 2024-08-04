package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();
    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void removeFirst(){
        if (!names.isEmpty()){
            System.out.println(Thread.currentThread().getName()+ " removeu: " + names.remove(0));
        } else{
            System.out.println("Lista de nomes está vazia!");
        }
        System.out.println("Fim da alteração da Thread " + Thread.currentThread().getName());
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Moira");
        threadSafeNames.add("Junkie Queen");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
