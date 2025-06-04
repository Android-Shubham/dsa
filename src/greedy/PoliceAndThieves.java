package greedy;

import java.util.LinkedList;
import java.util.Queue;

public class PoliceAndThieves {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        Queue<Integer> t = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'T') {
                t.offer(i);
            }
        }
        int caught = 0;
        for (int i = 0; i < n && !t.isEmpty(); i++) {
            if (arr[i] == 'P') {
                while (!t.isEmpty()) {
                    int cur = t.peek();

                    if (cur > i + k) {
                        break;
                    }
                    if (cur < i - k) {
                        t.poll();
                        continue;
                    }
                    caught++;
                    t.poll();
                    break;
                }
            }
        }
        return caught;
    }
}
