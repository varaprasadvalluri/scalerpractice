package com.test.scaler.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(sumOfDigit(n));
//        System.out.println(sumOfD(n));
    }

    static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int sumOfDigit(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigit(n / 10);
    }
}
