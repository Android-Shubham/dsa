package leetcode;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    private static int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer>pq = new PriorityQueue<Integer>((a,b)->b-a);
        for (int num : arr){
            pq.add(num);
        }

        while (pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int diff = Math.abs(first - second);
            if(diff!=0){
                pq.add(diff);
            }
        }
        if(pq.size()!=0){
            return pq.poll();
        }
        return 0;
    }
}
