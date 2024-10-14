package praktikum4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAngka {

    public int length = 15;
    private double[] arrayAngka = new double[length];

    private void setAngkaDiIndex(int index, double angka) {
        arrayAngka[index] = angka;
    }

    void isiArrayAngka() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            double angka = scan.nextDouble();
            setAngkaDiIndex(i, angka);
        }
    }

    void printArray(String message) {
        System.out.println(message + " :\n" + Arrays.toString(arrayAngka));
    }

    void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);

            printArray("Proses Pengurutan");
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = arrayAngka[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arrayAngka[j] <= pivot) {
                i++;
                double temp = arrayAngka[i];
                arrayAngka[i] = arrayAngka[j];
                arrayAngka[j] = temp;
            }
        }
        double temp = arrayAngka[i + 1];
        arrayAngka[i + 1] = arrayAngka[high];
        arrayAngka[high] = temp;

        return i + 1;
    }
}
