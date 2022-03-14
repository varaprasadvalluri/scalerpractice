package com.test.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class ShaggyandDistance {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                min = Math.min(min, Math.abs(i - map.get(arr[i])));
            } else
                map.put(arr[i], i);
        }
        System.out.println("min -->" + min);


    }
}
