package praktikum7;

import java.util.Scanner;

public class Main {
    // Studi Kasus: Tumpukan Buku Bacaan
    // Dapat menambahkan buku ke dalam tumpukan, membaca buku dengan menghapusnya dari tumpukan, dan melihat buku apa yang sedang menunggu untuk dibaca di bagian atas tumpukan.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tumpukan tumpukan = new Tumpukan();
        int pilihan;
        System.out.println(" -> Program Tumpukan Buku Bacaaan <-");
        do {
            menu();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tumpukan.tambahBuku();
                    break;
                case 2:
                    tumpukan.hapusBuku();
                    break;
                case 3:
                    tumpukan.tampilkanTumpukanBuku();
                    break;
                case 4:
                    tumpukan.tampilkanTopTumpukan();
                    break;
                case 5:
                    System.out.println("-> Program Berakhir");
                    break;
                default:
                    System.out.println("-> ERROR. Pilihan INVALID");
                    break;
            }
        } while (pilihan != 5);
    }

    static void menu() {
        System.out.println("+------------------------------------+");
        System.out.printf("|%-8s %-13s %-8s|\n", " ", "Menu Tumpukan Buku", " ");
        System.out.println("+------------------------------------+");
        System.out.println("1. Tambah Buku ke Tumpukan");
        System.out.println("2. Hapus Buku dari Tumpukan");
        System.out.println("3. Tampilkan Tumpukan Buku");
        System.out.println("4. Tampilkan Buku di Atas Tumpukan");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

}