package algomap.io.HashMapsAndSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        groupAnagram.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String newStr = String.valueOf(sorted);
            if (!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<>());
            }
            map.get(newStr).add(str);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }
}
