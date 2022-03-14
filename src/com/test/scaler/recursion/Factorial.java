package com.test.scaler.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("fact -->"+factorila(4));
    }

    private static int factorila(int n) {
        if (n == 1) return 1;
        return n * factorila(n - 1);
    }
}
