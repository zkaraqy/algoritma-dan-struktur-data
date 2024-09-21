package tugasarray;

public class Pengurangan {
    
    static int[][] kurangkan(int[][] matriks1, int[][] matriks2) {
        if (!Matriks.isSameDimensionMatriks(matriks1, matriks2)) {
            throw new Error("Kedua matriks harus mempunyai dimensi yang sama");
        }
        int[][] matriksHasil = new int[matriks1.length][matriks2.length];
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[i].length; j++) {
                matriksHasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        return matriksHasil;
    }
    
}
