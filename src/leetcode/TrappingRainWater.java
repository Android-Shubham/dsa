package leetcode;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int rain = 0;
        for (int i = 0; i < n; i++) {
            if(i==0){
                left[i] = height[i];
                right[n-i-1] = height[n-i-1];
            }else{
                left[i] = Math.max(height[i],left[i-1]);
                right[n-i-1] = Math.max(height[n-i-1],right[n-i]);
            }
        }
        for (int i = 0; i < n; i++) {
            rain += (Math.min(left[i],right[i]) - height[i]);
        }
        return rain;
    }
}
