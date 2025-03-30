package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int[] lastIndex = new int[26];
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }
        int pStart=0;
        int pEnd=0;
        List<Integer>res = new ArrayList<>();
        for(int i=0;i<n;i++){
            pEnd = Math.max(pEnd,lastIndex[s.charAt(i)-'a']);
            if(i==pEnd){
                res.add(i-pStart+1);
                pStart = i+1;
            }
        }
        return res;
    }
}
