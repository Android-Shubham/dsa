package selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 9, 1, 0, -1, -2, 10};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i -1;
            int max = max(nums,0,last);
            swap(nums,max,last);
        }
        return nums;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    static int max(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }

        return max;
    }
}
