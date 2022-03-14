package com.test.scaler.recursion;

public class OutputRecursion1 {
    public static void main(String[] args) {
        System.out.println(foo(3, 5));
    }

    static int bar(int x, int y) {
        System.out.println("second ");
        if (y == 0) return 0;
        return x + bar(x, y - 1);
    }

    static int foo(int x, int y) {
        System.out.println("first");
        if (y == 0) return 1;
        return bar(x, foo(x, y - 1));//3, -->
    }
}
