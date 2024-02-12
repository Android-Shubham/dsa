package leetcode;

public class InversePair {

    public static void main(String[] args) {
        System.out.println(kInversePairs(3,1));
    }

    static int mod = 1000000007;
    static Integer[][] memo = new Integer[1001][1001];
    public static int kInversePairs(int n, int k) {
        if(n==0){
            return 0;
        }

        if(k==0){
            return 1;
        }
        int pairs = 0;
        if(memo[n][k]!=null){
            return memo[n][k];
        }
        int last = Math.min(k,n-1);
        for(int i=0;i<=last;i++){
            pairs = (pairs + kInversePairs(n-1,k-i)) % mod;
        }
        return memo[n][k] = pairs;
    }
}
