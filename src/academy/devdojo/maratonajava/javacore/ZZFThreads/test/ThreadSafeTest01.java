package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());
    public void add(String name){
        names.add(name);
    }
    public void removeFirst(){
        if (names.size() > 0){
            System.out.println(Thread.currentThread().getName()+ " removeu: " + names.remove(0));
        }
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Moira");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
