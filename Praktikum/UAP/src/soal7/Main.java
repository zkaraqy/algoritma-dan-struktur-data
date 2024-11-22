package soal7;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<String, Double> penilaianMahasiswa = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nama  : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Nilai : ");
            double nilai = scan.nextDouble();
            penilaianMahasiswa.put(nama, nilai);
            System.out.println("");
            scan = new Scanner(System.in);
        }
        do {
            menu();
            System.out.print("Masukkan Pilihan : ");
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    tampikanSkorTerendahDanTertinggi();
                    break;
                case 2:
                    tampilkanRataRataSkor();
                    break;
                case 3:
                    urutkanDanTampilkan();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("");
            }
        } while (true);
    }

    static void menu() {
        System.out.println("1. Tampilan Nama Mahasiswa yang Memiliki Skor Terendah dan Tertinggi");
        System.out.println("2. Tampilkan Rata-rata Skor Mahasiswa");
        System.out.println("3. Tampilkan Urutan Mahasiswa Secara Ascending dan Descending");
        System.out.println("4. Keluar");
    }

    static void tampikanSkorTerendahDanTertinggi() {
        double nilaiMin = Double.MAX_VALUE, nilaiMax = Double.MIN_VALUE;
        String namaMin = "", namaMax = "";

        for (Map.Entry<String, Double> entry : penilaianMahasiswa.entrySet()) {
            if (entry.getValue() < nilaiMin) {
                nilaiMin = entry.getValue();
                namaMin = entry.getKey();
            }
            if (entry.getValue() > nilaiMax) {
                nilaiMax = entry.getValue();
                namaMax = entry.getKey();
            }
        }

        System.out.println("Mahasiswa dengan skor terendah:");
        System.out.println("Nama : " + namaMin);
        System.out.println("Nilai: " + nilaiMin);
        System.out.println("");
        System.out.println("Mahasiswa dengan skor tertinggi:");
        System.out.println("Nama : " + namaMax);
        System.out.println("Nilai: " + nilaiMax);
        System.out.println("");
    }

    static void tampilkanRataRataSkor() {
        double rataRata = 0;
        for (double nilai : penilaianMahasiswa.values()) {
            rataRata += nilai;
        }
        rataRata /= penilaianMahasiswa.size();
        System.out.println("Rata-rata skor mahasiswa: " + rataRata);
        System.out.println("");
    }

    static void urutkanDanTampilkan() {
        int sizeHashMap = penilaianMahasiswa.size();
        String[] namaArray = new String[sizeHashMap];
        double[] nilaiArray = new double[sizeHashMap];

        int index = 0;
        for (Map.Entry<String, Double> entry : penilaianMahasiswa.entrySet()) {
            namaArray[index] = entry.getKey();
            nilaiArray[index] = entry.getValue();
            index++;
        }

        for (int i = 0; i < sizeHashMap - 1; i++) {
            for (int j = 0; j < sizeHashMap - 1 - i; j++) {
                if (nilaiArray[j] > nilaiArray[j + 1]) {
                    double tempNilai = nilaiArray[j];
                    nilaiArray[j] = nilaiArray[j + 1];
                    nilaiArray[j + 1] = tempNilai;

                    String tempNama = namaArray[j];
                    namaArray[j] = namaArray[j + 1];
                    namaArray[j + 1] = tempNama;
                }
            }
        }

        System.out.println("Urutan mahasiswa berdasarkan nilai (Ascending) :");
        for (int i = 0; i < sizeHashMap; i++) {
            System.out.println((i + 1) + ". Nama: " + namaArray[i] + ", Nilai: " + nilaiArray[i]);
        }
        System.out.println("");
        for (int i = 0; i < sizeHashMap - 1; i++) {
            for (int j = 0; j < sizeHashMap - 1 - i; j++) {
                if (nilaiArray[j] < nilaiArray[j + 1]) {
                    double tempNilai = nilaiArray[j];
                    nilaiArray[j] = nilaiArray[j + 1];
                    nilaiArray[j + 1] = tempNilai;

                    String tempNama = namaArray[j];
                    namaArray[j] = namaArray[j + 1];
                    namaArray[j + 1] = tempNama;
                }
            }
        }

        System.out.println("Urutan mahasiswa berdasarkan nilai (Descending) :");
        for (int i = 0; i < sizeHashMap; i++) {
            System.out.println((i + 1) + ". Nama: " + namaArray[i] + ", Nilai: " + nilaiArray[i]);
        }
        System.out.println("");
    }

}
