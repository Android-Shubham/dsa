package leetcode;

public class ExecuteAllSuffixInstructions {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[][] grid = new int[n][n];
        int m = s.length();
        int[] res = new int[m];
        for(int i=0;i<m;i++){
            int count = 0;
            int j = i;
            int row = startPos[0];
            int col = startPos[1];
            while(j<m){
                char cur = s.charAt(j);
                if(cur=='R'){
                    col++;
                    if(col>=n || col<0){
                        break;
                    }
                    count++;
                }else if(cur=='D'){
                    row++;
                    if(row>=n || row<0){
                        break;
                    }
                    count++;
                }else if(cur=='L'){
                    col--;
                    if(col>=n || col<0){
                        break;
                    }
                    count++;
                }else{
                    row--;
                    if(row>=n || row<0){
                        break;
                    }
                    count++;
                }
                j++;
            }
            res[i] = count;
        }
        return res;
    }
}
