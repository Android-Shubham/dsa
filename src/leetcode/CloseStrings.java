package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/determine-if-two-strings-are-close
class CloseStrings {
    public static void main(String[] args) {
        System.out.println(closeStrings("abbzzca","babzzcz"));
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];

        for(int i=0;i<word1.length();i++){
            char one =word1.charAt(i);
            char two =word2.charAt(i);

            alpha1[one - 'a'] ++;
            alpha2[two - 'a'] ++;
        }

        Arrays.sort(alpha1);
        Arrays.sort(alpha2);
        return Arrays.equals(alpha1,alpha2);
    }
}