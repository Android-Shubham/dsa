package algomap.io.HashMapsAndSets;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{1,2,2}));
    }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
