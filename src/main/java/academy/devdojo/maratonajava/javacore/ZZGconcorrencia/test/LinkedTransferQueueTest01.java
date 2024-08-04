package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("marcelo"));
        System.out.println(tq.offer("marcelo2"));
        System.out.println(tq.offer("marcelo3", 10, TimeUnit.SECONDS));
        tq.put("devdojo");
        if (tq.hasWaitingConsumer()){
            tq.transfer("maratona");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element()); //diferença para peek é que lança exceção se a lista tiver vazio
        System.out.println(tq.peek()); //diferença para peek é que lança exceção se a lista tiver vazio
        System.out.println(tq.poll());//diferença para remove é que ele não lança exceção quando está vazio, apenas retorna nulo
        System.out.println(tq.remove()); //
        System.out.println(tq.take()); //mostra e retira e caso a fila esteja vazia, ele fica esperando alguém colocar um elemento.
    }
}
