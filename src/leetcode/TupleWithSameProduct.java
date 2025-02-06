package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int size = entry.getValue();
            pairs += ((size * (size - 1)) / 2);
        }
        return pairs * 8;
    }
}
