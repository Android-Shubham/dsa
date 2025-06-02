package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        System.out.println(taskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'},2));
    }
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char ch : tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f :  freq){
            if(f>0){
                pq.offer(f);
            }
        }
        int count = 0;
        while(!pq.isEmpty()){
            int cycle = n+1;
            int time = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while(cycle>0 && !pq.isEmpty()){
                time++;
                cycle--;
                int cur = pq.poll();
                list.add(cur-1);
            }
            for(int f : list){
                if(f>0){
                    pq.offer(f);
                }
            }
            if(pq.isEmpty()){
                count+=time;
            }else{
                count+=n+1;
            }
        }
        return count;
    }
}
