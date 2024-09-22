package leetcode;

public class KthSmallestLexicographicalNumber {
    public static void main(String[] args) {
        System.out.println(findKthNumber(10,3));
    }
    public static int findKthNumber(int n, int k) {
        if(k==1){
            return 1;
        }
        long cur = 1;
        k--;

        while (k>0){
            if(cur*10<=n){
                cur = cur*10;
                k--;
                continue;
            }

            while (cur%10==9 || cur+1>n){
                cur/=10;
            }
            cur = cur+1;
            k--;
        }
        return (int) cur;
    }
}
