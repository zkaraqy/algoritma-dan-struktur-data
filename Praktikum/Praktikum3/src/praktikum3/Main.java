package praktikum3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa azka = new Mahasiswa("Muhammad Azka Raki", "2311016110005");
        Mahasiswa john = new Mahasiswa("John");
        Mahasiswa hussien = new Mahasiswa("Hussien", "2311016");
        Mahasiswa zaki = new Mahasiswa("Muhammad Azka Zaki", "2311016110005");
        Mahasiswa[] arrayMahasiswa = {azka, john, hussien, zaki};
        boolean found = false;
        System.out.print("Masukkan nama atau NIM mahasiswa yang ingin dicari: ");
        String cariMahasiswa = scan.nextLine();
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            String namaMahasiswa = arrayMahasiswa[i].getNama();
            String NIMMahasiswa = arrayMahasiswa[i].getNIM();
            if (namaMahasiswa.toLowerCase().contains(cariMahasiswa.toLowerCase())) {
                found = true;
                System.out.println("Mahasiswa " + namaMahasiswa + " ditemukan di indeks nomor " + i);
                continue;
            }
            if (NIMMahasiswa != null) {
                if (NIMMahasiswa.toLowerCase().contains(cariMahasiswa.toLowerCase())) {
                    found = true;
                    System.out.println("Mahasiswa " + namaMahasiswa + " ditemukan di indek nomor " + i);
                }
            }
        }
        if (!found) {
            System.out.println("Mahasiswa " + cariMahasiswa + " tidak ditemukan");
        }
    }

}
