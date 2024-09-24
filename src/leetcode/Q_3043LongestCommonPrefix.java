package leetcode;

import java.util.HashSet;

public class Q_3043LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new int[]{1,10,100},new int[]{1000}));
    }

    public static int longestCommonPrefix(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr1){
            while (!set.contains(val) && val>0){
                set.add(val);
                val/=10;
            }
        }

        int prefix = 0;
        for(int val : arr2){
            while(!set.contains(val) && val>0){
                val/=10;
            }
            if(val!=0){
                prefix = Math.max(prefix,(int)Math.log10(val)+1);
            }
        }
        return prefix;
    }
}
