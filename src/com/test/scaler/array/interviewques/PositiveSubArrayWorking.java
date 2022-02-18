package com.test.scaler.array.interviewques;

import com.test.scaler.practces2D.Print2DMatrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PositiveSubArrayWorking {
    public static void main(String[] args) {
        int[] arr = {5, 6, -1, 7, 8};
        int maxLen = Integer.MIN_VALUE;
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] >= 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                    pairs.put(i, j);
                } else break;
            }
        }
        System.out.println("pairs -->" + pairs);
        int startKey = 0, endKey = 0, pvsDis = 0;
        for (Map.Entry<Integer, Integer> p : pairs.entrySet()) {
            int key = p.getValue();
            int value = p.getKey();
            int distance = key - value;
            if (distance + 1 == maxLen) {
                startKey = p.getKey();
                endKey = p.getValue();
                break;
            }
        }
        System.out.println("startKey " + startKey + " endKey -->" + endKey);
        int[] ans = new int[maxLen];
        int i = 0;
        while (startKey <= endKey) {
            ans[i] = arr[startKey];
            startKey++;
            i++;
        }

        Print2DMatrix.print1D(ans);
    }

}
