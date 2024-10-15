package algomap.io.HashMapsAndSets;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{1,2,2}));
    }

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    public int majorityElement_bruteForce(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
