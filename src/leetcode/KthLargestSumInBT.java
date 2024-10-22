package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class KthLargestSumInBT {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
                sum += temp.val;
            }
            pq.offer(sum);
        }
        while (!pq.isEmpty() && k-- > 0) {
            if (k == 0) {
                return pq.poll();
            }
            pq.poll();
        }
        return -1;
    }

}
