package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestHappyString {
    public static void main(String[] args) {
        longestDiverseString(1, 1, 7);
    }
    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0]-a[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        while (a > 0 || b > 0 || c > 0) {

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                switch (cur[1]) {
                    case 1 -> {
                        if (cur[0] > 2) {
                            sb.append('a').append('a');
                            a -= 2;
                        } else if (cur[0] > 0) {
                            sb.append('a');
                            a--;
                        }
                        break;
                    }
                    case 2 -> {
                        if (cur[0] > 2) {
                            sb.append('b').append('b');
                            b -= 2;
                        } else if (cur[0] > 0) {
                            sb.append('b');
                            b--;
                        }
                        break;
                    }
                    default -> {
                        if (cur[0] > 2) {
                            sb.append('c').append('c');
                            c -= 2;
                        } else if (cur[0] > 0) {
                            sb.append('c');
                            c--;
                        }
                        break;
                    }
                }
            }

            q.offer(new int[] { a, 1 });
            q.offer(new int[] { b, 2 });
            q.offer(new int[] { c, 3 });
        }

        return sb.toString();
    }
}
