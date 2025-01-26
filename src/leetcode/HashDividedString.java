package leetcode;

public class HashDividedString {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i+=k){
            String sub = s.substring(i,i+k);
            int num = 0;
            for(int j=0;j<k;j++){
                num+=(sub.charAt(j)-'a');
            }
            num%=26;
            sb.append((char)('a'+num));
        }
        return sb.toString();
    }
}
