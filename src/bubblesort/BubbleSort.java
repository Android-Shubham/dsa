package bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3,2,8,9,1,0,-1,-2,10};
        System.out.println(Arrays.toString(bubbleSort(nums)));

    }

    static int[] bubbleSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
