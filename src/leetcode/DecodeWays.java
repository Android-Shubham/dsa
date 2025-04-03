package leetcode;

import java.util.HashMap;

public class DecodeWays {
    HashMap<Integer,Integer> dp =new HashMap<>();
    int n;
    public int numDecodings(String s) {
        n = s.length();
        return recur(0,s);
    }
    private int recur(int i,String s){
        if(dp.containsKey(i)) return dp.get(i);
        if(i==n) return 1;
        if(s.charAt(i)=='0') return 0;
        int res = recur(i+1,s);
        if(i<n-1){
            if(s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6')){
                res+=recur(i+2,s);
            }
        }
        dp.put(i,res);
        return res;
    }
}
