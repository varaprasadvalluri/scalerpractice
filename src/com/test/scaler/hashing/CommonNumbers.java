package com.test.scaler.hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonNumbers {
    public static void main(String[] args) {
        int[] arrA = {2, 1, 4, 10};
        int[] arrB = {3, 6, 2, 10, 10};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arrA.length; i++) {
//            if (map.containsKey(arrA[i])) map.put(arrA[i], map.get(arrA[i] + 1));
            map.put(arrA[i], arrA[i]);
        }

        List<Integer> comList = new ArrayList<>();
        for (int j = 0; j < arrB.length; j++) {
            Integer commonVal = map.get(arrB[j]);
            System.out.println("common ->" + commonVal + " fr ->" + arrB[j]);
            if (commonVal != null) {
                System.out.println("common ->" + commonVal);
                comList.add(commonVal);
            }
        }
//        Collections.sort(comList);
        System.out.println("sorted -->" + comList);

    }
}
