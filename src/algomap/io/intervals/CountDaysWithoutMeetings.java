package algomap.io.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class CountDaysWithoutMeetings {
    public static void main(String[] args) {
        PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());
        max.offer(1);
        max.offer(2);
        max.offer(3);
        System.out.println(max.peek());
        System.out.println(max.poll());
    }
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, ((a, b) -> Integer.compare(a[0], b[0])));
        ArrayList<int[]> merged = merge(meetings);
        int free = 0;
        int[] last = new int[2];

        for (int i = 0; i < merged.size(); i++) {
            int[] meet = merged.get(i);
            if (i == 0) {
                free += meet[0] - 1;
            } else {
                if(meet[0]!=last[1]){
                    free += (meet[0] - last[1] - 1);
                }
            }
            last = meet;
        }
        free += (days - last[1]);
        return free;
    }

    private ArrayList<int[]> merge(int[][] meetings) {
        ArrayList<int[]> res = new ArrayList<>();
        int size = 0;
        for (int[] meet : meetings) {
            if (!res.isEmpty() && res.get(size - 1)[1] > meet[0]) {
                res.get(size - 1)[1] = Math.max(res.get(size-1)[1],meet[1]);
            } else {
                res.add(meet);
                size++;
            }
        }
        return res;
    }
}
