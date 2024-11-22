package soal1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AkademikMahasiswa akademikMahasiswa = new AkademikMahasiswa();
        System.out.println("\tProgram Akademik Mahasiswa");
        String pilihan, nama, NIM;
        do {
            menu();
            System.out.print("Masukkan pilihan = ");
            pilihan = scan.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Masukkan NIM : ");
                    NIM = scan.nextLine();
                    System.out.print("Masukkan IPK : ");
                    double IPK = scan.nextDouble();
                    System.out.print("Masukkan SKS : ");
                    int sks = scan.nextInt();
                    akademikMahasiswa.tambahDataMahasiswa(NIM, nama, IPK, sks);
                    break;
                case "2":
                    System.out.print("Masukkan NIM : ");
                    NIM = scan.nextLine();
                    scan.nextLine();
                    akademikMahasiswa.hapusDataMahasiswa(NIM);
                    break;
                case "3":
                    System.out.print("Masukkan Nama : ");
                    nama = scan.nextLine();
                    akademikMahasiswa.cariDataMahasiswa(nama);
                    break;
                case "4":
                    akademikMahasiswa.tampilkanRataRataIPK();
                    break;
                case "5":
                    akademikMahasiswa.urutkanBerdasarkanNIM();
                    break;
                case "6":
                    akademikMahasiswa.hapusSemuaMahasiswaDenganIPKLebihKecilDari2();
                    break;
                case "7":
                    return;
            }
            scan = new Scanner(System.in);
        } while (true);
    }

    static void menu() {
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Hapus Data Mahasiswa");
        System.out.println("3. Cari Mahasiswa Berdasarkan Nama");
        System.out.println("4. Tampilkan Rata-rata IPK");
        System.out.println("5. Urutkan Data Berdasarkan NIM");
        System.out.println("6. Hapus Semua Mahasiswa Dengan IPK < 2");
        System.out.println("7. Keluar");
    }
}
