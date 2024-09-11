package QueueTricks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(arr -> -arr[0]));

        pq.offer(new Double[]{0.0, 0.0});
        pq.offer(new Double[]{1.0, 0.5});
        pq.offer(new Double[]{2.0, 0.5});

        System.out.println(Arrays.toString(pq.peek())); // [2.0, 0.5]
        System.out.println(Arrays.toString(pq.poll())); // [2.0, 0.5]
        System.out.println(Arrays.toString(pq.peek())); // [2.0, 0.5]
        System.out.println(Arrays.toString(pq.poll())); // [2.0, 0.5]
        System.out.println(Arrays.toString(pq.peek())); // [2.0, 0.5]
        System.out.println(Arrays.toString(pq.poll())); // [2.0, 0.5]
    }
}
