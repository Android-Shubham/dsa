package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountCompleteDays {
    public static void main(String[] args) {
        CountCompleteDays countCompleteDays = new CountCompleteDays();
        countCompleteDays.countCompleteDayPairs(new int[]{12,12,30,24,24});
    }
    public int countCompleteDayPairs(int[] hours) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        for (int hour : hours) {
            int remainder = hour % 24;
            if (remainder == 0) {
                ans += mp.getOrDefault(0, 0);
            } else {
                ans += mp.getOrDefault(24 - remainder, 0);
            }
            mp.put(remainder, mp.getOrDefault(remainder, 0) + 1);
        }
        return ans;
    }
}
