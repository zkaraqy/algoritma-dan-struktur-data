package uts;

public class MergeSort extends ArrayAngka {

    void sort(int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            sort(left, mid);
            sort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2]; //temporary arrays  

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++) {
            L[i] = arrayAngka[left + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arrayAngka[mid + 1 + j];
        }

        i = 0;
        /* initial index of first sub-array */
        j = 0;
        /* initial index of second sub-array */
        k = left;
        /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arrayAngka[k] = L[i];
                i++;
            } else {
                arrayAngka[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arrayAngka[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arrayAngka[k] = R[j];
            j++;
            k++;
        }
    }
}
