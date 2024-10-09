package leetcode;

import java.util.Stack;
//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid
public class MinAddsToMakeParenthesisValid {
    public static void main(String[] args) {
        MinAddsToMakeParenthesisValid minAddsToMakeParenthesisValid = new MinAddsToMakeParenthesisValid();
        System.out.println(minAddsToMakeParenthesisValid.minAddToMakeValid("()))(("));
    }
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && ch == ')' && stk.peek()=='('){
                stk.pop();
                continue;
            }
            stk.push(ch);
        }
        return stk.size();
    }
}
