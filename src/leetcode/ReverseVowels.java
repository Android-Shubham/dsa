package leetcode;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] str = s.toCharArray();
        while(start<end){
            if(!isVowel(str[start])){
                start++;
                continue;
            }
            if(!isVowel(str[end])){
                end--;
                continue;
            }
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            end--;
            start++;
        }

        return String.valueOf(str);
    }

    private static boolean isVowel(char ch){
        return ch=='a' || ch == 'A' || ch=='e' || ch == 'E' || ch=='i' || ch == 'I' || ch=='o' || ch == 'O' || ch=='u' || ch == 'U' ;
    }
}
