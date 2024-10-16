package utp;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPasien {

    static int length = 15;
    private Pasien[] arrayPasien = new Pasien[length];
    private int jumlahPasien = 0;

    public int getJumlahPasien() {
        return jumlahPasien;
    }

    public ArrayPasien() {
//        System.out.println(Arrays.toString(arrayPasien));
    }

    public Pasien[] getArrayPasien() {
        return arrayPasien;
    }

    boolean tambahPasien(Pasien pasien) {
        if (jumlahPasien < length) {
            arrayPasien[jumlahPasien] = pasien;
            jumlahPasien++;
            return true;
        } else {
            return false;
        }
    }

    boolean hapusPasien(String namaLengkap) {
        if (this.jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return false;
        }
        int index = cariIndexPasien(namaLengkap);
        if (index == -1) {
            System.out.println("Pasian atas nama " + namaLengkap + " tidak ditemukan");
            return false;
        }
        arrayPasien[index] = null;
        return true;
    }

    int cariIndexPasien(String namaLengkap) {
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return -1;
        }
        for (int i = 0; i < arrayPasien.length; i++) {
            Pasien pasien = arrayPasien[i];
            if (pasien.getNamaLengkap().equalsIgnoreCase(namaLengkap)) {
                return i;
            }
        }
        return -1;
    }

    void quickSortBerdasarkanBeratBadan(int low, int high) {
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return;
        }
        if (low < high) {
            int pivotIndex = partitionBeratBadan(low, high);

            quickSortBerdasarkanBeratBadan(low, pivotIndex - 1);
            quickSortBerdasarkanBeratBadan(pivotIndex + 1, high);
        }
    }

    private int partitionBeratBadan(int low, int high) {
        double pivot = arrayPasien[high].getBeratBadan();
        int i = low - 1;
        i = rekurcionSwapDataBeratBadan(low, high, pivot, i);
        System.out.println(i);
        double temp = arrayPasien[i + 1].getBeratBadan();
        arrayPasien[i + 1].setBeratBadan(arrayPasien[high].getBeratBadan());
        arrayPasien[high].setBeratBadan(temp);

        return i + 1;
    }

    private int rekurcionSwapDataBeratBadan(int j, int high, double pivot, int i) {
        if (j >= high) {
            return i;
        }
        double data = arrayPasien[j].getBeratBadan();
        if (data <= pivot) {
            i++;
            double temp = arrayPasien[i].getBeratBadan();
            arrayPasien[i].setBeratBadan(arrayPasien[j].getBeratBadan());
            arrayPasien[j].setBeratBadan(temp);
        }
        j += 1;
        return rekurcionSwapDataBeratBadan(j, high, pivot, i);
    }

    void quickSortBerdasarkanTinggiBadan(int low, int high) {
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return;
        }
        if (low < high) {
            int pivotIndex = partitionTinggiBadan(low, high);

            quickSortBerdasarkanTinggiBadan(low, pivotIndex - 1);
            quickSortBerdasarkanTinggiBadan(pivotIndex + 1, high);
        }
    }

    private int partitionTinggiBadan(int low, int high) {
        double pivot = arrayPasien[high].getTinggiBadan();
        int i = low - 1;
        i = rekurcionSwapDataTinggiBadan(low, high, pivot, i);
        double temp = arrayPasien[i + 1].getTinggiBadan();
        arrayPasien[i + 1].setTinggiBadan(arrayPasien[high].getTinggiBadan());
        arrayPasien[high].setTinggiBadan(temp);

        return i + 1;
    }

    private int rekurcionSwapDataTinggiBadan(int j, int high, double pivot, int i) {
        if (j >= high) {
            return i;
        }
        double data = arrayPasien[j].getTinggiBadan();
        if (data <= pivot) {
            i++;
            double temp = arrayPasien[i].getTinggiBadan();
            arrayPasien[i].setTinggiBadan(arrayPasien[j].getTinggiBadan());
            arrayPasien[j].setTinggiBadan(temp);
        }
        j += 1;
        return rekurcionSwapDataTinggiBadan(j, high, pivot, i);
    }

    void quickSortBerdasarkanNamaLengkap(int low, int high) {
        System.out.println(high);
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return;
        }
        if (low < high) {
            int pivotIndex = partitionNamaLengkap(low, high);

            quickSortBerdasarkanNamaLengkap(low, pivotIndex - 1);
            quickSortBerdasarkanNamaLengkap(pivotIndex + 1, high);
        }
    }

    private int partitionNamaLengkap(int low, int high) {
        String pivot = arrayPasien[high].getNamaLengkap();
        int i = low - 1;
        i = rekurcionSwapDataNamaLengkap(low, high, pivot, i);
        String temp = arrayPasien[i + 1].getNamaLengkap();
        arrayPasien[i + 1].setNamaLengkap(arrayPasien[high].getNamaLengkap());
        arrayPasien[high].setNamaLengkap(temp);

        return i + 1;
    }

    private int rekurcionSwapDataNamaLengkap(int j, int high, String pivot, int i) {
        if (j >= high) {
            return i;
        }
        String data = arrayPasien[j].getNamaLengkap();
        if (data.compareToIgnoreCase(data) < 0) {
            i++;
            String temp = arrayPasien[i].getNamaLengkap();
            arrayPasien[i].setNamaLengkap(arrayPasien[j].getNamaLengkap());
            arrayPasien[j].setNamaLengkap(temp);
        }
        j += 1;
        return rekurcionSwapDataNamaLengkap(j, high, pivot, i);
    }

    void printSemuaDataPasien(int i) {
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return;
        }
        if (i >= jumlahPasien) {
            return;
        }
        printDataPasien(arrayPasien[i]);
        printSemuaDataPasien(++i);
    }

    void printDataPasien(Pasien pasien) {
        if (jumlahPasien == 0) {
            System.out.println("Rumah Sakit Belum Memiliki Pasien");
            return;
        }
        System.out.println("------------------------------------------");
        System.out.println("Nama Lengkap : " + pasien.getNamaLengkap());
        System.out.println("Tanggal Lahir : " + pasien.getTanggalLahir());
        System.out.println("Riwayat Penyakit : " + pasien.getRiwayatPenyakit());
        System.out.println("Golongan Darah : " + pasien.getGolonganDarah());
        System.out.println("Dokter Penanggung Jawab : " + pasien.getDokterPenanggungJawab());
        System.out.println("Berat Badan : " + pasien.getBeratBadan() + " Kg");
        System.out.println("Tinggi Badan : " + pasien.getTinggiBadan() + " Cm");
        System.out.println("------------------------------------------");
    }

}
