package leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static String longestPalindrome(String s) {
        int n=s.length();
        if(n<2) return s;
        int index = 0;
        int len = 0;
        for(int i=0;i<n;i++){
            //for odd length
            int left = i;
            int right = i;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > len){
                    index = left;
                    len = right-left+1;
                }
                left--;
                right++;
            }

            left = i;
            right = i+1;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > len){
                    index = left;
                    len = right-left+1;
                }
                left--;
                right++;
            }
        }

        return s.substring(index,index+len);
    }
}


