package leetcode;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int max = 0;
        int ans = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int k=i;k>0;k/=10){
                sum+=(k%10);
            }
            count[sum]++;
            if(max<count[sum]){
                max = count[sum];
                ans = 1;
            }else if(max == count[sum]){
                ans++;
            }
        }

        return ans;
    }
}
