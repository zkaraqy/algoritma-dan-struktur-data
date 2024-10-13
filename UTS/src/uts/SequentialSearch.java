package uts;

public class SequentialSearch extends ArrayAngka {

    int search(double target) {
        for (int i = 0; i < arrayAngka.length; i++) {
            if (arrayAngka[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
