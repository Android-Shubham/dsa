package leetcode;

import java.util.PriorityQueue;

public class MinOperationsToExceedThreshold {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> heap =  new PriorityQueue<>();
        for(int num : nums){
            heap.offer((long)num);
        }
        int op = 0;
        while(heap.size()>1 && heap.peek()<k){
            long first = heap.poll();
            long second = heap.poll();
            long newNum = (first*2)+second;
            heap.offer(newNum);
            op++;
        }
        return op;
    }
}
