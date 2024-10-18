package uts;

public class SequentialSearch {
    
    void SequentialSearch() {
        
    }

    int search(double[] arrayAngka, double target) {
        for (int i = 0; i < arrayAngka.length; i++) {
            if (arrayAngka[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
