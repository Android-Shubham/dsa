package leetcode;

import java.util.Arrays;

public class ReverseStringLeetCodeProblem {

    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        System.out.println(Arrays.toString(reverseString(s)));
        System.out.println(reverseStr("abcdefg",2));
    }

    public static char[] reverseString(char[] s) {
        int size = s.length;
        for(int i =0;i<size/2;i++){
            swap(s,i,size-i-1);
        }
        String str = Arrays.toString(s);
        return s;
    }

    public static void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }


    public static String reverseStr(String s, int k) {
        int len = 0;
        char[] str = s.toCharArray();
        if(k<s.length()){
            len = k;
        }else{
            len = s.length();
        }

        for(int i=0;i<len/2;i++){
            char temp = str[len - i -1];
            str[len - i -1] = str[i];
            str[i] = temp;
        }

        return new String(str);
    }
}
