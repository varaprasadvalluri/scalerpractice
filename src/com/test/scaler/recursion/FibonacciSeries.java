package com.test.scaler.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("series -->" + fib(4));
        System.out.println("seris in TOP down -->" + fibTopDown(4, new int[4 + 1]));
    }

    private static int fib(int n) {
        if (n == 1 || n == 0) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // with dynamic programing with top-down
    private static int fibTopDown(int n, int[] memo) {
        if (n == 1 || n == 0) return n;
        if (memo[n] == 0) memo[n] = fibTopDown(n - 1, memo) + fibTopDown(n - 2, memo);
        return memo[n];
    }
}
