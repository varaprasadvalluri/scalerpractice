package com.test.scaler.hashing;

import java.util.HashSet;
import java.util.Set;

public class SumEqaulsZero {
    public static void main(String[] args) {
        int[] arr = {96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62};
        long[] prefSum = new long[arr.length];
        for (int i : arr) if (i == 0) System.out.println("sum is zero in array ");
        Set<Long> set = new HashSet<>();
        prefSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) prefSum[i] = prefSum[i - 1] + arr[i];
        for (long l : prefSum) if (l == 0L) System.out.println("sum is zero ");
        for (long s : prefSum)
            if (set.contains(s)) System.out.println("sum is zero");
            else set.add(s);
    }
}
