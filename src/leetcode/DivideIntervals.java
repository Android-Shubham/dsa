package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DivideIntervals {

    public static void main(String[] args) {
        DivideIntervals divideIntervals = new DivideIntervals();
        System.out.println(divideIntervals.minGroups(new int[][]{{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}}));
    }

    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> occupied = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> available = new PriorityQueue<>();
        int groups = 0;

        for (int[] interval : intervals) {
            int left = interval[0];
            int right = interval[1];
            while (!occupied.isEmpty() && left > occupied.peek()[0]) {
                available.offer(occupied.poll()[1]);
            }
            int curGroup;
            if (available.isEmpty()) {
                curGroup = ++groups;
            } else {
                curGroup = available.poll();
            }
            occupied.offer(new int[]{right, curGroup});
        }

        return groups;
    }

}
