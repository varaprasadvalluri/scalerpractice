package com.test.scaler.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class RemovalCostSorting {

    public static void main(String[] args) {
        Integer[] array = {8, 0, 10};

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array -->" + Arrays.toString(array));
//        Arrays.sort(arr);
        int cost = 0;
        for (int i = 0; i < array.length; i++)
            cost += array[i] * (i + 1);
        System.out.println("cost -->" + cost);

    }
}
