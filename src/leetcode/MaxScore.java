package leetcode;

public class MaxScore {
    public int maxScore(String s) {
        int zeroes = 0;
        int ones = 0;
        for(char ch : s.toCharArray()){
            if(ch=='1'){
                ones++;
            }
        }
        int start = 0;
        int res = 0;
        while(start<s.length()-1){
            if(s.charAt(start) == '0'){
                zeroes++;
            }else{
                ones--;
            }
            res = Math.max(res,zeroes+ones);
            start++;
        }
        return res;
    }
}
