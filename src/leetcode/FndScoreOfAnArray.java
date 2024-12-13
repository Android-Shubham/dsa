package leetcode;

import java.util.PriorityQueue;

public class FndScoreOfAnArray {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int n = nums.length;
        Paired[] pairs = new Paired[n];
        for (int i = 0; i < n; i++) {
            Paired pair = new Paired(nums[i], false);
            pairs[i] = pair;
            pq.offer(new int[]{nums[i], i});
        }
        long score = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int val = cur[0];
            int index = cur[1];
            if (!pairs[index].marked) {
                score += val;
                pairs[index].marked = true;
                if (index != 0) {
                    pairs[index - 1].marked = true;
                }
                if (index != n - 1) {
                    pairs[index + 1].marked = true;
                }
            }
        }
        return score;
    }
}

class Paired {
    int num;
    boolean marked;

    public Paired(int num, boolean marked) {
        this.num = num;
        this.marked = marked;
    }
}

