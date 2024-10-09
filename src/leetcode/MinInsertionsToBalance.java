package leetcode;

import java.util.Stack;

//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string
public class MinInsertionsToBalance {

    public static void main(String[] args) {
        MinInsertionsToBalance minInsertionsToBalance = new MinInsertionsToBalance();
        System.out.println(minInsertionsToBalance.minInsertions(")))))))"));
    }

    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        count += 2 * stack.size();
        return count;
    }
}
