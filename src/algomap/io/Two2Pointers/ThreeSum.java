package algomap.io.Two2Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = n;
                while (j < k) {
                    int newSum = nums[j] + nums[k] + nums[i];
                    if (newSum == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        res.add(temp);

                        while (j < k && nums[j + 1] == nums[j]) {
                            j++;
                        }
                        while (k > j && nums[k - 1] == nums[k]) {
                            k--;
                        }

                        j++;
                        k--;
                    } else if (newSum > 0) {
                        k--;
                    } else {
                        j++;
                    }

                }
            }
        }

        return res;
    }
}
