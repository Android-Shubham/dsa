package algomap.io.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            pq.offer(a-b);
        }
        return pq.poll();
    }
}
