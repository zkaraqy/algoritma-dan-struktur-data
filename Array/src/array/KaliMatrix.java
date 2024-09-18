package array;

import java.util.Scanner;

public class KaliMatrix {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int matrix1[][] = new int[2][2];
        matrix1[0][0] = 5;
        matrix1[0][1] = 0;
        matrix1[1][0] = 2;
        matrix1[1][1] = 2;
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1.length; j++) {
//                System.out.print("Matrix 1 elem: (" + i + "," + j + ") = ");
//                matrix1[i][j] = scan.nextInt();
//            }
//        }
        System.out.println("");

        int matrix2[][] = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 0;
        matrix2[1][0] = 4;
        matrix2[1][1] = 2;
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2.length; j++) {
//                System.out.print("Matrix 2 elem: (" + i + "," + j + ") = ");
//                matrix2[i][j] = scan.nextInt();
//            }
//        }

        int matrix3[][] = new int[2][2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                int total = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    total = total + (matrix1[i][k] * matrix2[k][j]);
                }
                matrix3[i][j] = total;
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
