package com.test.scaler.recursion;

public class OutPutRec2 {
    public static void main(String[] args) {
        int ans = fun(2, 10);
        System.out.println(ans);
    }

    private static int fun(int x, int n) {
        if (n == 0) return 1;
        else if (n % 2 == 0) return fun(x * x, n / 2);
        else return x * fun(x * x, (n - 1) / 2);
    }
}
