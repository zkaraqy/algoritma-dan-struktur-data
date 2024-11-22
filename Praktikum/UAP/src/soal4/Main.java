package soal4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pabrik pabrik = new Pabrik();
        String pilihan;
        int nomorSeri;
        do {
            menu();
            System.out.print("Masukkan Pilihan : ");
            pilihan = scan.nextLine();
            switch (pilihan) {
                case "A":
                    System.out.print("Masukkan nomor seri = ");
                    nomorSeri = scan.nextInt();
                    pabrik.tambah(nomorSeri);
                    break;
                case "R":
                    pabrik.keluarkan();
                    break;
                case "D":
                    pabrik.duplikasi();
                    break;
                case "M":
                    pabrik.gabung();
                    break;
                case "F":
                    System.out.print("Masukkan nomor seri = ");
                    nomorSeri = scan.nextInt();
                    pabrik.pindahKeAwal(nomorSeri);
                    break;
                case "B":
                    pabrik.balik();
                    break;
                case "O":
                    pabrik.hapusNomorSeriGanjil();
                    break;
                case "E":
                    pabrik.hapusNomorSeriGenap();
                    break;
                case "X":
                    return;
                default:
                    System.out.println("");
                    break;
            }
            scan = new Scanner(System.in);
        } while (true);

    }

    static void menu() {
        System.out.println("A. Tambah");
        System.out.println("R. Keluarkan");
        System.out.println("D. Duplikasi");
        System.out.println("M. Gabungkan");
        System.out.println("F. Pindah ke Awal");
        System.out.println("B. Balikkan");
        System.out.println("O. Hapus Ganjil");
        System.out.println("E. Hapus Genap");
        System.out.println("X. Exit");
    }

}
