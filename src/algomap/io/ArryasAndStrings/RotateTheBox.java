package algomap.io.ArryasAndStrings;

public class RotateTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        for (int i = 0; i < n; i++) {
            int swapPos = -1;
            for (int j = m - 1; j >= 0; j--) {
                char ch = box[i][j];
                if (ch == '#') {
                    if (j != swapPos && swapPos>=0) {
                        char temp = box[i][j];
                        box[i][j] = box[i][swapPos];
                        box[i][swapPos] = temp;
                    }
                    swapPos--;
                } else if (ch == '*') {
                    swapPos = j - 1;
                } else {
                    if(swapPos<0){
                        swapPos = j;
                    }
                }
            }
        }

        char[][] ans = new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][i] = box[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                char temp = ans[i][j];
                ans[i][j] = ans[i][n-j-1];
                ans[i][n-j-1] = temp;
            }
        }
        return ans;
    }
}
