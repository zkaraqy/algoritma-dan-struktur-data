package uts;

public class BinarySearch extends ArrayAngka {

    int search(double target) {
        int start = 0;
        int end = arrayAngka.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arrayAngka[mid] == target) {
                return mid;
            } else if (arrayAngka[mid] < target) {
                start = mid + 1;
            } else if (arrayAngka[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

}
