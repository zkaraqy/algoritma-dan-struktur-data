package uts;

public class BubbleSort {

    void BubbleSort() {

    }

    double[] sort(double[] arrayAngka) {
        for (int i = 0; i < arrayAngka.length - 1; i++) {
            for (int j = 0; j < arrayAngka.length - i - 1; j++) {
                if (arrayAngka[j] > arrayAngka[j + 1]) {
                    double temp = arrayAngka[j];
                    arrayAngka[j] = arrayAngka[j + 1];
                    arrayAngka[j + 1] = temp;
                }
            }
        }
        return arrayAngka;
    }

}
