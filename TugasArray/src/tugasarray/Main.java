package tugasarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matriks1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        int[][] matriks2 = {
            {6, 8, 7},
            {1, 8, 2},
            {2, 0},
        };
        
        print2DArray(OperasiMatriks.jumlahkan(matriks1, matriks2));
    }
    
    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] is = arr[i];
            System.out.println(Arrays.toString(is));
        }
    }

}
