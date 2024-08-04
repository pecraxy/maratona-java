package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;

    public Anime(){

    }

    private String category;

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String category){
        this.init(name, type, episodes);
        this.category = category;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.category);
    }

    /////////////////////////////////////////////////////
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public int getEpisodes(){
        return this.episodes;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
