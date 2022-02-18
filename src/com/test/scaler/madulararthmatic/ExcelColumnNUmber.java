package com.test.scaler.madulararthmatic;

import java.util.Arrays;

public class ExcelColumnNUmber {
    public static void main(String[] args) {
        String A = "AB";
        int ans = 0;
        int r = 1;
        for (int i = A.length() - 1; i >= 0; i--) {
            ans += r * (A.charAt(i) - 'A' + 1);
            r *= 26;
        }
        System.out.println("ans ->" + ans);
    }
}
