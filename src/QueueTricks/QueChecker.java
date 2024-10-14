package QueueTricks;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueChecker {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(1);
        pq.offer(3);
        pq.offer(10);
        pq.offer(3);
        pq.offer(3);
        System.out.println(pq.poll());
        pq.offer(11);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        double num = (double) 9 / 3;
        if(num>(int)num){
            num+=1;
        }
        System.out.println((int)num);
    }
}
