package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("T1: Segurando lock 1");
                System.out.println("T1: Esperando lock 2");
                synchronized (lock2){
                    System.out.println("T1: Segurando lock 2");
                }
                System.out.println("T1: Finalizando tudo.");
            }
        };

        Runnable r2 = () -> {
            synchronized (lock1){
                System.out.println("T2: Segurando lock 2");
                System.out.println("T2: Esperando lock 1");
                synchronized (lock2){
                    System.out.println("T2: Segurando lock 1");
                }
                System.out.println("T2: Finalizando tudo.");
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}

