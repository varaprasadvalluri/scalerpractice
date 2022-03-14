package com.test.scaler.recursion;

public class PowerSum {
    public static void main(String[] args) {
        int x = 2, n = 3, d = 3;
        System.out.println("pwer -->" + pow(x, n, d));
    }

    public static int pow(int A, int B, int C) {
        if (A == 0) return 0;
        if (B == 0) return 1;
        long halfPow = (long) pow(A, B / 2, C) % C;
        long halfRes = ((halfPow % C) * (halfPow % C)) % C;
        if (B % 2 == 0) return (int) halfRes;
        return (int) (((halfRes * (A % C)) % C + C) % C) % C;
    }
}
