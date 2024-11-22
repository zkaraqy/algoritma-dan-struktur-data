package soal2;

public class Barang {

    private String kode;
    private String nama;
    private double hargaSatuan;
    private int jumlahStok;

    public Barang(String kode, String nama, double hargaSatuan, int jumlahStok) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = jumlahStok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

}
