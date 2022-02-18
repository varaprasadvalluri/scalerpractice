package com.test.scaler.bitwise;

public class UnsignedInt {

    public static void main(String[] args) {
        int n = 3;
        int l = 0, r = 31, ans = 0;
        while (l < 32 && r >= 0) {
            if ((n & (1 << l)) != 0) {
                ans |= (1 << r);
            }
            l++;
            r--;
        }
        System.out.print(ans);

    }
}
