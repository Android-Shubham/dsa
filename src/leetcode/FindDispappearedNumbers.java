package leetcode;

import java.util.ArrayList;
import java.util.List;

class FindDispappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int start = 0;

        while(start < nums.length){
            int correctIndex = nums[start] - 1;
            if(nums[start] != nums[correctIndex]){
                swap(nums,start,correctIndex);
            }else{
                start++;
            }
        }

        for(int i=0;i<nums.length;i++){
          if(i!=nums[i]-1) {
              res.add(i + 1);
          }
        }


        return res;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}