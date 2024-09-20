package tugasarray;

import java.util.Arrays;
import java.util.Scanner;

public class Matriks {

    private static Scanner scan = new Scanner(System.in);

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

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] is = arr[i];
            System.out.println(Arrays.toString(is));
        }
    }

    static int[][] input(int baris, int kolom, int nomorMatriks) {
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("Masukkan elemen matriks-" + nomorMatriks + " baris-" + i + " kolom-" + j + " : ");
                matriks[i][j] = scan.nextInt();
            }
        }
        return matriks;
    }
}
