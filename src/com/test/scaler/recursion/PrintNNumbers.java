package com.test.scaler.recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        printN(5);
    }

    private static void printN(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printN(n - 1);
        System.out.print(n);
    }
}
