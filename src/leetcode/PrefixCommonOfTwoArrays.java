package leetcode;

public class PrefixCommonOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int count = 0;
        int[] ans = new int[n];
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                count+=1;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                count+=1;
            }
            ans[i] = count;
        }
        return ans;
    }
}
