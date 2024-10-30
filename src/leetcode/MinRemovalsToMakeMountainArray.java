package leetcode;

import java.util.Arrays;

public class MinRemovalsToMakeMountainArray {
    public static void main(String[] args) {
        MinRemovalsToMakeMountainArray minRemovalsToMakeMountainArray = new MinRemovalsToMakeMountainArray();
        System.out.println(minRemovalsToMakeMountainArray.minimumMountainRemovals(new int[]{2,1,1,5,6,2,3,1}));
    }

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int[] lds = new int[n];
        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
            }
        }

        for (int i=n-1;i>=0;i--){
            for (int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    lds[i] = Math.max(lds[i],lds[j]+1);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(lis[i]>0 && lds[i]>0){
                res = Math.min(res, n-(lis[i]+lds[i])+1);
            }
        }
        return res;
    }
}
