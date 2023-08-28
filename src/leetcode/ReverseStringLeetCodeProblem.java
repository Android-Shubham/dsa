package leetcode;

import java.util.Arrays;

public class ReverseStringLeetCodeProblem {

    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        System.out.println(Arrays.toString(reverseString(s)));
    }

    public static char[] reverseString(char[] s) {
        int size = s.length;
        for(int i =0;i<size/2;i++){
            swap(s,i,size-i-1);
        }
        return s;
    }

    public static void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
}
