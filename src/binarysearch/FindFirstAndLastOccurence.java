package binarysearch;

import java.util.Arrays;

public class FindFirstAndLastOccurence {

    public static void main(String[] args) {
        int[] nums  = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int firstIndex = search(nums,target,true);
        if(firstIndex !=-1) {
            int lastIndex = search(nums, target, false);
            ans[0] = firstIndex;
            ans[1] = lastIndex;
        }

        return ans;
    }

    public static int search(int[] nums, int target,boolean isFirstIndex){
        int start = 0;
        int end = nums.length - 1;
        int potentialAnswer = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]<target){
                start = mid + 1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else {
                potentialAnswer = mid;
                if(isFirstIndex){
                    end  = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }

        return potentialAnswer;
    }
}
