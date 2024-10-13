package uts;

public class QuickSort extends ArrayAngka {

    // The QuickSort function implementation
    void sort(int low, int high) {
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(low, high);

            // Recursion calls for smaller elements
            // and greater or equals elements
            sort(low, pi - 1);
            sort(pi + 1, high);
        }
    }

    // Partition function
    private int partition(int low, int high) {

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
                swap(i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(i + 1, high);
        return i + 1;
    }

    // Swap function
    private void swap(int i, int j) {
        double temp = arrayAngka[i];
        arrayAngka[i] = arrayAngka[j];
        arrayAngka[j] = temp;
    }

}
