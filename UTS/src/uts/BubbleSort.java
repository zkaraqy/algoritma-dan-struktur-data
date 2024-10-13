package uts;

public class BubbleSort extends ArrayAngka {

    void sort() {
        for (int i = 0; i < arrayAngka.length - 1; i++) {
            for (int j = 0; j < arrayAngka.length - i - 1; j++) {
                double temp = arrayAngka[j];
                arrayAngka[j] = arrayAngka[j + 1];
                arrayAngka[j + 1] = temp;
            }
        }
    }

}
