package prefixAlgorithm;

import java.util.HashMap;

public class SubmatricesEqualsK {

    public static void main(String[] args) {
        System.out.println(numSubmatrixSumTarget(new int[][]{{0,1,0},{1,1,1},{0,1,0}},0));
    }
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cur;
        int res = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = i; j < columns; j++) {
                sumMap.clear();
                sumMap.put(0, 1);
                cur = 0;
                for (int[] ints : matrix) {
                    cur += ints[j] - (i > 0 ? ints[i - 1] : 0);
                    res += sumMap.getOrDefault(cur - target, 0);
                    sumMap.put(cur, sumMap.getOrDefault(cur, 0) + 1);
                    System.out.println("idhr");
                }
            }
        }
        return res;
    }
}
