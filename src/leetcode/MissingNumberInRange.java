package leetcode;

public class MissingNumberInRange {
//https://leetcode.com/problems/missing-number/submissions/
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i]) {
                if (nums[i] + 1 <= nums.length) {
                    swap(nums, i, nums[i]);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }


        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
