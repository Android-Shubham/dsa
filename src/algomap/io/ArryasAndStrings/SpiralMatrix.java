package algomap.io.ArryasAndStrings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        // List<Integer>res = spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        System.out.println(spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[left][i]);
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;


            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }

        return res;
    }
}
