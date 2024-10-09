package algomap.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//https://leetcode.com/problems/merge-intervals
public class MergeIntervals {

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        System.out.println(Arrays.deepToString(mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(Arrays.deepToString(mergeIntervals.merge_mySolution(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));

    }

    public int[][] merge_linkedList(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        for(int[] interval : intervals){
            if(res.isEmpty() || res.getLast()[1] < interval[0]){
                res.add(interval);
            }else{
                res.getLast()[1] = Math.max(res.getLast()[1] ,interval[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }


    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int lastIndex = -1;
        for (int[] interval : intervals) {
            if (res.isEmpty() || res.get(lastIndex)[1] < interval[0]) {
                res.add(interval);
                lastIndex++;
            } else {
                res.get(lastIndex)[1] = Math.max(res.get(lastIndex)[1], interval[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public int[][] merge_mySolution(int[][] intervals) {
        int n = intervals.length;
        if (n < 2) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        ArrayList<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int start = cur[0];
            int end = cur[1];
            if (start <= prev[1]) {
                prev[1] = Math.max(prev[1], end);
            } else {
                res.add(prev);
                prev = cur;
            }
            if (i == intervals.length - 1) {
                res.add(prev);
            }
        }
        return res.toArray(new int[0][0]);
    }
}
