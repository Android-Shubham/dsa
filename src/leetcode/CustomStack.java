package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/design-a-stack-with-increment-operation/?envType=daily-question&envId=2024-09-30
class CustomStack {

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        customStack.pop();
        customStack.push(3);
    }
    int[] stack;
    int index;
    int max;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        Arrays.fill(stack,-1);
        index = 0;
        max = maxSize;
    }
    
    public void push(int x) {
        if(index<max){
            stack[index++] = x;
        }
        //System.out.println(Arrays.toString(stack));
    }
    
    public int pop() {
        //System.out.println(index);
        if(index==0) return -1;
        int val = stack[--index];
        //System.out.println(val);
        stack[index] = -1;
        return val;
    }
    
    public void increment(int k, int val) {
        int upper = Math.min(index,k);
        for(int i=0;i<upper;i++){
            stack[i] = stack[i] + val;
        }
    }
}