package soal3;

import java.util.Queue;
import java.util.LinkedList;

public class AntrianPasien {

    private Queue<Integer> antrianPasien = new LinkedList<>();

    public AntrianPasien() {
        for (int i = 1; i <= 5; i++) {
            antrianPasien.add(i);
        }
    }

    void keluarkanPasienPertama() {
        int IdPasien = antrianPasien.remove();
        System.out.println("-> Pasien dengan ID " + IdPasien + " telah dikeluarkan dari antrian");
        System.out.println("");
    }

    void tambahPasien(int id) {
        antrianPasien.add(id);
        System.out.println("-> Pasien dengan ID " + id + " berhasil ditambahkan");
        System.out.println("");
    }

    void tukarPosisiDuaPasienPertama() {
        int pasienPertama = antrianPasien.remove();
        int pasienKedua = antrianPasien.remove();
        antrianPasien.add(pasienKedua);
        antrianPasien.add(pasienPertama);
        for (int i = 0; i < antrianPasien.size() - 2; i++) {
            antrianPasien.add(antrianPasien.remove());
        }
        System.out.println("-> Posisi dua pasien pertama telah ditukar.");
        System.out.println("");
    }

    void gandakanIdPasienTerakhir() {
        int pasienTerakhir = 0;
        for (int id : antrianPasien) {
            pasienTerakhir = id;
        }
        antrianPasien.add(pasienTerakhir);
        System.out.println("-> Pasien terakhir dengan ID " + pasienTerakhir + " telah digandakan.");
        System.out.println("");
    }

    void pindahPasienTerakhirKeAwal() {
        Queue<Integer> antrianPasienSementara = new LinkedList<>();
        int pasienTerakhir = 0;
        for (int id : antrianPasien) {
            pasienTerakhir = id;
        }

        while (!antrianPasien.isEmpty()) {
            int id = antrianPasien.remove();
            if (id != pasienTerakhir) {
                antrianPasienSementara.add(id);
            }
        }

        antrianPasien.add(pasienTerakhir);
        while (!antrianPasienSementara.isEmpty()) {
            antrianPasien.add(antrianPasienSementara.remove());
        }

        System.out.println("-> Pasien terakhir dengan ID " + pasienTerakhir + " telah dipindahkan ke awal antrian.");
        System.out.println("");
    }

    void keluarkanPasienDenganIdTerkecil() {
        int minId = Integer.MAX_VALUE;
        Queue<Integer> antrianSementara = new LinkedList<>();
        boolean idTerkecilTerhapus = false;
        for (int id : antrianPasien) {
            if (id < minId) {
                minId = id;
            }
        }
        while (!antrianPasien.isEmpty()) {
            int id = antrianPasien.remove();
            if (id == minId && !idTerkecilTerhapus) {
                idTerkecilTerhapus = true;
            } else {
                antrianSementara.add(id);
            }
        }
        antrianPasien = antrianSementara;
        System.out.println("-> Pasien dengan ID terkecil " + minId + " telah dikeluarkan dari antrian.");
        System.out.println("");
    }

    void tindakanKhususNomor6() {
        Queue<Integer> antrianSementara = new LinkedList<>();
        int jumlahPasien = antrianPasien.size();
        if (jumlahPasien % 2 == 0) {
            int indeksTengah = (jumlahPasien / 2) - 1;
            for (int i = 0; i < jumlahPasien; i++) {
                int id = antrianPasien.remove();
                if (i == indeksTengah) {
                    System.out.println("-> Pasien tengah dengan ID " + id + " telah dikeluarkan.");
                } else {
                    antrianSementara.add(id);
                }
            }
            antrianPasien = antrianSementara;
        } else {
            antrianPasien.add(999);
            System.out.println("-> Jumlah pasien ganjil, ID baru 999 telah ditambahkan ke antrian.");
        }
        System.out.println("");
    }

    void balik() {
        int n = antrianPasien.size();
        int[] arrayPasien = new int[n];
        int index = 0;
        while (!antrianPasien.isEmpty()) {
            arrayPasien[index++] = antrianPasien.remove();
        }
        for (int i = n - 1; i >= 0; i--) {
            antrianPasien.add(arrayPasien[i]);
        }
        System.out.println("-> Antrian telah dibalik.");
        System.out.println("");
    }

    void hapusSemuaPasienDenganIDLebihKecilDari10() {
        Queue<Integer> antrianPasienSementara = new LinkedList<>();
        while (!antrianPasien.isEmpty()) {
            int id = antrianPasien.remove();
            if (id >= 10) {
                antrianPasienSementara.add(id);
            }
        }
        antrianPasien = antrianPasienSementara;
        System.out.println("-> Semua pasien dengan ID lebih kecil dari 10 telah dihapus dari antrian.");
        System.out.println("");
    }

    void tindakanKhususNomor9() {
        Queue<Integer> antrianPasienSementara = new LinkedList<>();
        while (!antrianPasien.isEmpty()) {
            int id = antrianPasien.remove();
            if (id <= 999) {
                antrianPasienSementara.add(id);
            }
        }
        antrianPasien = antrianPasienSementara;
        System.out.println("-> Semua pasien dengan ID lebih besar dari 999 telah dihapus dari antrian.");
        System.out.println("");
    }

}
