package leetcode;

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,5,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int start = 0;
        while(start<nums.length){
            int correctIndex = nums[start] - 1;
            if(nums[start] != nums[correctIndex]){
                swap(nums,start,correctIndex);
            }else{
                start++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
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