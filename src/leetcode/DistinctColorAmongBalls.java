package leetcode;

import java.util.HashMap;

public class DistinctColorAmongBalls {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> balls = new HashMap<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            int curColor = balls.getOrDefault(ball, -1);
            if (curColor != -1) {
                map.put(curColor, map.get(curColor) - 1);
                if (map.get(curColor) == 0) {
                    map.remove(curColor);
                }
            }
            map.put(color, map.getOrDefault(color, 0) + 1);
            balls.put(ball, color);
            ans[i] = map.size();
        }
        return ans;
    }
}
