package leetcode;

public class MissingNumberInRange {
    //https://leetcode.com/problems/missing-number/submissions/
    public static void main(String[] args) {
        int[] nums = {4,2, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int start = 0;
        int len = nums.length;

        while (start<len){
            if(nums[start] < len && nums[start]!=start){
                swap(nums,nums[start],start);
            }else {
                start++;
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
