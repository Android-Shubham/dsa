package algomap.io.backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/submissions/1448566413/
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<>());
        return res;
    }
    private void backtrack(int[] nums,List<List<Integer>> res,ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(nums,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}
