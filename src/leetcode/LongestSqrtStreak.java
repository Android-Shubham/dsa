package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSqrtStreak {

    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        for(int num : nums){
            set.add((long)num);
        }
        int longest = 0;
        for (long l : nums) {
            long num = l;
            int temp = 1;
            while (set.contains((num * num))) {
                temp++;
                num = num * num;
            }
            longest = Math.max(longest, temp);
        }
        return longest==1?-1:longest;
    }
}
