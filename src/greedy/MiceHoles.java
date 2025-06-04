package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class MiceHoles {

    int assignMiceHoles(int N, int[] M, int[] H) {
        Arrays.sort(M);
        Arrays.sort(H);
        int max = 0;
        for(int i=0;i<N;i++){
            max = Math.max(max, Math.abs(M[i] - H[i]));
        }
        return max;
    }
}
