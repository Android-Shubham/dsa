package leetcode;

import java.util.PriorityQueue;

public class BricksNeeded {

    public static void main(String[] args) {
        System.out.println(furthestBuilding(new int[]{4,12,2,7,3,18,20,3,19},10,2));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=1;i<heights.length;i++){
            int diff = heights[i] - heights[i-1];

            if(diff>=0) {
                if (pq.size() < ladders) {
                    //offer ladder
                    pq.offer(diff);
                } else {
                    //optimize ladder
                    int br = diff;
                    if (pq.size() > 0 && pq.peek() < diff) {
                        br = pq.remove();
                        pq.offer(diff);
                    }
                    if (bricks - br >= 0) {
                        bricks -= br;
                    } else {
                        return i - 1;
                    }
                }
            }
        }

        return heights.length - 1;
    }
}
