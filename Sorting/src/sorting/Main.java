package sorting;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 7, 1, 2, 9, 5, 18, 16, 92, 53, 2, 77};
        int n = arr.length - 1;
        ShellSort.shell(arr, n);
//        mergeSort(arr, 0, n);
        dislay(arr);
    }

    static void dislay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void mergeSort(int[] a, int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2]; //temporary arrays  

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        i = 0;
        /* initial index of first sub-array */
        j = 0;
        /* initial index of second sub-array */
        k = left;
        /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
