package leetcode;

import java.util.Stack;

public class MinimumStringLengthAfterRemoving {

    public static void main(String[] args) {
        MinimumStringLengthAfterRemoving minimumStringLengthAfterRemoving = new MinimumStringLengthAfterRemoving();
        System.out.println(minimumStringLengthAfterRemoving.minLength_bruteForce("ABBCBC"));
        System.out.println(minimumStringLengthAfterRemoving.minLength("ABBCBC"));
    }

    //https://leetcode.com/problems/minimum-string-length-after-removing-substrings
    public int minLength(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur == 'B' && !stk.isEmpty() && stk.peek()=='A'){
                stk.pop();
                continue;
            }
            if(cur == 'D' && !stk.isEmpty() && stk.peek()=='C'){
                stk.pop();
                continue;
            }
            stk.push(cur);
        }
        return stk.size();
    }

    public int minLength_bruteForce(String s) {
        char[] chars = s.toCharArray();

        while(true){
            boolean found = false;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='A' && i<chars.length-1 && chars[i+1]=='B'){
                    i++;
                    found = true;
                    continue;
                }
                if(chars[i]=='C' && i<chars.length-1 && chars[i+1]=='D'){
                    i++;
                    found = true;
                    continue;
                }
                sb.append(chars[i]);
            }
            if(!found){
                return sb.length();
            }
            chars = sb.toString().toCharArray();
        }
    }
}
