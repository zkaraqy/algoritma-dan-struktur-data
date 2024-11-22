package soal1;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private double IPK;
    private int sksYangTelahDitempuh;

    public Mahasiswa(String NIM, String nama, double IPK, int sksYangTelahDitempuh) {
        this.NIM = NIM;
        this.nama = nama;
        this.IPK = IPK;
        this.sksYangTelahDitempuh = sksYangTelahDitempuh;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public double getIPK() {
        return IPK;
    }

    public int getSksYangTelahDitempuh() {
        return sksYangTelahDitempuh;
    }
    
    
    
}
