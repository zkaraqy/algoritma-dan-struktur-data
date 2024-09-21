package tugas2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[2][2];
        System.out.println("Masukkan elemen-elemen matriks 2x2 :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan elemen matriks baris-" + (i + 1) + " kolom-" + (j + 1) + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

        System.out.println("Determinan matriks tersebut adalah: " + determinant);

        int[][] cofactorMatrix = new int[2][2];
        // Cofactor(i, j) = (-1)^(i+j) * minor(i, j)
        cofactorMatrix[0][0] = matrix[1][1];
        cofactorMatrix[0][1] = -matrix[1][0];
        cofactorMatrix[1][0] = -matrix[0][1];
        cofactorMatrix[1][1] = matrix[0][0];

        System.out.println("Matriks kofaktor:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(cofactorMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        if (determinant == 0) {
            System.out.println("Matriks ini tidak memiliki invers (determinan = 0).");
        } else {
            double[][] inverseMatrix = new double[2][2];

            inverseMatrix[0][0] = matrix[1][1] / (double) determinant;
            inverseMatrix[0][1] = -matrix[0][1] / (double) determinant;
            inverseMatrix[1][0] = -matrix[1][0] / (double) determinant;
            inverseMatrix[1][1] = matrix[0][0] / (double) determinant;

            System.out.println("Invers dari matriks adalah:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("%.2f ", inverseMatrix[i][j]);
                }
                System.out.println();
            }
        }

    }
}
