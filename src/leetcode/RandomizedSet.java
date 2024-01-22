package leetcode;

import java.util.*;

class RandomizedSet {
    Random randomObject = new Random();
    List<Integer> nums;
    Map<Integer,Integer> map;

    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }

        nums.add(val);
        map.put(val,nums.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int pos = map.get(val);
        if(pos<nums.size()-1){
            int last = nums.get(nums.size()-1);
            nums.set(pos,last);
            map.put(last,pos);
        }
        map.remove(val);
        nums.remove(nums.size()-1);
        return true;

    }
    
    public int getRandom() {
     return nums.get(randomObject.nextInt(nums.size()));   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */