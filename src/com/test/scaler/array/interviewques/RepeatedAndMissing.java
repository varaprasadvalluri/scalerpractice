package com.test.scaler.array.interviewques;

import java.util.*;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(50);
        int n = arr.size();

        int total = n * (n - 1) / 2;
        int sum = arr.stream().mapToInt(i -> i).sum();
        System.out.println("missing number is -->" + (sum - total));
        Collections.sort(arr);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            int i = it.next();
            int found = arr.lastIndexOf(i);
            System.out.println("found -->" + found);
            if (i != (it.hasNext() ? it.next() : -1)) {
                System.out.println("remove Object -->" + i);
                it.remove();
            }
        }

        System.out.println("arr -->" + arr);
    }
}
