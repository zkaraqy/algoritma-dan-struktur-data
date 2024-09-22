package praktikum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReservasiTiketPesawat reservan = new ReservasiTiketPesawat();
        int pilihan;
        do {
            menu();
            System.out.print("pilihan = ");
            pilihan = scan.nextInt();
            System.out.println("---------------------------------");
            switch (pilihan) {
                case 1:
                    if (!reservan.isIsLogin()) {
                        System.out.println("-> ERROR. Anda harus registrasi atau login terlebih dahulu");
                        break;
                    }
                    System.out.print("Masukkan nomor penerbangan pesawat (1/2/3) : ");
                    int pilihanPenerbangan = scan.nextInt();
                    reservan.pesanTiket(pilihanPenerbangan);
                    break;
                case 2:
                    JadwalPenerbanganPesawat.tampilkanJadwalPenerbangan();
                    break;
                case 3:
                    if (!reservan.isIsLogin()) {
                        System.out.println("-> ERROR. Anda harus registrasi atau login terlebih dahulu");
                        break;
                    }
                    reservan.batalkanPemesananTiket();
                    break;
                case 4:
                    reservan.tampilkanTiketPesanan();
                    break;
                case 5:
                    if (!reservan.checkPernahRegistrasi()) {
                        System.out.println("-> ERROR. Anda harus registrasi dulu");
                        break;
                    }
                    if (reservan.isIsLogin()) {
                        System.out.println("-> Anda telah login");
                        break;
                    }
                    boolean login = reservan.cobaLogin();
                    if (login) {
                        System.out.println("-> Login Berhasil");
                        reservan.setIsLogin(true);
                    } else {
                        System.out.println("-> ERROR. Username atau password salah");
                    }
                    break;
                case 6:
                    reservan.registrasi();
                    break;
                case 7:
                    reservan.logout();
                    break;
            }
        } while (pilihan != 8);
    }

    static void menu() {
        System.out.println("\n\tReservasi Tiket Pesawat");
        System.out.println("1. Pesan Tiket");
        System.out.println("2. Tampilkan Jadwal Penerbangan");
        System.out.println("3. Batalkan Pemesanan Tiket");
        System.out.println("4. Tampikan Tiket Pesanan");
        System.out.println("5. Login");
        System.out.println("6. Registrasi");
        System.out.println("7. Logout");
        System.out.println("8. Keluar");
    }

}
