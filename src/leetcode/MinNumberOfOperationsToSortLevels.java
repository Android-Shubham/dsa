package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinNumberOfOperationsToSortLevels {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int swaps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                arr[i] = temp.val;
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            swaps += (minSwaps(arr));
        }
        return swaps;
    }

    private int minSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        int[] target = arr.clone();
        Arrays.sort(target);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != target[i]) {
                swaps++;
                int curPos = map.get(target[i]);
                map.put(arr[i], curPos);
                arr[curPos] = arr[i];
            }
        }
        return swaps;
    }
}
