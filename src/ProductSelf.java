import java.util.Arrays;

public class ProductSelf {
    public static void main(String[] args) {
        System.out.println(productExceptSelfOptimized(new int[]{1,2,3,4}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Initialize left and right product arrays
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Compute left products
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Compute right products
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Combine left and right products
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static int[] productExceptSelfOptimized(int[] nums) {
        int n = nums.length, mult = 1;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = mult;
            mult*=nums[i];
        }
        mult = 1;
        for(int j = n-1; j>=0; j--){
            ans[j]*=mult;
            mult*=nums[j];
        }
        return ans;
    }
}
