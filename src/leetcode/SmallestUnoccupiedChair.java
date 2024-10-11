package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallestUnoccupiedChair {

    public static void main(String[] args) {
        SmallestUnoccupiedChair smallestUnoccupiedChair = new SmallestUnoccupiedChair();
        System.out.println(smallestUnoccupiedChair.smallestChair(new int[][]{{1,4},{2,3},{4,6}}, 1));
    }
    public int smallestChair(int[][] times, int targetFriend) {
        int ta = times[targetFriend][0];
        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> occupied = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer> available = new PriorityQueue<>();
        int chair = 0;
        for (int[] time : times) {
            int arrive = time[0];
            int leave = time[1];
            while (!occupied.isEmpty() && occupied.peek()[0] < arrive) {
                available.offer(occupied.poll()[1]);
            }
            int curChair;
            if (available.isEmpty()) {
                curChair = chair++;
            } else {
                curChair = available.poll();
            }
            if (arrive == ta) return curChair;
            occupied.offer(new int[]{leave, curChair});
        }
        return -1;
    }
}
