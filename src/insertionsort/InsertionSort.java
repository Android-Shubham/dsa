package insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 9, 1, 0, -1, -2, 10};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    private static int[] insertionSort(int[] nums) {
        for (int i = 0 ;i<nums.length -1 ;i++){
            for (int j = i+1; j > 0; j--) {
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                }else {
                    break;
                }
            }
        }
        return nums;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
