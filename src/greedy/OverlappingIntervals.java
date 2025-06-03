package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class OverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev = intervals[0][1];
        int n = intervals.length;
        int overlap = 0;
        for(int i=1;i<n;i++){
            if(intervals[i][0] < prev){
                overlap++;
                continue;
            }
            prev = intervals[i][1];
        }
        return overlap;
    }
}
