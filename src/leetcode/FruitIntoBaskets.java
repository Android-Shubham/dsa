package leetcode;

import java.util.HashMap;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int start = 0;
        int n = fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int end=0;end<n;end++){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }
}
