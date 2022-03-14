package com.test.scaler.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = k - arr[i];
            if (set.contains(sum))
                System.out.println("sum -->" + sum);
            else set.add(arr[i]);
        }

    }
}
