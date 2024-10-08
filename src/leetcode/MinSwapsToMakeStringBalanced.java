package leetcode;

import java.util.Stack;

public class MinSwapsToMakeStringBalanced {

    public static void main(String[] args) {
        MinSwapsToMakeStringBalanced minSwapsToMakeStringBalanced = new MinSwapsToMakeStringBalanced();
        System.out.println(minSwapsToMakeStringBalanced.minSwapsBruteForce("]]][[["));
    }
    public int minSwapsBruteForce(String s) {
        if(isBalanced(s)){
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        char last = s.charAt(0);
        sb.append(last);
        for(int i=1;i<s.length();i++){
            char cur = s.charAt(i);
            if(last == '[' && cur ==']' && !sb.isEmpty()){
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            last = cur;
            sb.append(cur);
        }

        int swaps = 0;
        int i = 0;
        int j = sb.length()-1;


        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            swaps++;
            if(isBalanced(sb.toString())){
                return swaps;
            }
            i++;
            j--;
        }
        return swaps;
    }

    private boolean isBalanced(String s){
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && ch == ']' && stk.peek() =='['){
                stk.pop();
                continue;
            }
            stk.push(ch);
        }
        return stk.isEmpty();
    }
}
