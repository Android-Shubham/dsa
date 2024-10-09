package leetcode;

import java.util.Stack;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid
public class MinAddsToMakeParenthesisValid {
    public static void main(String[] args) {
        MinAddsToMakeParenthesisValid minAddsToMakeParenthesisValid = new MinAddsToMakeParenthesisValid();
        System.out.println(minAddsToMakeParenthesisValid.minAddToMakeValid("()))(("));
        System.out.println(minAddsToMakeParenthesisValid.minAddToMakeValid_withoutStack("()))(("));

    }

    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stk.isEmpty() && ch == ')' && stk.peek() == '(') {
                stk.pop();
                continue;
            }
            stk.push(ch);
        }
        return stk.size();
    }

    public int minAddToMakeValid_withoutStack(String s) {
        int open = 0;
        int minAdds = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    minAdds++;
                }
            }
        }
        return open + minAdds;
    }
}
