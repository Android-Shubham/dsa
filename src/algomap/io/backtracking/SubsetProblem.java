package algomap.io.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetProblem {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<>(),0);
        return res;
    }
    private void backtrack(int[] nums,List<List<Integer>> res,ArrayList<Integer> cur,int start){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(nums,res,cur,i+1);
            cur.remove(cur.size()-1);
        }
    }
}
