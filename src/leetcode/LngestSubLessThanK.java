package leetcode;

public class LngestSubLessThanK {
    public static void main(String[] args) {
        LngestSubLessThanK lngestSubLessThanK = new LngestSubLessThanK();
        System.out.println(lngestSubLessThanK.longestSubsequence("1001010",5));
    }
    public int longestSubsequence(String s, int k) {
        StringBuilder binary = new StringBuilder(s);
        while(Long.parseLong(binary.toString(),2) > k){
            int index = binary.toString().indexOf('1');
            if(index!=-1){
                binary.deleteCharAt(index);
            }
        }
        return binary.length();
    }
}
