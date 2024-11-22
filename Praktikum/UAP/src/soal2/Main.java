package soal2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PersediaanBarang persediaanBarang = new PersediaanBarang();
        double hargaSatuan;
        int jumlahStok;
        String pilihan, kode, nama;
        do {
            menu();
            System.out.print("Masukkan pilihan : ");
            pilihan = scan.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Kode : ");
                    kode = scan.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Masukkan Harga Satuan : ");
                    hargaSatuan = scan.nextDouble();
                    System.out.print("Masukkan Jumlah Stok : ");
                    jumlahStok = scan.nextInt();
                    persediaanBarang.tambahBarang(kode, nama, hargaSatuan, jumlahStok);
                    break;
                case "2":
                    System.out.print("Masukkan Kode : ");
                    kode = scan.nextLine();
                    persediaanBarang.hapusBarang(kode);
                    break;
                case "3":
                    System.out.print("Masukkan Nama : ");
                    nama = scan.nextLine();
                    persediaanBarang.cariBarangBerdasarkanNama(nama);
                    break;
                case "4":
                    persediaanBarang.tampilkanTotalNilaiStokGudang();
                    break;
                case "5":
                    persediaanBarang.urutkanBerdasarkanKode();
                    break;
                case "6":
                    persediaanBarang.tambah20StokKeBarangTerakhir();
                    break;
                case "7":
                    return;
            }
            scan = new Scanner(System.in);
        } while (true);
    }

    static void menu() {
        System.out.println("1. Tambah Data Barang");
        System.out.println("2. Hapus Data Barang");
        System.out.println("3. Cari Barang Berdasarkan Nama");
        System.out.println("4. Tampilkan Total Nilai Stok Gudang");
        System.out.println("5. Urutkan Data Berdasarkan Kode Barang");
        System.out.println("6. Tambahkan 20 ke Stok Barang Terakhir");
        System.out.println("7. Keluar");
    }
}
