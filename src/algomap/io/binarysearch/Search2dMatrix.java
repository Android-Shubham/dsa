package algomap.io.binarysearch;

public class Search2dMatrix {


    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while(row < matrix.length && column>=0){
            if(matrix[row][column] == target){
                return true;
            }else if(matrix[row][column] < target){
                row++;
            }else{
                column--;
            }
        }

        return false;
    }
    public boolean searchMatrix_first(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        while (start < matrix.length && matrix[start][end] < target) {
            start++;
        }
        if (start > matrix.length - 1) {
            return false;
        }
        return binarySearch(matrix[start], target);
    }

    private boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
