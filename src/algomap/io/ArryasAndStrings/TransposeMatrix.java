package algomap.io.ArryasAndStrings;


//https://leetcode.com/problems/transpose-matrix/description/
public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] res = transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(re[j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
