package leetcode;

import java.util.Arrays;

public class CombinePositivesAndNegatives {
    public static void main(String[] args) {
        CombinePositivesAndNegatives combinePositivesAndNegatives = new CombinePositivesAndNegatives();
        combinePositivesAndNegatives.combine(new int[]{-1, 1, -2, 2, -3, 3});
        combinePositivesAndNegatives.combine(new int[]{-1, -1, -2, -2, -3, -3});
        combinePositivesAndNegatives.combine(new int[]{1, 2, 3});
        combinePositivesAndNegatives.combine(new int[]{-12, 11, -13, -5, 6, -7, 5});
        combinePositivesAndNegatives.combine_opti(new int[]{-12, 11, -13, -5, 6, -7, 5});
    }

    private void combine(int[] nums) {
        int p = 0;
        while (p != nums.length) {
            while (p > 0 && nums[p] >= 0 && nums[p - 1] < 0) {
                int temp = nums[p - 1];
                nums[p - 1] = nums[p];
                nums[p] = temp;
                p--;
            }
            p++;
        }
        System.out.println(Arrays.toString(nums));
    }

    private void combine_opti(int[] nums) {
        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                if (i != pos) {
                    int temp = nums[i];
                    for (int j = i; j > pos; j--) {
                        nums[j] = nums[j - 1];
                    }
                    nums[pos] = temp;
                }
                pos++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
