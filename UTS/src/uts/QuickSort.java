package uts;

public class QuickSort {
    
    void QuickSort() {
        
    }

    // The QuickSort function implementation
    double[] sort(double[] arrayAngka, int low, int high) {
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(arrayAngka, low, high);

            // Recursion calls for smaller elements
            // and greater or equals elements
            sort(arrayAngka, low, pi - 1);
            sort(arrayAngka, pi + 1, high);
        }
        return arrayAngka;
    }

    // Partition function
    private int partition(double[] arrayAngka, int low, int high) {

        // Choose the pivot
        double pivot = arrayAngka[high];

        // Index of smaller element and indicates 
        // the right position of pivot found so far
        int i = low - 1;

        // Traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arrayAngka[j] < pivot) {
                i++;
                swap(arrayAngka, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(arrayAngka, i + 1, high);
        return i + 1;
    }

    // Swap function
    private void swap(double[] arrayAngka, int i, int j) {
        double temp = arrayAngka[i];
        arrayAngka[i] = arrayAngka[j];
        arrayAngka[j] = temp;
    }

}
