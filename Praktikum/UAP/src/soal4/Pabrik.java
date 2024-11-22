package soal4;

import java.util.Queue;
import java.util.LinkedList;

public class Pabrik {

    private Queue<Integer> pabrik = new LinkedList<>();

    public Pabrik() {
        for (int i = 1; i <= 5; i++) {
            pabrik.add(i);
        }
    }

    void tambah(int nomorSeri) {
        pabrik.add(nomorSeri);
        System.out.println("-> Bahan baku dengan nomor seri " + nomorSeri + " telah ditambahkan");
        System.out.println("");
    }

    void keluarkan() {
        int nomorSeri = pabrik.remove();
        System.out.println("-> Bahan baku dengan nomor seri " + nomorSeri + " telah ditambahkan");
        System.out.println("");
    }

    void duplikasi() {
        int nomorSeri = pabrik.peek();
        pabrik.add(nomorSeri);
        System.out.println("-> Bahan baku dengan nomor seri " + nomorSeri + " telah diduplikat");
        System.out.println("");
    }

    void gabung() {
        int nomorSeriBahanPertama = pabrik.remove();
        int nomorSeriBahanKedua = pabrik.remove();
        int hasilGabung = nomorSeriBahanPertama + nomorSeriBahanKedua;
        pabrik.add(hasilGabung);
        pabrik.add(nomorSeriBahanPertama);
        pabrik.add(nomorSeriBahanKedua);
        System.out.println("-> Bahan baku dengan nomor seri " + nomorSeriBahanPertama + " dan " + nomorSeriBahanKedua
                + "\ntelah digabung menjadi " + hasilGabung);
        System.out.println("");
    }

    void pindahKeAwal(int nomorSeri) {
        Queue<Integer> antrianSementara = new LinkedList<>();
        boolean ketemu = false;
        while (!pabrik.isEmpty()) {
            int nomorSeriBahan = pabrik.remove();
            if (nomorSeriBahan == nomorSeri && !ketemu) {
                ketemu = true;
            } else {
                antrianSementara.add(nomorSeriBahan);
            }
        }
        if (ketemu) {
            pabrik.add(nomorSeri);
            isiPabrik(antrianSementara);
            System.out.println("-> Bahan baku dengan nomor seri " + nomorSeri + " telah dipindahkan ke posisi paling depan.");
        } else {
            isiPabrik(antrianSementara);
            System.out.println("-> Bahan baku dengan nomor seri " + nomorSeri + " tidak ditemukan.");
        }

        System.out.println("");
    }

    void balik() {
        int[] arraySementara = new int[pabrik.size()];
        for (int i = 0; i < pabrik.size(); i++) {
            int nomorSeri = pabrik.poll();
            arraySementara[i] = nomorSeri;
        }
        for (int i = arraySementara.length - 1; i >= 0; i--) {
            pabrik.add(arraySementara[i]);
        }
        System.out.println("-> Antrian telah dibalikkan");
        System.out.println("");
    }

    void hapusNomorSeriGanjil() {
        Queue<Integer> antrianSementara = new LinkedList<>();
        boolean ketemu = false;
        while (!pabrik.isEmpty()) {
            int nomorSeriBahan = pabrik.remove();
            if (nomorSeriBahan % 2 == 1 && !ketemu) {
                ketemu = true;
            } else {
                antrianSementara.add(nomorSeriBahan);
            }
        }
        isiPabrik(antrianSementara);
        System.out.println("-> Semua Bahan Baku Dengan Nomor Seri Ganjil Telah Terhapus");
        System.out.println("");
    }

    void hapusNomorSeriGenap() {
        Queue<Integer> antrianSementara = new LinkedList<>();
        boolean ketemu = false;
        while (!pabrik.isEmpty()) {
            int nomorSeriBahan = pabrik.remove();
            if (nomorSeriBahan % 2 == 0 && !ketemu) {
                ketemu = true;
            } else {
                antrianSementara.add(nomorSeriBahan);
            }
        }
        isiPabrik(antrianSementara);
        System.out.println("-> Semua Bahan Baku Dengan Nomor Seri Genap Telah Terhapus");
        System.out.println("");
    }

    private void isiPabrik(Queue<Integer> antrian) {
        for (int nomorSeri : antrian) {
            pabrik.add(nomorSeri);
        }
    }

}
