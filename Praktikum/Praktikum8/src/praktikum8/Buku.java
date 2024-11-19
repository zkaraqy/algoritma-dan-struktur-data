package praktikum8;

public class Buku {
    private String judul;
    private String author;
    private int tahunRilis;
    private double harga;

    public Buku(String judul, String author, int tahunRilis, double harga) {
        this.judul = judul;
        this.author = author;
        this.tahunRilis = tahunRilis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void printBuku() {
        System.out.println("+--------------+--------------------+");
        System.out.printf("| %-12s | %-18s |\n", "judul", judul);
        System.out.printf("| %-12s | %-18s |\n", "author", author);
        System.out.printf("| %-12s | %-18s |\n", "tahun rilis", tahunRilis);
        System.out.printf("| %-12s | Rp %-15s |\n", "harga", harga);
        System.out.println("+--------------+--------------------+");
    }
}
