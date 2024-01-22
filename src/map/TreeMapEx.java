package map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("shubham",3);
        map.put("shx",2);
        map.put("aman",1);

        for (String key : map.keySet()) {
            System.out.println(key+"--"+map.get(key));
        }
    }
}
