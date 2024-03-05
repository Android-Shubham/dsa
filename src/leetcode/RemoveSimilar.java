package leetcode;

public class RemoveSimilar {

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(minimumLength("bbbbbbbbbbbbbbbbbbb"));
    }

    public static int minimumLength(String s) {
        int len = s.length();
        if(len==0 || len==1){
            return len;
        }
        int b=0,e=len-1;
        char[] charArr = s.toCharArray();
        while(b<=e){
            char start = charArr[b];
            char end = charArr[e];
            if(b==e){
                return 1;
            }
            if(start!=end){
                return e - b +1;
            }
            while( b<e && charArr[b+1] == start){
                b++;
            }
            while( b<e && charArr[e-1] == end){
                e--;
            }
            b++;
            e--;
        }
        return 0;
    }
}
