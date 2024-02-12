package prefixAlgorithm;

public class SumOfSubArray {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i+1;j<n;j++){
                if(nums[j] == k){
                    res++;
                }
                sum+=nums[j];
                if(sum==k){
                    res++;
                }
//                if(sum>k){
//                    break;
//                }
            }
        }

        return res;
    }
}
