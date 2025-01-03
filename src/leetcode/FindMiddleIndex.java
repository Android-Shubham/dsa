package leetcode;

public class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total+=num;
        }
        int left = 0;
        int i=0;
        while(i<nums.length){
            total-=nums[i];
            if(left == total){
                return i;
            }
            left+=nums[i];
            i++;
        }
        return -1;
    }
}
