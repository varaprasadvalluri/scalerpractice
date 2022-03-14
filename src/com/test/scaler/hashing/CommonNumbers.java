package com.test.scaler.hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonNumbers {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 2, 1};//
        int[] arrB = {2, 3, 1, 2};
        Map<Integer, Integer> comFrMap = new HashMap<>();
        for (int i = 0; i < arrA.length; i++)
            comFrMap.put(arrA[i], comFrMap.get(arrA[i]) != null ? comFrMap.get(arrA[i]) + 1 : 1);
        List<Integer> comList = new ArrayList<>();
        for (int j = 0; j < arrB.length; j++) {
            Integer num = comFrMap.get(arrB[j]);
            if (num != null && num > 0) {
                comList.add(arrB[j]);
                comFrMap.put(arrB[j], num - 1);
            }
        }
        Collections.sort(comList);
//        comList.stream().filter(p -> {
//            System.out.println(p);
//            return true;
//        });
        System.out.println("comList -->" + comList + " tree Map -->" + comFrMap);

    }
}

//    public void doSomething(List<Person> persons) {
//
//        persons.stream().filter(p -> {
//            System.out.println(p);
//            return true;
//        });
//    }
//
//    main() {
//        doSomething(personsList);
//    }
