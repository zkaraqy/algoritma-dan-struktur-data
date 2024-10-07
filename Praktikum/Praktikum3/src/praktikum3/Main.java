package praktikum3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa azka = new Mahasiswa("Muhammad Azka Raki", "2311016110005");
        Mahasiswa john = new Mahasiswa("John");
        Mahasiswa hussien = new Mahasiswa("Hussien", "2311016");
        Mahasiswa zaki = new Mahasiswa("Muhammad Azka Zaki", "2311016110005");
        Angkatan angkatan23 = new Angkatan();
        angkatan23.tambahMahasiswa(azka);
        angkatan23.tambahMahasiswa(john);
        angkatan23.tambahMahasiswa(hussien);
        angkatan23.tambahMahasiswa(zaki);

        System.out.print("Masukkan nama atau NIM mahasiswa yang ingin dicari: ");
        String dataMahasiswa = scan.nextLine();
        var mahasiswa = angkatan23.cariMahasiswa(dataMahasiswa);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan");
        } else {
            System.out.println("Mahasiswa dengan nama " + mahasiswa.getNama() + " dan NIM " + mahasiswa.getNIM() + " ditemukan");
        }
    }

}
