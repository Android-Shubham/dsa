package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestFibSubSequence {
    public int lenLongestFibSubseq(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int prev = arr[j];
                int next = arr[j]+arr[i];
                int len = 2;
                while(set.contains(next)){
                    int temp = next;
                    next+=prev;
                    prev = temp;
                    count = Math.max(count,++len);
                }
            }
        }
        return count;
    }
}
