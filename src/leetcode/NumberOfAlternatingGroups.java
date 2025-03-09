package leetcode;

public class NumberOfAlternatingGroups {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i = 0;
        int j = k - 1;
        int n = colors.length;
        int window = 0;
        boolean isValid = false;
        while (i < n) {
            if(isValid && colors[i]!=colors[i-1] && colors[j%n]!=colors[(j-1)%n]){
                window++;
                isValid = true;
            }else if (!isValid && isValid(i, j, colors, n)) {
                window++;
                isValid = true;
            }else{
                isValid = false;
            }
            i++;
            j++;
        }
        return window;
    }

    private boolean isValid(int i, int j, int[] colors, int n) {
        for (int k = i+1; k <= j; k++) {
            if (colors[k % n] == colors[(k - 1) % n]) {
                return false;
            }
        }
        return true;
    }
}
