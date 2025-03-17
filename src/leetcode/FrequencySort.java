package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1]==b[1]){
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        for(int num : map.keySet()){
            pq.offer(new int[]{num,map.get(num)});
        }
        int index = 0;
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            int freq = temp[1];
            int num = temp[0];
            while(freq>0){
                ans[index++] = num;
                freq--;
            }
        }
        return ans;
    }
}
