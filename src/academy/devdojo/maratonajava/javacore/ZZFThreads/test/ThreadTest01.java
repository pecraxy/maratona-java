package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

class ThreadExample extends Thread {
    private final char c;
    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(this.c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;
    public ThreadExampleRunnable (char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(this.c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable('a'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('b'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('c'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('d'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
