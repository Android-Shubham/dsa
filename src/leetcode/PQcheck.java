package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQcheck {
    public static void main(String[] args) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        pq.offer(new int[]{1,1});
        pq.offer(new int[]{1,3});
        pq.offer(new int[]{2,2});
        pq.offer(new int[]{3,1});
        System.out.println(pq.poll()[1]);
        System.out.println(pq.poll()[1]);
        System.out.println(pq.poll()[1]);
        System.out.println(pq.poll()[1]);
    }
}
