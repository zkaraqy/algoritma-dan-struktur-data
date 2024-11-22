package soal2;

import java.util.LinkedList;

public class PersediaanBarang {

    private LinkedList<Barang> listBarang = new LinkedList<>();

    void tambahBarang(String kode, String nama, double hargaSatuan, int jumlahStok) {
        for (int i = 0; i < listBarang.size(); i++) {
            Barang barang = listBarang.get(i);
            if (barang.getKode().toLowerCase().contains(kode.toLowerCase())) {
                System.out.println("-> ERROR. Barang dengan kode ini sudah ada. Silakan masukkan kode yang berbeda.");
                System.out.println("");
                return;
            }
        }
        Barang barang = new Barang(kode, nama, hargaSatuan, jumlahStok);
        listBarang.add(barang);
        System.out.println("-> Barang " + nama + " Berhasil Ditambahkan");
        System.out.println("");
    }

    void hapusBarang(String kode) {
        for (int i = 0; i < listBarang.size(); i++) {
            Barang barang = listBarang.get(i);
            if (barang.getKode().equals(kode)) {
                listBarang.remove(i);
                System.out.println("-> Barang dengan kode " + kode + " Berhasil Dihapus");
                System.out.println("");
                return;
            }
        }
        System.out.println("-> ERROR. Barang tidak ditemukan.");
        System.out.println("");
    }

    void cariBarangBerdasarkanNama(String nama) {
        boolean ketemu = false;
        for (int i = 0; i < listBarang.size(); i++) {
            if (listBarang.get(i).getNama().toLowerCase().contains(nama.toLowerCase())) {
                Barang barang = listBarang.get(i);
                System.out.println(" Kode : " + barang.getKode());
                System.out.println(" Nama : " + barang.getNama());
                System.out.println(" Harga Satuan : " + barang.getHargaSatuan());
                System.out.println(" Jumlah Stok : " + barang.getJumlahStok());
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

    void tampilkanTotalNilaiStokGudang() {
        double total = 0;
        for (int i = 0; i < listBarang.size(); i++) {
            Barang barang = listBarang.get(i);
            total += barang.getJumlahStok() * barang.getHargaSatuan();
        }
        System.out.println("Total Nilai Stok Gudang : Rp " + total);
        System.out.println("");
    }

    void urutkanBerdasarkanKode() {
        for (int i = 0; i < listBarang.size() - 1; i++) {
            for (int j = 0; j < listBarang.size() - i - 1; j++) {
                if (listBarang.get(j).getKode().compareToIgnoreCase(listBarang.get(j + 1).getKode()) > 0) {
                    Barang temp = listBarang.get(j);
                    listBarang.set(j, listBarang.get(j + 1));
                    listBarang.set(j + 1, temp);
                }
            }
        }
        System.out.println("-> Data barang telah diurutkan berdasarkan kode secara ascending.");
        System.out.println("");
    }

    void tambah20StokKeBarangTerakhir() {
        Barang barang = listBarang.getLast();
        barang.setJumlahStok(barang.getJumlahStok() + 20);
        listBarang.set(listBarang.size() - 1, barang);
        System.out.println("-> Stok Barang Terakhir Telah Ditambah 20.");
        System.out.println("");
    }

}
