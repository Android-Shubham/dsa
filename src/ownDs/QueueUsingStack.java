package ownDs;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 500;
        Integer d = 500;

        if(a == b){
            System.out.println("a = b");
        }

        if( c == d){
            System.out.println("c = d");
        }
    }
}

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}