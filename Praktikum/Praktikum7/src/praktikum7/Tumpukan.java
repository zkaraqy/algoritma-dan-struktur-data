package praktikum7;

import java.util.Stack;
import java.util.Scanner;

public class Tumpukan {

    private Stack<Buku> tumpukanBuku = new Stack<>();
    private Scanner scan = new Scanner(System.in);

    void tambahBuku() {
        System.out.print("Masukkan Nama Buku: ");
        String namaBuku = scan.nextLine();
        System.out.print("Masukkan Author   : ");
        String author = scan.nextLine();
        Buku newBuku = new Buku(namaBuku, author);
        tumpukanBuku.push(newBuku);
        System.out.println("-> Buku Telah Ditambahkan ke Tumpukan Buku Bacaan.\n");
    }

    void hapusBuku() {
        Buku bukuTerhapus;
        try {
            bukuTerhapus = tumpukanBuku.pop();
            System.out.println("-> Anda telah menyelesaikan buku " + bukuTerhapus.getNamaBuku());
            System.out.println("   Buku dihapus dari tumpukan buku bacaan");
        } catch (Exception e) {
            System.err.println("-> ERROR. Tumpukan Buku Bacaan Kosong.");
        }
        System.out.println("");
    }

    void tampilkanTumpukanBuku() {
        if (tumpukanBuku.empty()) {
            System.err.println("-> Tumpukan Buku Bacaan Kosong.\n");
            return;
        }
        System.out.println("-> Tumpukan Buku:");
        for (int i = tumpukanBuku.size() - 1; i >= 0; i--) {
            System.out.printf("\t| %-20s |\n", tumpukanBuku.get(i).getNamaBuku());
            System.out.printf("\t+----------------------+\n");
        }
        System.out.println("");
    }

    void tampilkanTopTumpukan() {
        if (tumpukanBuku.empty()) {
            System.err.println("-> Tumpukan Buku Bacaan Kosong.\n");
            return;
        }
        Buku bukuAtas = tumpukanBuku.peek();
        System.out.println("-> Buku paling atas dalam tumpukan buku bacaan :");
        System.out.println("---------------------------------------------");
        System.out.println("Nama Buku  : " + bukuAtas.getNamaBuku());
        System.out.println("Author     : " + bukuAtas.getAuthor());
        System.out.println("---------------------------------------------");
        System.out.println("");
    }
}
