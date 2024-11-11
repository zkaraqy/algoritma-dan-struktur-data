package uts;

public class QuickSort {
    
    void QuickSort() {
        
    }

    double[] sort(double[] arrayAngka, int low, int high) {
        if (low < high) {

            int pi = partition(arrayAngka, low, high);

            sort(arrayAngka, low, pi - 1);
            sort(arrayAngka, pi + 1, high);
        }
        return arrayAngka;
    }


    private int partition(double[] arrayAngka, int low, int high) {

        double pivot = arrayAngka[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arrayAngka[j] < pivot) {
                i++;
                swap(arrayAngka, i, j);
            }
        }

        swap(arrayAngka, i + 1, high);
        return i + 1;
    }

    private void swap(double[] arrayAngka, int i, int j) {
        double temp = arrayAngka[i];
        arrayAngka[i] = arrayAngka[j];
        arrayAngka[j] = temp;
    }

}
