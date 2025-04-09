package leetcode;

public class MinOpToMakeArrEqualK {
    public int minOperations(int[] nums, int k) {
        int[] count = new int[101];
        for(int num : nums){
            if(num<k){
                return -1;
            }
            count[num]++;
        }
        int ans = 0;
        for(int i=k+1;i<101;i++){
            if(count[i]>0){
                ans++;
            }
        }
        return ans;
    }
}
