package leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueBinaryString {
    public static void main(String[] args) {
        UniqueBinaryString uniqueBinaryString = new UniqueBinaryString();
        uniqueBinaryString.findDifferentBinaryString(new String[]{"00","01"});
    }
    Set<String> set = new HashSet<>();

    public String findDifferentBinaryString(String[] nums) {
        int acceptedLength = nums[0].length();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return findUnique(nums, acceptedLength, new StringBuilder());
    }

    private String findUnique(String[] nums, int len, StringBuilder cur) {
        if (cur.length() > len) {
            return "";
        }
        if (cur.length() == len) {
            if (!set.contains(cur.toString())) {
                return cur.toString();
            }
            return "";
        }
        cur.append('0');
        String res = findUnique(nums, len, cur);
        if (!Objects.equals(res, "")) {
            return res;
        }
        cur.deleteCharAt(cur.length() - 1);
        cur.append('1');
        res = findUnique(nums, len, cur);
        if(!Objects.equals(res, "")){
            return res;
        }
        cur.deleteCharAt(cur.length() - 1);
        return "";
    }
}
