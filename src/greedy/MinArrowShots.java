package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinArrowShots {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int end = points[0][1];
        int arrow = 1;
        for (int i = 1; i < n; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            arrow++;
            end = points[i][1];
        }
        return arrow;
    }
}
