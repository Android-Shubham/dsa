package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        MaximumScoreAfterApplyingKOperations max = new MaximumScoreAfterApplyingKOperations();
        System.out.println(max.maxKelements(new int[]{1,10,3,3,3}, 3));
    }
    public long maxKelements(int[] nums, int k) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.offer(num);
        }
        while(k>0){
            int num = pq.poll();
            answer+=num;
            double newNum = (double) num/3;
            if(newNum>(int)newNum){
                newNum+=1;
            }
            pq.offer((int)newNum);
            k--;
        }

        return answer;
    }

    public long maxKelements_improved(int[] nums, int k) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.offer(num);
        }
        while(k-->0){
            int num = pq.poll();
            answer+=num;
            pq.offer((num+2)/3);
        }

        return answer;
    }
}
