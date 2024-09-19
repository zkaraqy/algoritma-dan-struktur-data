package tugasarray;

public class OperasiMatriks {

    private static boolean isSameDimensionMatriks(int[][] matriks1, int[][] matriks2) {
        if (matriks1.length != matriks2.length) {
            return false;
        }
        for (int i = 0; i < matriks1.length; i++) {
            if (matriks1[i].length != matriks2[i].length) {
                return false;
            }
        }
        return true;
    }

    static int[][] jumlahkan(int[][] matriks1, int[][] matriks2) {
        if (!isSameDimensionMatriks(matriks1, matriks2)) {
            throw new Error("Kedua matriks harus mempunyai dimensi yang sama");
        }
        int[][] matriksHasil = new int[matriks1.length][matriks2.length];
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[i].length; j++) {
                matriksHasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        return matriksHasil;
    }

}
