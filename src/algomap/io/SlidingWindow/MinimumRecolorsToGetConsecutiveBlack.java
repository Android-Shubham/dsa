package algomap.io.SlidingWindow;

//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
public class MinimumRecolorsToGetConsecutiveBlack {

    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        int n = blocks.length();
        int l = 0;
        int r = k - 1;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                w++;
            }
        }
        int window = w;
        while (r < n - 1) {
            l++;
            r++;
            if (blocks.charAt(l - 1) == 'W') {
                --w;
            }
            if (blocks.charAt(r) == 'W') {
                ++w;
            }
            window = Math.min(window, w);
        }
        return window;
    }
}
