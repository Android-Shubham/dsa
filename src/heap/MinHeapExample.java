package heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.add(0);
        q.add(-1);
        q.add(1);
        q.add(3);
        q.add(2);
        q.add(4);
        q.add(10);
        q.add(11);
        q.add(5);
        while (q.size()>2){
            q.poll();
        }
        System.out.println(q.peek());

    }
}
