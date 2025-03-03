package leetcode;

public class PartitionArrayAccordingToPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int equal = 0;
        for(int num : nums){
            if(num<pivot){
                less++;
            }else if(num == pivot){
                equal++;
            }
        }
        int start = 0;
        int greater = less+equal;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num < pivot){
                ans[start++] = num;
            }else if(num > pivot){
                ans[greater++] = num;
            }else{
                ans[less++] = num;
            }
        }
        return ans;
    }
}
