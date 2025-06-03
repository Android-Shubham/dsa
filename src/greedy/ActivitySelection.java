package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int[][] acts = new int[n][2];
        for (int i = 0; i < n; i++) {
            acts[i][0] = start[i];
            acts[i][1] = finish[i];
        }
        Arrays.sort(acts, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int[] prev = acts[0];
        for (int i = 1; i < n; i++) {
            if (acts[i][0] > prev[1]) {
                count++;
                prev = acts[i];
            }
        }
        return count;
    }
}
