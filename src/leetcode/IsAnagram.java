package leetcode;

import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("car","cat"));
    }

    public static boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String,Integer> mapFirst = new HashMap<>();
        HashMap<String,Integer> mapSecond = new HashMap<>();
        for(int i=0;i<s.length();i++){

            String first = String.valueOf(s.charAt(i));
            String second = String.valueOf(t.charAt(i));
            if(mapFirst.containsKey(first)){
                mapFirst.put(first,mapFirst.get(first)+1);
            }else{
                mapFirst.put(first,1);
            }

            if(mapSecond.containsKey(second)){
                mapSecond.put(second,mapSecond.get(second)+1);
            }else{
                mapSecond.put(second,1);
            }
        }

        return mapFirst.equals(mapSecond);
    }
}
