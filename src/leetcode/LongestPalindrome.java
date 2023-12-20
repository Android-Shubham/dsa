package leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }


    public static String longestPalindrome(String s) {
        String ans = "";
        int length = s.length();

        if(s.length()<2){
            return s;
        }

        for(int left = 0;left<length - 1 ;left++){
            for (int right = left+1 ;right <= length; right++) {
                String sub = s.substring(left,right);

                if( isPalindrome(sub)){
                    if(ans.length() < sub.length()){
                        ans  =  sub;
                    }
                }

            }
        }

        return ans;
    }

    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }

        return true;
    }
}


