package com.test.scaler.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberCompar {
    public static void main(String[] args) {
        Integer[] arr = {3, 30, 34, 5, 9};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                long v1 = Long.parseLong(String.valueOf(o1 + o2));
                long v2 = Long.parseLong(String.valueOf(o2 + o1));
                if (v1 <= v2) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
