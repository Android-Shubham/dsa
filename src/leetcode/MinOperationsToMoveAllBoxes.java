package leetcode;

public class MinOperationsToMoveAllBoxes {
    public int[] minOperations_bruteforce(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i!=j && boxes.charAt(j)!='0'){
                    count+=Math.abs(j-i);
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        int count = boxes.charAt(0)-'0';
        for(int i=1;i<n;i++){
            left[i] = left[i-1] + count;
            count+=boxes.charAt(i)-'0';
        }

        count = boxes.charAt(n-1)-'0';
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] + count;
            count+=boxes.charAt(i)-'0';
        }

        for(int i=0;i<n;i++){
            ans[i] = left[i]+right[i];
        }

        return ans;
    }
}
