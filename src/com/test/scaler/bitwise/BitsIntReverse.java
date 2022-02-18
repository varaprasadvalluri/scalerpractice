package com.test.scaler.bitwise;

public class BitsIntReverse {
    public static void main(String[] args) {
        long n = 3;
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;         //shift result left
//            System.out.print("ans -->"+ans);
            if ((n & 1) == 1)    //If (first bit is set) {
            {
                ans += 1;          //   set first bit of result
            }                         //}
            n >>= 1;             //shift number right
        }
        System.out.println("bits -->" + ans);
    }

}
