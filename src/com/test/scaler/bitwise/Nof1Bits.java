package com.test.scaler.bitwise;

public class Nof1Bits {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        while (n != 0) {
            int d = n % 2;
            System.out.print(d);
            if (d != 0) count++;
            n /= 2;
//            System.out.print("n -->" + n);
        }
//        System.out.println("count -->" + count);
    }
}
