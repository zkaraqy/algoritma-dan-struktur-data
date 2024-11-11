package praktikum7;

public class Buku {
    private String namaBuku;
    private String author;

    public String getNamaBuku() {
        return namaBuku;
    }

    public String getAuthor() {
        return author;
    }

    public Buku(String namaBuku, String author) {
        this.namaBuku = namaBuku;
        this.author = author;
    }
    
}
