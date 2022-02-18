package com.test.scaler.bitwise;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> a1 = Arrays.asList("vara", "Geethanjali");
        List<String> a2 = Arrays.asList("vara", "Geethanjali");
        List<List<String>> arr = Arrays.asList(a1, a2);
//        arr.stream().distinct().flatMap(o-);
        System.out.println(10 + 12 + "javatpoint");
        System.out.println("javatpoint" + 10 + 12);
        List<Integer> lList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) lList.add(i);


        int N = lList.size() - 1;
        int cuIndex = -1, pIndex = -1;
        int count = 0;
        int mid = N / 2;
        System.out.println("mid ->" + mid);
        if (mid % 2 == 0) {
            cuIndex = mid;
        } else {//odd
            cuIndex = mid;
            pIndex = mid + 1;
        }

        System.out.println(cuIndex + " pIndex ->" + pIndex);

        //
        String n = "40897237111816995922805307737859413552091006514927603847883130124746756767426237849396480087733429432861339411285568084588535007444731";
        int ans = 0, r = 1;
        for (int i = n.length() - 1; i >= 0; i--) {
            ans = (ans + n.charAt(i) % 8);
        }
        System.out.println((ans % 8));
        List<Student> lt = new ArrayList<Student>();
        Map<Integer, List<String>> multimap = lt.stream().
                collect(Collectors.groupingBy(Student::getId,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        // print the multiMap
        System.out.println("MultiMap = " + multimap);
        //Leap year
        int leapYear = 2022;
        if (leapYear % 400 == 0) {
            System.out.println("yea is leaf-->");
        }
        if (leapYear % 4 == 0) {

            System.out.println("leap Year of 4 ");
        }

    }
}


class Base {


}