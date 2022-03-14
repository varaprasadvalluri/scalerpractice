package com.test.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class GetSum {
    public static void main(String[] args) {
        int n = 5, k = 5;
        int[] arr = {1, 2, 2, 3, 3};
        System.out.println("sum is -->" + getSum(n, k, arr));
    }

    public static int getSum(int A, int B, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.get(i) != null ? map.get(i) + 1 : 1);
        int sum = 0;
        boolean isVisited = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == B) {
                sum += entry.getKey();
                isVisited = true;
            }
        }
        if (isVisited == false) return -1;
        return (int) sum % (7 + 10 ^ 9);
    }
}
