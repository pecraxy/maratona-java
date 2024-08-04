package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(
                        new Barco("Lancha"),
                        new Barco("Canoa")
                ));
    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponível");
        Barco carro = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + carro);
        System.out.println("Barco disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return carro;
    }
    
    public void retornarBarcoAlugado(Barco carro){
        System.out.println("Devolvendo Barco " + carro);
        barcosDisponiveis.add(carro);
        System.out.println("Barco disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
