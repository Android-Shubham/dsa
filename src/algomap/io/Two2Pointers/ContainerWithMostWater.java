package algomap.io.Two2Pointers;


//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(containerWithMostWater.maxArea(new int[]{1,1}));

    }
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            if(height[i] < height[j]){
                max = Math.max(max,height[i] * (j-i));
                i++;
            }else {
                max = Math.max(max,height[j] * (j-i));
                j--;
            }
        }
        return max;
    }

}
