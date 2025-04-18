package leetcode;

public class CountAndSay {
    public String countAndSay(int n) {
        String ans = "";
        for (int i = 1; i <= n; i++) {
            ans = count(ans);
        }
        return ans;
    }

    private String count(String s) {
        int n = s.length();
        if (n == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        char ch = s.charAt(0);
        int i = 0;
        int count = 0;
        while (i <= n) {
            if(i==n){
                sb.append(count).append(ch);
            }
            else if(s.charAt(i) == ch){
                count++;
            }else{
                sb.append(count).append(ch);
                count = 1;
                ch = s.charAt(i);
            }
            i++;
        }
        return sb.toString();
    }
}
