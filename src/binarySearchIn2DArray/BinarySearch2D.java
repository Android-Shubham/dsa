package binarySearchIn2DArray;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int target = 13;
        System.out.println(Arrays.toString(binarySearch2d(arr,target)));
    }

    private static int[] binarySearch2d(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col>=0){

            if(target == matrix[row][col]){
                return new int[]{row,col};
            }

            if(target < matrix[row][col]){
                col --;
            }else {
                row++;
            }


        }

        return new int[]{-1,-1};
    }
}
