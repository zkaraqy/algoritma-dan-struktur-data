package tugasarray;

import java.util.Arrays;
import java.util.Scanner;

public class Matriks {

    private static Scanner scan = new Scanner(System.in);
    private int baris, kolom;
    private int[][] matriks;
    private int nomorMatriks;

    public Matriks(int nomorMatriks) {
        this.nomorMatriks = nomorMatriks;
    }

    void setDimensi() {
        System.out.print("Masukkan jumlah baris matriks " + nomorMatriks + " : ");
        baris = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks " + nomorMatriks + " : ");
        kolom = scan.nextInt();
        this.matriks = new int[baris][kolom];
    }

    static boolean isSameDimensionMatriks(int[][] matriks1, int[][] matriks2) {
        if (matriks1.length != matriks2.length) {
            return false;
        }
        for (int i = 0; i < matriks1.length; i++) {
            if (matriks1[i].length != matriks2[i].length) {
                return false;
            }
        }
        return true;
    }

    static void print(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            int[] is = matriks[i];
            System.out.println(Arrays.toString(is));
        }
    }

    int[][] inputElemenMatriks() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen matriks-" + nomorMatriks + " baris-" + (i + 1) + " kolom-" + (j + 1) + " : ");
                matriks[i][j] = scan.nextInt();
            }
        }
        return matriks;
    }

    int[][] getMatriks() {
        return matriks;
    }

}
