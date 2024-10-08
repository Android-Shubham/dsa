package algomap.io;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int prod = 1;
        for(int i=0;i<n;i++){
            prod = prod*nums[i];
            pre[i] = prod;
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod*=nums[i];
            suf[i] = prod;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                nums[i] = suf[i+1];
                continue;
            }
            if(i==n-1){
                nums[i] = pre[i-1];
                continue;
            }
            nums[i] = pre[i-1]*suf[i+1];
        }

        return nums;
    }
}
