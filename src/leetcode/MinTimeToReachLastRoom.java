package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinTimeToReachLastRoom {

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] dp = new int[n][m];
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        q.offer(new int[] { 0, 0, 0, 2 });
        for (int[] d : dp) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int size = q.size();
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            int time = cur[2];
            int prev = cur[3];
            if (row == n - 1 && col == m - 1) {
                return time;
            }
            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m) {
                    int updated = prev == 1 ? 2 : 1;
                    int newTime = Math.max(time, moveTime[newRow][newCol]) + updated;
                    if (newTime < dp[newRow][newCol]) {
                        dp[newRow][newCol] = newTime;
                        q.offer(new int[] { newRow, newCol, newTime, updated });
                    }
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
