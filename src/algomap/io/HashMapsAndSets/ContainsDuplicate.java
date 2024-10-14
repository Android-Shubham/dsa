package algomap.io.HashMapsAndSets;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }
}
