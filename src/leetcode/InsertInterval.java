package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval insertInterval = new InsertInterval();
        System.out.println(Arrays.deepToString(insertInterval.insert(new int[][]{{1, 3}, {4, 6}, {9, 10}, {12, 16}}, new int[]{2, 5})));
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if(n==0){
            int[][] single = new int[1][2];
            single[0] = newInterval;
            return single;
        }
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        int[] prev = intervals[0];
        boolean inserted = false;
        int start = newInterval[0];
        int end = newInterval[1];
        for(int i=1;i<n;i++){
            if((start>=prev[0] && start<prev[1]) || (end>=prev[0] && end<prev[1])){
                prev[0] = Math.min(prev[0],start);
                prev[1] = Math.max(prev[1],end);
                ans.set(ans.size()-1,prev);
            }else{
                ans.add(intervals[i]);
                prev = intervals[i];
            }

        }
        if(!inserted){
            ans.add(newInterval);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
