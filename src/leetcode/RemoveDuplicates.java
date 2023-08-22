package leetcode;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }

  public static   int removeDuplicates(int[] nums) {

        // 1 1 1 2 2 2 3
        //
      LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
      for (int i = 0; i < nums.length; i++) {
          linkedHashSet.add(nums[i]);
          nums[i] = 0;
      }

      Iterator itr = linkedHashSet.iterator();

      int index =0;
      while (itr.hasNext()){
         nums[index++] = (Integer) itr.next();
      }

      return linkedHashSet.size();
    }

}
