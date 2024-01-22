package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temporary = nums[left];
                nums[left] = nums[right];
                nums[right] = temporary;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
