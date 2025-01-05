package leetcode;

public class ShiftingLetters2 {
    public String shiftingLetters_bruteforce(String s, int[][] shifts) {
        char[] chars = s.toCharArray();
        for(int[] shift : shifts){
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            if(dir == 1){
                for(int i=start;i<=end;i++){
                    if(chars[i] == 'z'){
                        chars[i] = 'a';
                    }else{
                        chars[i] = (char)(chars[i]+1);
                    }
                }
            }else{
                for(int i=start;i<=end;i++){
                    if(chars[i] == 'a'){
                        chars[i] = 'z';
                    }else{
                        chars[i] = (char)(chars[i]-1);
                    }
                }
            }
        }
        return new String(chars);
    }
}
