package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefixOptimized(new String[]{"dog","racecar","car"}));
    }

    private static String longestCommonPrefixOptimized(String[] strs) {
        String prefix = "";
        if(strs.length ==0){
            return prefix;
        }
        Arrays.sort(strs);
        String first = strs[0];
        String end = strs[strs.length-1];

        int c=0;
        while(c < first.length()){
            if(first.charAt(c) == end.charAt(c)){
                c++;
            }else{
                break;
            }
        }


        return c==0 ? "" : first.substring(0,c);
    }


    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length ==0){
            return prefix;
        }
        Arrays.sort(strs);
        String start = strs[0];
        int initialLength = start.length();

        if(initialLength == 0){
            return prefix;
        }


        for(int i=0 ; i<initialLength; i++){
            boolean isValid = true;


            for(int j=1; j<strs.length; j++){
                if(i<strs[j].length()){
                    Character currrentPointer = strs[j].charAt(i);
                    if(start.charAt(i) != currrentPointer){
                        isValid = false;
                    }
                }else{
                    return prefix;
                }
            }

            if(isValid){
                prefix+=start.charAt(i);
            }else{
                return prefix;
            }

        }



        return prefix;
    }
}
