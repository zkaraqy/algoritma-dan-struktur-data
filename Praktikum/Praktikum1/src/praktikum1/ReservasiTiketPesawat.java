package praktikum1;

import java.util.Scanner;

public class ReservasiTiketPesawat {

    private String username;
    private String password;
    private boolean isLogin;
    private static Tiket tiket1 = new Tiket();
    private static Tiket tiket2 = new Tiket();
    private static Tiket tiket3 = new Tiket();
    private Tiket tiketPesanan;

    public ReservasiTiketPesawat() {
        tiket1.setNamaMaskapai("Garuda Indonesia");
        tiket1.setNomorPenerbangan("GA-206");
        tiket1.setTanggalDanWaktuKeberangkatan("15 Oktober 2024, 07:30 WITA");
        tiket1.setBandaraKeberangkatan("Soekarno-Hatta International Airport (CGK)");
        tiket1.setBandaraTujuan("Ngurah Rai International Airport (DPS)");
        tiket1.setNomorKursi("18A");
        tiket1.setKelasPenerbangan("Ekonomi");
        tiket1.setHarga(1500000);
        tiket1.setBoardingTime("06:45 WITA");

        tiket2.setNamaMaskapai("Singapore Airlines");
        tiket2.setNomorPenerbangan("SQ-953");
        tiket2.setTanggalDanWaktuKeberangkatan("22 November 2024, 14:00 WITA");
        tiket2.setBandaraKeberangkatan("Soekarno-Hatta International Airport (CGK)");
        tiket2.setBandaraTujuan("Changi Airport (SIN)");
        tiket2.setNomorKursi("12C");
        tiket2.setKelasPenerbangan("Bisnis");
        tiket2.setHarga(4200000);
        tiket2.setBoardingTime("13:15 WITA");

        tiket3.setNamaMaskapai("Lion Air");
        tiket3.setNomorPenerbangan("JT-610");
        tiket3.setTanggalDanWaktuKeberangkatan("10 Desember 2024, 19:00 WITA");
        tiket3.setBandaraKeberangkatan("Juanda International Airport (SUB)");
        tiket3.setBandaraTujuan("Sultan Hasanuddin International Airport (UPG)");
        tiket3.setNomorKursi("27B");
        tiket3.setKelasPenerbangan("Ekonomi");
        tiket3.setHarga(950000);
        tiket3.setBoardingTime("18:20 WITA");
    }

    public void setUsername(String username) {
        tiket1.setNamaPenumpang(username);
        tiket2.setNamaPenumpang(username);
        tiket3.setNamaPenumpang(username);
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public static Tiket getTiket1() {
        return tiket1;
    }

    public static Tiket getTiket2() {
        return tiket2;
    }

    public static Tiket getTiket3() {
        return tiket3;
    }

    public boolean checkPernahRegistrasi() {
        return !(username == null || password == null);
    }

    public boolean cobaLogin() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan username : ");
        String username = scan.nextLine();
        setUsername(username);
        System.out.print("Masukkan password : ");
        String password = scan.nextLine();
        return this.username.equals(username) && this.password.equals(password);
    }

    public void registrasi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan username : ");
        String username = scan.nextLine();
        setUsername(username);
        System.out.print("Masukkan password : ");
        String password = scan.nextLine();
        setPassword(password);
        setIsLogin(true);
        System.out.println("-> Registrasi Berhasil");
        System.out.println("-> Anda telah login");
    }

    public void logout() {
        if (isLogin) {
            System.out.println("-> Logout Berhasil");
            setIsLogin(false);
        } else {
            System.out.println("-> Anda Belum Registrasi atau Login");
        }
    }

    public void pesanTiket(int nomorPenerbanganPesawat) {
        switch (nomorPenerbanganPesawat) {
            case 1:
                this.tiketPesanan = tiket1;
                break;
            case 2:
                this.tiketPesanan = tiket2;
                break;
            case 3:
                this.tiketPesanan = tiket3;
                break;
            default:
                System.out.println("-> ERROR. Coba lagi");
        }
        switch (nomorPenerbanganPesawat) {
            case 1:
            case 2:
            case 3:
                System.out.println("-> Pemesanan Tiket Berhasil");
                break;
        }
    }

    public void batalkanPemesananTiket() {
        this.tiketPesanan = null;
        System.out.println("-> Berhasil Membatalkan Pemesanan Tiket");
    }

    public void tampilkanTiketPesanan() {
        if (tiketPesanan == null) {
            System.out.println("-> Anda Belum Memesan Tiket");
            return;
        }
        System.out.println("Nama Maskapai : " + tiketPesanan.getNamaMaskapai());
        System.out.println("Nama Penumpang : " + username);
        System.out.println("Nomor Penerbangan : " + tiketPesanan.getNomorPenerbangan());
        System.out.println("Tanggal dan Waktu Keberangkatan : " + tiketPesanan.getTanggalDanWaktuKeberangkatan());
        System.out.println("Bandara Keberangkatan : " + tiketPesanan.getBandaraKeberangkatan());
        System.out.println("Bandara Tujuan : " + tiketPesanan.getBandaraTujuan());
        System.out.println("Nomor Kursi : " + tiketPesanan.getNomorKursi());
        System.out.println("Kelas Penerbangan : " + tiketPesanan.getKelasPenerbangan());
        System.out.println("Harga Tiket : Rp " + tiketPesanan.getHarga());
        System.out.println("Boarding Time : " + tiketPesanan.getBoardingTime());
    }
}
