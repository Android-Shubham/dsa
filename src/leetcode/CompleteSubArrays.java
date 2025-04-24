package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CompleteSubArrays {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int ans = 0;
        int n = nums.length;
        for (int num : nums) {
            unique.add(num);
        }
        int count = unique.size();
        int l = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int r = 0; r < n; r++) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            while (freq.size() == count) {
                ans += (n - r);
                freq.put(nums[l], freq.getOrDefault(nums[l], 0) - 1);
                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }
        }
        return ans;
    }
}
