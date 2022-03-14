package com.test.scaler.stacksnqueues;

import java.util.Stack;

public class MinStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(-2);
        System.out.println("min -->" + getMin());
    }

    public static void push(int x) {
        stack1.push(x);
    }

    public static void pop() {
        stack1.pop();
    }

    public static int top() {
        return stack1.peek();
    }

    public static int getMin() {
        int min = Integer.MIN_VALUE;
        while (stack1.isEmpty()) {
            int minValue = Math.min(min, stack1.peek());
            stack2.push(minValue);
            stack1.pop();
        }
        return stack2.peek();
    }
}
