package leetcode;

public class MinWindowSubstring {
    public static void main(String[] args) {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        System.out.println(minWindowSubstring.minWindow("ADOBECODEBANC","ABC"));
    }
    public String minWindow(String s, String t) {
        int[] t_hash = new int[128];
        int[] s_hash = new int[128];
        int n = s.length();
        int m = t.length();
        if (m > n) {
            return "";
        }
        for (int i = 0; i < m; i++) {
            t_hash[t.charAt(i)]++;
        }
        int index = 0;
        int len = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < n; i++) {
            s_hash[s.charAt(i)]++;
            while (j <= i && areEqual(s_hash, t_hash)) {
                if (i - j + 1 < len) {
                    index = j;
                    len = i - j + 1;
                }
                s_hash[s.charAt(j)]--;
                j++;
            }
        }
        return s.substring(index, index + len);
    }

    private boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < 128; i++) {
            if (b[i] != 0) {
                if (a[i] < b[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
