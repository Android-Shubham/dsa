package leetcode;

public class CanSortArray {
    public static void main(String[] args) {
        System.out.println(canSortArray(new int[]{20, 16}));
    }

    public static boolean canSortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    if (Integer.bitCount(nums[j + 1]) == Integer.bitCount(nums[j])) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
