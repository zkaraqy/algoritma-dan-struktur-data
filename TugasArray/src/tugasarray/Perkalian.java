package tugasarray;

public class Perkalian extends Matriks {

    static int[][] kalikan(int[][] matriks1, int[][] matriks2) {
        int baris1 = matriks1.length;   
        int kolom1 = matriks1[0].length;
        int baris2 = matriks2.length;   
        int kolom2 = matriks2[0].length;
        
        if (kolom1 != baris2) {
            throw new Error("Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua.");
        }

        int[][] hasil = new int[baris1][kolom2];

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        
        return hasil;
    }

}

