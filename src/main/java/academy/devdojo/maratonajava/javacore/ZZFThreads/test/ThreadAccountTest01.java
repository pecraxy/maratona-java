package academy.devdojo.maratonajava.javacore.ZZFThreads.test;

import academy.devdojo.maratonajava.javacore.ZZFThreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();
    public static void main(String[] args) throws InterruptedException {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Zezão");
        Thread t2 = new Thread(threadAccountTest01, "Zezinho");
        t2.start();
        t1.start();
    }
    private void withdrawal(int amount){
        System.out.println(getThreadName() + " ### fora do synchronized");
        synchronized (account){
            System.out.println(getThreadName() + " *** drento do synchronized");
            if (account.getBalance() >= amount){
                System.out.println(getThreadName() + " está indo sacar dinheiro.");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque. Valor atual da conta R$" + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque. Na conta: R$" + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
        }
    }
}
