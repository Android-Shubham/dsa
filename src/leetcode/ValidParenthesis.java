package leetcode;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("{([])}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int index = 0; index<s.length(); index++){
            char currentChar = s.charAt(index);

            if(currentChar=='('){
                stack.push(')');
            }else if(currentChar=='['){
                stack.push(']');
            }else if(currentChar=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!=currentChar){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
