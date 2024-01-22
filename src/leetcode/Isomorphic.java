package leetcode;

import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()==0){
            return true;
        }
        Map<Character, Character> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if(!map.containsKey(s_ch) ){
                if(!map.containsValue(t_ch)){
                    map.put(s_ch,t_ch);
                }else{
                    return false;
                }
            }
            else{
                if(map.get(s_ch)!=t_ch){
                    return false;
                }
            }
        }


        return true;
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String newStr = String.valueOf(chArr);
            if(!map.containsKey(newStr)){
                map.put(newStr,new ArrayList<>());
            }

            map.get(newStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
