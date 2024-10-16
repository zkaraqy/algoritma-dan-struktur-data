package utp;

import java.util.Scanner;

public class Pasien {

    private String namaLengkap;
    private String tanggalLahir;
    private String riwayatPenyakit;
    private String golonganDarah;
    private String dokterPenanggungJawab;
    private double beratBadan;
    private double tinggiBadan;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getRiwayatPenyakit() {
        return riwayatPenyakit;
    }

    public void setRiwayatPenyakit(String riwayatPenyakit) {
        this.riwayatPenyakit = riwayatPenyakit;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getDokterPenanggungJawab() {
        return dokterPenanggungJawab;
    }

    public void setDokterPenanggungJawab(String dokterPenanggungJawab) {
        this.dokterPenanggungJawab = dokterPenanggungJawab;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public void isiDataPasien() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Data");
        System.out.print("-> Nama Lengkap           : ");
        setNamaLengkap(scan.nextLine());
        System.out.print("-> Tanggal Lahir          : ");
        setTanggalLahir(scan.nextLine());
        System.out.print("-> Riwayat Penyakit       : ");
        setRiwayatPenyakit(scan.nextLine());
        System.out.print("-> Golongan Darah         : ");
        setGolonganDarah(scan.nextLine());
        System.out.print("-> Dokter Penanggung Jawab: ");
        setDokterPenanggungJawab(scan.nextLine());
        System.out.print("-> Berat Badan            : ");
        setBeratBadan(scan.nextDouble());
        System.out.print("-> Tinggi Badan           : ");
        setTinggiBadan(scan.nextDouble());
    }
    
    

}
