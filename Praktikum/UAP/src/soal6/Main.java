package soal6;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Stack<String> penyimpananUtama = new Stack<>();
    static Stack<String> penyimpananCadangan = new Stack<>();
    static Stack<String> penyimpananRejected = new Stack<>();
    static int sizePenyimpananUtama = 5, sizePenyimpananCadangan = 5, sizePenyimpananRejected = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Masukkan Kode Produk : ");
            String kodeProduk = scan.nextLine();
            simpan(kodeProduk);
        } while (true);
    }

    static void simpan(String kode) {
        if (sizePenyimpananUtama > 0) {
            penyimpananUtama.add(kode);
            sizePenyimpananUtama--;
            System.out.println("-> Barang tersimpan di penyimpanan utama");
            System.out.println("");
            return;
        }
        if (sizePenyimpananCadangan > 0) {
            penyimpananCadangan.add(kode);
            sizePenyimpananCadangan--;
            System.out.println("-> Barang tersimpan di penyimpanan cadangan");
            System.out.println("");
            return;
        }
        if (sizePenyimpananRejected > 0) {
            penyimpananRejected.add(kode);
            sizePenyimpananRejected--;
            System.out.println("-> Barang tersimpan di penyimpanan tidak dapat diterima (rejected)");
            System.out.println("");
        }
    }

}
