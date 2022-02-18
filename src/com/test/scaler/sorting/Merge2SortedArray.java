package com.test.scaler.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
        Map<Integer, Boolean> map = new TreeMap<>();
        for (int i : a) map.put(i, true);
        for (int j : b) map.put(j, true);
        System.out.println("map -->" + map);
        //anther case using extra space
        List<Integer> listA = Arrays.asList(1, 2, 3, 4);//Input A
        List<Integer> listB = Arrays.asList(2, 3, 7);//Input B
        List<Integer> ansList = new ArrayList<>();
        ansList.addAll(listA);
        ansList.addAll(listB);
        Collections.sort(ansList);
//        List<Integer> finalList = ansList.stream().sorted().collect(Collectors.toList());
        System.out.println("ansList ->" + ansList);
    }
}
