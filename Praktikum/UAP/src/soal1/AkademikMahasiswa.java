package soal1;

import java.util.LinkedList;

public class AkademikMahasiswa {

    LinkedList<Mahasiswa> listMahasiswa = new LinkedList<>();

    void tambahDataMahasiswa(String NIM, String nama, double IPK, int sks) {
        Mahasiswa mahasiswa = new Mahasiswa(NIM, nama, IPK, sks);
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getNIM().equalsIgnoreCase(NIM)) {
                System.out.println("Data mahasiswa dengan NIM ini sudah ada, silakan masukkan NIM yang berbeda.");
                System.out.println("");
                return;
            }
        }
        listMahasiswa.add(mahasiswa);
        System.out.println("-> Mahasiswa " + nama + " telah ditambahkan.");
        System.out.println("");
    }

    void hapusDataMahasiswa(String NIM) {
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getNIM().equalsIgnoreCase(NIM)) {
                listMahasiswa.remove(i);
                System.out.println("-> Data mahasiswa dengan NIM " + NIM + " telah dihapus");
                System.out.println("");
                return;
            }
        }
        System.out.println("-> ERROR. Data mahasiswa tidak ditemukan.");
        System.out.println("");
        return;
    }

    void cariDataMahasiswa(String nama) {
        boolean ketemu = false;
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getNama().toLowerCase().contains(nama.toLowerCase())) {
                Mahasiswa mahasiswa = listMahasiswa.get(i);
                System.out.println(" Nama : " + mahasiswa.getNama());
                System.out.println(" NIM  : " + mahasiswa.getNIM());
                System.out.println(" IPK  : " + mahasiswa.getIPK());
                System.out.println(" SKS  : " + mahasiswa.getSksYangTelahDitempuh());
                System.out.println("--------------------------------------------");
                ketemu = true;
            }
        }
        if (ketemu) {
            return;
        }
        System.out.println("-> ERROR. Data mahasiswa tidak ditemukan.");
        System.out.println("");
    }

    void tampilkanRataRataIPK() {
        double rataRata = 0;
        for (int i = 0; i < listMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = listMahasiswa.get(i);
            rataRata += mahasiswa.getIPK();
        }
        rataRata /= listMahasiswa.size();
        System.out.println("Rata-rata IPK Mahasiswa = " + rataRata);
        System.out.println("");
    }

    void urutkanBerdasarkanNIM() {
        for (int i = 0; i < listMahasiswa.size() - 1; i++) {
            for (int j = 0; j < listMahasiswa.size() - i - 1; j++) {
                if (listMahasiswa.get(j).getNIM().compareToIgnoreCase(listMahasiswa.get(j + 1).getNIM()) > 0) {
                    Mahasiswa temp = listMahasiswa.get(j);
                    listMahasiswa.set(j, listMahasiswa.get(j + 1));
                    listMahasiswa.set(j + 1, temp);
                }
            }
        }
        System.out.println("-> Data mahasiswa telah diurutkan berdasarkan NIM secara ascending.");
        System.out.println("");
    }

    void hapusSemuaMahasiswaDenganIPKLebihKecilDari2() {
        boolean terhapus = false;
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getIPK() < 2) {
                listMahasiswa.remove(i);
                i--;
                terhapus = true;
            }
        }
        if (terhapus) {
            System.out.println("-> Semua mahasiswa dengan IPK kurang dari 2 telah dihapus.");
        } else {
            System.out.println("-> ERROR. Data mahasiswa tidak ditemukan.");
        }
        System.out.println("");
    }

}
