package leetcode;

public class MaximumCandiesAllocated {
    public int maximumCandies(int[] candies, long k) {
        int end = Integer.MIN_VALUE;
        for (int candy : candies) {
            end = Math.max(candy, end);
        }
        int start = 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canServeAll(candies, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private boolean canServeAll(int[] candies, int mid, long k) {
        long serve = 0;
        for (int candy : candies) {
            serve += (candy / mid);
        }
        return serve >= k;
    }
}
