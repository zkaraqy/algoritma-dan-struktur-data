package praktikum6;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Vaksinasi {
    private static Scanner scan = new Scanner(System.in);
    private int dosisVaksin = 6;
    private Queue<String> antrian = new LinkedList<>();
    
    // Berfungsi mengisi antrian terlebih dahulu sebelum dipakai
    public Vaksinasi() {
        antrian.add("Azka");
        antrian.add("Ocin");
        antrian.add("Riyadh");
        antrian.add("Zidan");
        antrian.add("Raqib");
        antrian.add("Nigo");
        antrian.add("Faisal");
        antrian.add("Raqi");
    }
    
    // Memanggil kemudian menghapus orang di antrian dan mengurangi 1 dosis vaksin, jika dosis vaksin habis maka menampilkan pesan bahwa vaksin habis
    void panggilOrangSelanjutnya() {
        if (dosisVaksin == 0) {
            System.out.println("Vaksin habis, pendaftaran tidak dapat dilanjutkan");
            System.out.println("Silahkan tutup pendaftaran");
            return;
        }
        String orang = antrian.poll();
        dosisVaksin--;
        System.out.println("-> " + orang + " telah menerima vaksin");
    }
    
    // Menutup pendaftaran dan mengakhiri program
    void tutupPendaftaran() {
        System.out.println("\nPendaftaran vaksin telah ditutup");
        System.out.println("PROGRAM SELESAI");
        System.exit(0);
    }
    
    // Menampilkan sisa dosis vaksin
    void tampilkanSisaDosisVaksin() {
        System.out.println("Sisa dosis vaksin: " + dosisVaksin);
    }
    
    // Menampilkan antrian
    void tampilkanAntrian() {
        System.out.println("Antrian: " + antrian);
    }
    
    // Meminta inputan pengguna antara memanggil orang selanjunya atau menutup pendaftaran, kemudian mengembalikkan angka inputan pilihan pengguna
    int pilihanMenuPengguna() {
        System.out.println("Pilih: ");
        System.out.println("1. Panggil Orang Selanjutnya");
        System.out.println("2. Tutup Pendaftaran");
        System.out.print("Masukkan Pilihan = ");
        int pilihan = scan.nextInt();
        return pilihan;
    }
}
