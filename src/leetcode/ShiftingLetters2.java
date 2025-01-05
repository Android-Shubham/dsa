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


    //line sweep
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int[] arr = new int[n];
        for(int[] shift : shifts){
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            if(dir == 1){
                arr[start]++;
                if(end+1<n){
                    arr[end+1]--;
                }
            }else{
                arr[start]--;
                if(end+1<n){
                    arr[end+1]++;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = (sum+arr[i])%26;
            if(sum<0){
                sum+=26;
            }
            chars[i] = (char)('a'+(chars[i]-'a'+sum)%26);
        }
        return new String(chars);
    }
}
