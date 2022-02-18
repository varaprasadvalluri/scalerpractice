package com.test.scaler.bitwise;

import java.util.Arrays;

public class BitExArray {
    public static void main(String[] args) {
        int[] arr = {9, 17};
//        for (int i = 0; i < arr.length; i++) {
            int merg = arr[0] ^ arr[1];
            System.out.println(merg);
            int d = merg / 2;
            System.out.println(d);
//        }

    }
}
