package uts;

import java.util.Random;

public class RandomizeArrayAngka extends ArrayAngka {

    void randomize() {
        Random rand = new Random();
        for (int i = arrayAngka.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            double temp = arrayAngka[i];
            arrayAngka[i] = arrayAngka[index];
            arrayAngka[index] = temp;
        }
    }
}
