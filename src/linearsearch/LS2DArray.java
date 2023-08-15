package linearsearch;

import java.util.Arrays;

public class LS2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {10, 40, 50, 100}, {11, 12, 1, 2, 88}, {99, 77, 55, 66, 33, 23}};

        int target = 1;

        System.out.println(Arrays.toString(ls2dArray(arr, target)));
    }

    private static int[] ls2dArray(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
