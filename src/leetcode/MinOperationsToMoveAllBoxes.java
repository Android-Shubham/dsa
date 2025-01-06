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
}
