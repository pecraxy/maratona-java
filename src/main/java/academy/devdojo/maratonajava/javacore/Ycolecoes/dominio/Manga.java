package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo.");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Manga manga = (Manga) obj;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo (-1) se o this for menor que outroManga
        // se this == outroManga, return 0
        // positivo se this > outroManga
//        if (this.id < outroManga.getId()) return -1;
//        if (this.id.equals(outroManga.getId())) return 0;
//        return 1;
        return this.nome.compareTo(outroManga.getNome());
        //caso precise comparar por tipo primitivo
//        return Double.compare(preco, outroManga.getPreco());
//        return this.id.compareTo(outroManga.getId());
    }
}
