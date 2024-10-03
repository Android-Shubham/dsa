package leetcode;

import java.util.HashMap;

public class MakeSumDivisibleByP {

    public static void main(String[] args) {
        MakeSumDivisibleByP makeSumDivisibleByP = new MakeSumDivisibleByP();
        System.out.println(makeSumDivisibleByP.minSubarray(new int[]{6,3,5,2},9));
    }

    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            sum = (sum + num) % p;
        }
        if(sum%p==0){
            return 0;
        }
        HashMap<Integer,Integer> locs = new HashMap<>();
        int cur = 0;
        locs.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            cur = (cur + nums[i])%p;
            int target = (cur - sum + p) % p;
            if(locs.containsKey(target)){
                res = Math.min(res, i - locs.get(target));
            }
            locs.put(cur,i);
        }
        return (res == Integer.MAX_VALUE || res==nums.length) ? -1 : res;
    }

    public int minSubarrayBruteForce(int[] nums, int p) {
        long sum = 0;
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
        }
        if(sum%p==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            long tempSum = sum;
            for (int j = i; j < nums.length; j++) {
                tempSum -= nums[j];
                if (tempSum % p == 0) {
                    res = Math.min(res, j - i + 1);
                    break;
                }
                if (tempSum < p) {
                    break;
                }
            }
        }
        return (res == Integer.MAX_VALUE || res==nums.length) ? -1 : res;
    }
}
