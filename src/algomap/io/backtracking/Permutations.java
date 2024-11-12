package algomap.io.backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/submissions/1448566413/
public class Permutations {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        backtrack(nums,res,new ArrayList<>());
//        return res;
//    }
//    private void backtrack(int[] nums,List<List<Integer>> res,ArrayList<Integer> temp){
//        if(temp.size() == nums.length){
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(temp.contains(nums[i])) continue;
//            temp.add(nums[i]);
//            backtrack(nums,res,temp);
//            temp.remove(temp.size()-1);
//        }
//    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        System.out.println(permutations.permuteUnique(new int[]{1,1,2}));
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums,new ArrayList<>(),-1);
        return res;
    }
    private void backtrack(int[] nums,ArrayList<Integer> temp,int prev){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,temp,i);
            temp.remove(temp.size()-1);
        }
    }
}
