package leetcode;

public class FirstOccurenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();
        while(end <= haystack.length()){
            if(haystack.substring(start,end).equals(needle)){
                return start;
            }else{
                start++;
                end++;
            }
        }

        return -1;
    }
}
