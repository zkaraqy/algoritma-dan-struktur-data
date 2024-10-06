package praktikum3;

public class Mahasiswa {

    private String nama;
    private String NIM;
    private int semester;
    private int[] jumlahSksPerSemesterYangDiambil = new int[14];
    private boolean telahLulus;
    private int[] IPS = new int[14];
    private int IPK;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int[] getJumlahSksPerSemesterYangDiambil() {
        return jumlahSksPerSemesterYangDiambil;
    }

    public void setJumlahSksPerSemesterYangDiambil(int[] jumlahSksPerSemesterYangDiambil) {
        this.jumlahSksPerSemesterYangDiambil = jumlahSksPerSemesterYangDiambil;
    }

    public boolean isTelahLulus() {
        return telahLulus;
    }

    public void setTelahLulus(boolean telahLulus) {
        this.telahLulus = telahLulus;
    }

    public int[] getIPS() {
        return IPS;
    }

    public void setIPS(int[] IPS) {
        this.IPS = IPS;
    }

    public int getIPK() {
        return IPK;
    }

    public void setIPK(int IPK) {
        this.IPK = IPK;
    }

    public Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
}
