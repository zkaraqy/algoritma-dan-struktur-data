package tugasarray;

public class Transpose extends Matriks {
    
    static int[][] transpose(int[][] matriks) {
        int[][] newMatriks = new int[matriks[0].length][matriks.length];
        for (int i = 0; i < newMatriks.length; i++) {
            for (int j = 0; j < newMatriks[i].length; j++) {
                newMatriks[i][j] = matriks[j][i];
            }
        }
        return newMatriks;
    }
    
}
