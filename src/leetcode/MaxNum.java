package leetcode;

public class MaxNum {
    public int maxDiff(int num) {
        char[] max = String.valueOf(num).toCharArray();
        char[] min = String.valueOf(num).toCharArray();
        int n = max.length;
        char max_rep = max[0];
        for (char c : max) {
            if (c != '9') {
                max_rep = c;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (max[i] == max_rep) {
                max[i] = '9';
            }
        }
        int first = Integer.parseInt(new String(max));
        if (min[0] == '1') {
            char rep = '2';
            for (int i = 1; i < n; i++) {
                if (min[i] != '1' && min[i] != '0') {
                    rep = min[i];
                    break;
                }
            }
            for (int i = 1; i < n; i++) {
                if (min[i] == rep) {
                    min[i] = '0';
                }
            }
        } else {
            char rep = min[0];
            for (int i = 0; i < n; i++) {
                if (min[i] == rep) {
                    min[i] = '1';
                }
            }
        }
        int second = Integer.parseInt(new String(min));
        return first - second;
    }
}
