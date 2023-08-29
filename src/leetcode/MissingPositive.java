package leetcode;

public class MissingPositive {

    //hard problem
    //https://leetcode.com/problems/first-missing-positive/submissions/
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int start = 0;
        while (start < nums.length) {
            int correctIndex = nums[start] - 1;

            if (correctIndex < nums.length && nums[start] > 0 && nums[start] != nums[correctIndex]) {
                swap(nums, start, correctIndex);
            } else {
                start++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums[nums.length - 1] + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
