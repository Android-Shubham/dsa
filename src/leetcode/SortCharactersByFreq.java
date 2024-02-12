package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortCharactersByFreq {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(String.valueOf(character).repeat(Math.max(0, map.get(character))));
        }
        return sb.toString();
    }
}
