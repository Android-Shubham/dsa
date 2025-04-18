package leetcode;

public class MinOperationsToMakeBinaryArrayOne {
    public int minOperations(int[] nums) {
        int ans = 0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]==0){
                nums[i]=1;
                if(nums[i+1]==0){
                    nums[i+1]=1;
                }else{
                    nums[i+1]=0;
                }
                if(nums[i+2]==0){
                    nums[i+2]=1;
                }else{
                    nums[i+2]=0;
                }
                ans++;
            }
        }
        for(int num : nums){
            if(num==0){
                return -1;
            }
        }
        return ans;
    }
}
