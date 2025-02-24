package bitmanipulation;

public class LargestCombinationWithBitwiseAnd {
    public int largestCombination(int[] candidates) {
        int max = 0;
        for (int i = 0; i < 24; i++) {
            int count = 0;
            for (int num : candidates) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
