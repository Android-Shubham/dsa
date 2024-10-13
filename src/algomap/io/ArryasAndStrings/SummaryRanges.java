package algomap.io.ArryasAndStrings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/description/
public class SummaryRanges {

    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        System.out.println(summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;
        int from = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur - 1 != prev) {
                if (from == prev) {
                    res.add(prev + "");
                } else {
                    res.add(from + "->" + prev);
                }
                from = cur;
            }
            prev = cur;
        }
        if (from == prev) {
            res.add(prev + "");
        } else {
            res.add(from + "->" + prev);
        }
        return res;
    }
}
