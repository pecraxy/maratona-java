package academy.devdojo.maratonajava.javacore.ZZFThreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }
    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista.");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checkando se tem emails.");
        synchronized (this.emails){
            while(this.emails.isEmpty()){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponível, entrando em modo de espera.");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        this.open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos pegando emails.");
            this.emails.notifyAll();
        }
    }
}
