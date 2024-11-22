package soal5;

import java.util.Scanner;

import java.util.Stack;

public class Main {

    static Stack<Integer[]> stackGenap = new Stack<>();
    static Stack<Integer[]> stackGanjil = new Stack<>();
    static Stack<Integer[]> stackTidakDiproses = new Stack<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Masukkan Kode Produk : ");
            String[] kode = scan.nextLine().split("");
            Integer[] arrKode = new Integer[kode.length];
            for (int i = 0; i < kode.length; i++) {
                arrKode[i] = Integer.valueOf(kode[i]);
            }
            sort(arrKode);
        } while (true);
    }

    static void sort(Integer[] arr) {
        if (arr[arr.length - 1] % 2 == 0 && arr[arr.length - 1] != 0) {
            stackGenap.add(arr);
            System.out.println("Kode Produk Ditambahkan ke Stack Genap");
        } else if (arr[arr.length - 1] % 2 == 1) {
            stackGanjil.add(arr);
            System.out.println("Kode Produk Ditambahkan ke Stack Ganjil");
        } else {
            stackTidakDiproses.add(arr);
            System.out.println("Kode Produk Ditambahkan ke Stack Tidak Diproses");
        }
        System.out.println("");
    }

}
