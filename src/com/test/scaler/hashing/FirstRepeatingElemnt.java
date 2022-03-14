package com.test.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElemnt {
    public static void main(String[] args) {
        Map<Integer, Integer> frqMap = new HashMap<>();
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        for (int i = 0; i < arr.length; i++) frqMap.put(i, frqMap.get(i) != null ? frqMap.get(i) + 1 : 1);
        for (int i = 0; i < arr.length; i++) {
            int key = frqMap.get(arr[i]);
            if (key > 1) System.out.println("first non ->" + arr[i]);
        }

    }
}
