package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s ="abcabcdb";
        System.out.println(bruteForce(s));
        System.out.println(slidingWindow(s));

    }

    private static int slidingWindow(String s) {
        int max =0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int right = 0, left =0 ;right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(map.containsKey(currentChar) && map.get(currentChar)>=left){
                left = map.get(currentChar) + 1;
            }

            max =Math.max(max,right - left+1);
            map.put(currentChar,right);
        }
        return max;
    }

    private static int bruteForce(String s) {
        int max =0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character,Character> map = new HashMap<>();
            int temp =0;
            for (int j = i; j < s.length(); j++) {
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),s.charAt(j));
                    temp++;
                }else {
                    break;
                }
            }
            if(max<temp){
                max = temp;
            }
        }

        return max;
    }
}
