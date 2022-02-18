package com.test.scaler.array.interviewques;

import java.util.Arrays;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 4, 11, 9);
        List<Integer> arrB = Arrays.asList(1, 3, 2, 6, 2);
        int cost = 0, ans = Integer.MAX_VALUE;
        int n = arr.size();

        for (int j = 2; j <= n - 1; j++) {
            int tempSum = arrB.get(j), value_i = Integer.MAX_VALUE, value_k = Integer.MAX_VALUE;
            for (int i = j - 1; i >= 1; i--) {
                if (arr.get(i) < arr.get(j) && arrB.get(i) < value_i)
                    value_i = arrB.get(i);
            }
            for (int k = j + 1; j < n; k++) {
                if (arr.get(k) > arr.get(j) && arrB.get(k) < value_k)
                    value_k = arrB.get(k);
            }
            if (value_i != Integer.MAX_VALUE && value_k == Integer.MAX_VALUE) {
                tempSum = tempSum + value_i + value_k;
                ans = Integer.min(ans, tempSum);
            }
            System.out.println("temp sum -->" + tempSum + " ans ->" + ans);
        }
        System.out.println(ans);
    }

}
