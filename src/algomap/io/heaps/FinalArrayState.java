package algomap.io.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FinalArrayState {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<>() {
            public int compare(Pair p1, Pair p2) {
                if (p1.val == p2.val) {
                    return Integer.compare(p1.pos, p2.pos);
                }
                return Integer.compare(p1.val, p2.val);
            }
        });


        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new Pair(nums[i], i));
        }
        while (k > 0) {
            Pair pair = minHeap.poll();
            pair.val = pair.val * multiplier;
            minHeap.offer(pair);
            k--;
        }
        while (!minHeap.isEmpty()) {
            Pair pair = minHeap.poll();
            nums[pair.pos] = pair.val;
        }
        return nums;
    }
}

class Pair {
    int pos;
    int val;

    public Pair(int pos, int val) {
        this.pos = pos;
        this.val = val;
    }
}
