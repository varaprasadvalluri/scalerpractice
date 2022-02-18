package com.test.scaler.array.interviewques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AltranatingSubArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 0, 0, 1, 1, 0, 1);
        List<Integer> ans = new ArrayList<>();
        int B = 0;
        int k = 2 * B + 1;
        for (int i = 0; i <= arr.size() - k; i++) {
            boolean isValid = false;
            for (int j = i + 1; j <= i + k - 1; j++) {
                if (arr.get(j) == arr.get(j - 1)) isValid = true;
            }
            if (isValid == false) {
                int mid = (i + (i + k - 1)) / 2;
//                int mid = i + B;
                ans.add(mid);
            }
        }
        System.out.println("arr -->" + ans);
    }
}
