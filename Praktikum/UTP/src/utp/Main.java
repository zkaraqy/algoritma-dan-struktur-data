package utp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayPasien arrayPasien = new ArrayPasien();
        int pilihan;
        String namaLengkap;
        do {
            menu();
            System.out.print("Masukkan Nomor Pilihan : ");
            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    Pasien pasienBaru = new Pasien();
                    pasienBaru.isiDataPasien();
                    if (arrayPasien.tambahPasien(pasienBaru)) {
                        System.out.println("Pasien atas nama " + pasienBaru.getNamaLengkap() + " berhasil ditambahkan");
                    } else {
                        System.out.println("Array pasien telah penuh. Coba hapus pasien kemudian tambah lagi");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan Nama Lengkap : ");
                    namaLengkap = scan.nextLine();
                    namaLengkap = scan.nextLine();
                    if (arrayPasien.hapusPasien(namaLengkap)) {
                        System.out.println("Pasien atas nama " + namaLengkap + " berhasil dihapus");
                    } else {
                        System.out.println("Pasien atas nama " + namaLengkap + " tidak ditemukan");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan Nama Lengkap : ");
                    namaLengkap = scan.nextLine();
                    namaLengkap = scan.nextLine();
                    int index = arrayPasien.cariIndexPasien(namaLengkap);
                    if (index != -1) {
                        Pasien[] arrayDataPasien = arrayPasien.getArrayPasien();
                        Pasien dataPasien = arrayDataPasien[index];
                        System.out.println("Pasien atas nama " + dataPasien.getNamaLengkap() + " berhasil ditemukan.");
                        arrayPasien.printDataPasien(dataPasien);
                    } else {
                        System.out.println("Pasian atas nama " + namaLengkap + " tidak ditemukan");
                    }
                    break;

                case 4:
                    if (arrayPasien.getJumlahPasien() == 0) {
                        System.out.println("Rumah Sakit Belum Memiliki Pasien");
                        break;
                    }
                    arrayPasien.quickSortBerdasarkanNamaLengkap(0, arrayPasien.getJumlahPasien() - 1);
                    System.out.println("Array Pasien Setelah Diurutkan Berdasarkan Nama Lengkap : ");
                    arrayPasien.printSemuaDataPasien(0);
                    break;

                case 5:
                    if (arrayPasien.getJumlahPasien() == 0) {
                        System.out.println("Rumah Sakit Belum Memiliki Pasien");
                        break;
                    }
                    arrayPasien.quickSortBerdasarkanBeratBadan(0, arrayPasien.getJumlahPasien() - 1);
                    System.out.println("Array Pasien Setelah Diurutkan Berdasarkan Berat Badan : ");
                    arrayPasien.printSemuaDataPasien(0);
                    break;

                case 6:
                    if (arrayPasien.getJumlahPasien() == 0) {
                        System.out.println("Rumah Sakit Belum Memiliki Pasien");
                        break;
                    }
                    arrayPasien.quickSortBerdasarkanTinggiBadan(0, arrayPasien.getJumlahPasien() - 1);
                    System.out.println("Array Pasien Setelah Diurutkan Berdasarkan Tinggi Badan : ");
                    arrayPasien.printSemuaDataPasien(0);
                    break;

                case 7:
                    arrayPasien.printSemuaDataPasien(0);
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Input INVALID. ERROR");
            }
            System.out.println("-------------------------------------------------");
        } while (pilihan != 8);
    }

    static void menu() {
        System.out.println("");
        System.out.println("->  Program Manajemen Data Pasien Rumah Sakit  <-");
        System.out.println("-------------------------------------------------");
        System.out.println("Menu :");
        System.out.println("1. Tambah Pasien");
        System.out.println("2. Hapus Pasien");
        System.out.println("3. Cari Pasien Berdasarkan Nama Lengkap");
        System.out.println("4. Sorting Data-data Pasien Berdasarkan Nama");
        System.out.println("5. Sorting Data-data Pasien Berdasarkan Berat Badan");
        System.out.println("6. Sorting Data-data Pasien Berdasarkan Tinggi Badan");
        System.out.println("7. Tampilkan Semua Data Pasien");
        System.out.println("8. Keluar Dari Program");
        System.out.println("-------------------------------------------------");
    }
}
